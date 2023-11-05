package ExcelP;

import Model.MySQLConnection;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author hecto
 */
public class Report {

    public void report() {

        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Producto");

        try {
            InputStream is = new FileInputStream("C:\\Users\\hecto\\Desktop\\imagesProject\\cleaningproduct100x100.png");
            byte[] bytes = IOUtils.toByteArray(is);
            int inmIndex = book.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
            is.close();

            CreationHelper help = book.getCreationHelper();
            Drawing draw = sheet.createDrawingPatriarch();

            ClientAnchor anchor = help.createClientAnchor();
            anchor.setCol1(0);
            anchor.setCol1(1);
            Picture pict = draw.createPicture(anchor, inmIndex);
            pict.resize(1, 3);

            CellStyle tituloEstilo = book.createCellStyle();
            tituloEstilo.setAlignment(HorizontalAlignment.CENTER);
            tituloEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
            Font font = book.createFont();
            font.setFontName("Arial");
            font.setBold(true);
            font.setFontHeightInPoints((short) 14);
            tituloEstilo.setFont(font);

            Row row = sheet.createRow(1);
            Cell cell = row.createCell(1);
            cell.setCellStyle(tituloEstilo);
            cell.setCellValue("Product rep");

            sheet.addMergedRegion(new CellRangeAddress(1, 2, 1, 3));

            String[] cabecera = new String[]{"ID", "Name", "Price", "Category", "Stock"};

            CellStyle headerStyle = book.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            headerStyle.setBorderBottom(BorderStyle.THIN);
            headerStyle.setBorderLeft(BorderStyle.THIN);
            headerStyle.setBorderRight(BorderStyle.THIN);
            headerStyle.setBorderBottom(BorderStyle.THIN);

            Font f = book.createFont();
            f.setFontName("Arial");
            f.setBold(true);
            f.setColor(IndexedColors.WHITE.getIndex());
            f.setFontHeightInPoints((short) 12);
            headerStyle.setFont(f);

            Row filaEncabezados = sheet.createRow(4);

            for (int i = 0; i < cabecera.length; i++) {
                Cell celdaEncabezado = filaEncabezados.createCell(i);
                celdaEncabezado.setCellStyle(headerStyle);
                celdaEncabezado.setCellValue(cabecera[i]);

            }

            MySQLConnection con = new MySQLConnection();
            PreparedStatement pst;
            ResultSet rs;
            Connection c = con.getConnection();

            int filadatos = 5;

            CellStyle datosE = book.createCellStyle();
            datosE.setBorderBottom(BorderStyle.THIN);
            datosE.setBorderLeft(BorderStyle.THIN);
            datosE.setBorderRight(BorderStyle.THIN);
            datosE.setBorderBottom(BorderStyle.THIN);

            pst = c.prepareStatement("SELECT * FROM producto");
            rs = pst.executeQuery();
            int numC = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Row filaD = sheet.createRow(filadatos);
                for (int i = 0; i < numC; i++) {
                    Cell celdaD = filaD.createCell(i);
                    celdaD.setCellStyle(datosE);

                    if (i == 0 || i == 2) {
                        celdaD.setCellValue(rs.getInt(i + 1));
                    } else if (i == 1 || i == 3) {
                        celdaD.setCellValue(rs.getString(i + 1));
                    } else if (i == 4) {
                        celdaD.setCellValue(rs.getBoolean(i + 1));
                    }
                }

                filadatos++;
            }

            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);
            sheet.autoSizeColumn(4);

            FileOutputStream fileout = new FileOutputStream("productReport.xlsx");
            book.write(fileout);
            fileout.close();

        } catch (Exception s) {
            System.out.println("");
        }

    }

}
