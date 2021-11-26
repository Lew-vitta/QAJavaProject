# QAJavaProject - SkateXut

This is my final project for the QA Software Development Bootcamp. This project is a full CRUD functional api written in Spring. To demonstrate the Java skills learnt in the final weeks of the course.

SkateXut is designed to be a shop interface for Creating, Reading, Updating, and Deleting products. With attributes such as Barcode, Name, Colour, Dimentions, Descriptions. Which will store persistent values using H2 database. This information can be relayed via the Java/SpringBoot backend. With a .jar included. Which can be run locally, and make use of port 8080 to be used for API - Requests can be made via Postman, screenshots provided below


any dependencies it might need/build




--------------------------------------------

## postman

To test the functionality of my API we can use api as such. When the program is running our base URL is http://localhost:8080/ and we append the functionality as seen in the pictures below:

Here I'm adding a new product and all of it's properties.
![postman add product](/Documentation/postman1.png)
This Query allows you to search a barcode of a product, and return all of it's properties
![postman read by barcode](/Documentation/postman2.png)
This Query allows you to search the name of a product, and return all of it's properties
![postman read by name](/Documentation/postman3.png)
This Query allows you to return all products, and return all of their properties
![postman read all](/Documentation/postman4.png)
This Query allows you to update all the properties via a barcode of a product. We can see on the following it has updated the product
![postman update product](/Documentation/postman5.png)
![postman read all](/Documentation/postman6.png)
This Query allows a product to be deleted via it's barcode, once again you can see below the updated readall, and the product has been removed. You can't sell a board with paint in the bearings :(
![postman delete product](/Documentation/postman7.png)
![postman read all](/Documentation/postman8.png)


##database

Here once the program is restarted we can see the products are still avaliable just as we left them, this is because we defined a file within the project so store data persistently
![Database Persistence](/Documentation/SQL1.png)



ERD




--------------------------------------------

Expectation


What went well/not well


Improvements
