# Spring-Boot-Udemy-Course

- Udemy course link - https://www.udemy.com/course/spring-boot-tutorial-for-beginners/?couponCode=OF52424
- Java version - 22
- Spring Boot version - 3.3.0
- Git course link - https://github.com/in28minutes/spring-boot-master-class
- Git section 3 link - https://github.com/in28minutes/spring-boot-master-class/tree/master/02.Spring-Boot-Web-Application-V2

## Things learned:
### Section 2
- we can have multiple application.properties files -> the default one is where we swap from 1 profile configuration to another
- we can also use classes for adding configuration
- there is a dependency called Actuator that exposes health & metrics information about the app

### Section 3
- an older version of the "view" from MVC is the .jsp file -> this can be sent if we use @Controller instead of @RestController and also if we don't have a @RequestBody added to the endpoint
- getting a better understanding on how to work with .jsp files and how to bind variables with them
- jsp.jstl tags can be used for formating data inside the jsp file (it provides the same functionality as the directives from Angular, ex: ngFor -> for jp will be c:forEach). Before using this, we need to add the dependency inside pom.xml
- adding css files works just how it does with .html files, by adding a link href="" tag a the top of the .jsp file
- it is possible to use boostrap in .jsp as well just like with the .html files
- link for jsp form tags - https://www.javatpoint.com/spring-mvc-form-tag-library
- in order to call another request from the controller you have to use "redirect:" before the request that is called
- .jspf files -> fragments
- Spring Security -> for storing user data (ex: password) we can use a database or LDAP

### Section 6 - maven
- pom.xml is where all the project dependencies are specified -> this dependencies will be downloaded localy
- some dependencies have more dependencies -> in ordser to see all of them we can check the "effective pom"
- MVN commands
  - mvn --version
  - mvn compile -> compile source files;
  - mvn test-compile -> compile source files and test files;
  - mvn clean -> delete target directory;
  - mvn test -> run unit tests;
  - mvn package -> create jar;
  - mvn help:effective-pom;
  - mvn depencency:tree;
- version scheme -> MAJOR.MINOR.PATCH[-MODIFIER]
  - Major: significant amount of wakr to upgradede (from 10.0.0 to 11.0.0);
  - Minor: little to no work to upgrade (from 10.1.0 to 10.2.0);
  - Patch: no work to upgrade (from 10.5.4 to 10.5.5);
  - Modifier: optional modifier;
