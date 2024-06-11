# Spring-Boot-Udemy-Course

Udemy course link - https://www.udemy.com/course/spring-boot-tutorial-for-beginners/?couponCode=OF52424
Java version - 22
Spring Boot version - 3.3.0

## Things learned:
### Section 2
- we can have multiple application.properties files -> the default one is where we swap from 1 profile configuration to another
- we can also use classes for adding configuration
- there is a dependency called Actuator that exposes health & metrics information about the app

### Section 3
- an older version of the "view" from MVC is the .jsp file -> this can be sent if we use @Controller instead of @RestController and also if we don't have a @RequestBody added to the endpoint
- getting a better understanging on how to work with .jsp files and how to bind variables with them
- jsp.jstl tags can be used for formating data inside the jsp file (it provides the same functionality as the directives from Angular, ex: ngFor -> for jp will be c:forEach). Before using this, we need to add the dependency inside pom.xml
- adding css files works just how it does with .html files, by adding a link href="" tag a the top of the .jsp file
