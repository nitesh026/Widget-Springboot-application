# Widget-Springboot-application
 Widget curd application

 Steps to buils and run application

 1. create my-sql database widgets
 2. database access password need to update correctly
 3. Build the application with below command
    mvn clean install

 4. Deploy the jar file in server and start the application with below command
    java -jar widget-springfboot-applicaation
5. Open the postman and hit the below end points , Port need to update in application.properties file
    1. http://localhost:8080/v1/createWidget
    2. http://localhost:8080/v1/getWidgetByName/Laptop
    3. http://localhost:8080/v1/deleteWidget/Laptop
    4. http://localhost:8080/v1/updateWidget
    5. http://localhost:8080/v1/getAllWidgets

Note: Postman import file attached to hit the request. 
 
