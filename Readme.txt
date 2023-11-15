Store System Management | Cleaning Store

First off in order to run this project you have to follow these steps.

1- First add the database that its on the repository to yours and import it.

2- Next will be setting the host, username and password in the java project (Model\MySQLConnection) there you have to change it for yours to make the connection to the database.

3- Once the project runs it will ask you a username and password, those data are already in username table in this case the default one will be "hector" and passwrord "12345" Note: If you want to add different users you can change it on the username table.

4- In case you want to see the login connections there is a table in the database called login where it will show the connections comming along with the username,day with specific hour and the login_id (primay key of the table).

5- In the product view if you press the excel button it will save an excel file in the project file which will contain all the products whether they are out of stock or not.

6- In order to make the purchase in the new sale view go to there and fill the blanks in this order 
	1 - first add the product by clicking the magnifier button 
	2- Then set the quantity 
	3 - next add it by clicking the save button 
	4- It will be showing on the table 
	5- Type the id customer and then click the magnifier button to shot the customer name
	6- Then type the id seller and fill the number sell which this has to be different from the others 
	7 - last step click the print button so it can be save in your database.
        8- Once you make the purchase in the pdf folder will be created a pdf which contains all the data of the sell.