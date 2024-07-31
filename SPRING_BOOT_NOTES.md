re### What is JAR file?
- JAR stands for Java ARchive
- JAR is a package file format typically used to aggregate many Java class files and associated metadata and resources (text, images, etc.) into one file to distribute application software or libraries on the Java platform
- JAR files are built on the ZIP file format and have the .jar file extension
- JAR files are fundamentally ZIP files with a different extension
- JAR files are used to distribute Java classes and associated metadata
- JAR files are used to distribute Java libraries
- JAR files are used to distribute Java applications
- JAR files are used to distribute Java applets
- JAR files are used to distribute JavaBeans
- JAR files are used to distribute Java Servlets
- JAR files are used to distribute Java Server Pages (JSPs)

### Spring Boot and Maven
- When you create a new Spring Boot project using the Spring Initializr
  - It can generate a Maven project for you

### What is Maven?
- Maven is project management tool
- Most popular use of Maven is for build management and dependencies

### What problem does Maven actually solve?
- When you build a Java project, you may need additional JAR files
  - For example, Spring, Hibernate, Commons Logging, JSON, etc.
- One approach is to download these JAR files manually and add them to your project and build path / classpath
- My project withouth Maven - Let's suppose my super cool app, And I need Spring, Hibernate, Commons logging, JSON jar files so I will download these jar files and add them to my project and build path / classpath
- Maven solution - Maven can automatically download these JAR files for you
  - You just need to specify the dependencies in a file called pom.xml
  - Maven will download the JAR files from the internet and add them to your project
  - You don't need to download the JAR files manually
  - You don't need to add the JAR files to your project
  - You don't need to worry about the version conflicts
- And Maven will make those JAR files available during compile / run
- My project with Maven - Let's suppose my super cool app, And I need Spring, Hibernate, Commons logging, JSON jar and so on JAR files so I will specify these dependencies in a file called pom.xml and Maven will download these JAR files from the remote and add them to my project and make them available during compile / run
- Handling JAR dependencies - When Maven retrieves a project dependency
  - It will also download the supporting dependencies
  - This is called transitive dependencies
  - Example: Spring depends on Commons Logging
- Maven will handle it automagically for you
- When you build and run your app, Maven will handle class / build path for you.
- Based on config file, Maven will add JAR files to your project accordingly

### Maven - How it works?
1. Project config file - pom.xml
2. check local repo of Maven local repository / local cache
3. If not found, download from Maven Central Repository - remote repo
4. Save to local repo with version
5. And then maven will use that to build and run your project

### Maven directory structure
- src/main/java - Java source files
- src/main/resources - properties files, Configuration files used by apps
- src/main/webapp - web application resources - JSP files, web configuration files, other web assets(css, js, images)
- src/test - Unit testing code and properties
- target - Destination directory for compiled code. automatically created by Maven

### Advatages of Maven
- dependency management
  - Maven will find and download the JAR files for you
  - You don't need to download the JAR files manually
  - No more missing JAR files
- Building and Running your project
  - no more classpath and build path issues
- Standard directory structure
  - Maven enforces a standard directory structure
  - src/main/java, src/main/resources, src/test/java, src/test/resources

### My Personal Maven Benefits
- Once you understand Maven, you can join a new project and be productive quickly
- You can build and run a project with minimal local configuration

### Maven key concepts
1. POM.xml
  - Project Object Model file
  - Contains project configuration
  - Basically, it contains the project coordinates and dependencies, "Shopping List"
  - located in the root directory of the project
  - Project metadata - Project name, version, description, developers, Output file type - JAR, WAR, etc.
  - dependencies - List of projects we depend on - Spring, Hibernate, etc.
  - plugins - Maven plugins - for building, testing, etc.
2. Project Coordinates - GroupId, ArtifactId, Version(GAV)
   - GroupId - Group or organization that the project belongs to
   - ArtifactId - Name of the project
   - Version - Version of the project
   - Like GPS coordinates for a place
   - Example: GroupId: com.in28minutes, ArtifactId: spring-boot-examples, Version: 0.0.1-SNAPSHOT
3. Dependency Coordinates
   - GroupId, ArtifactId, Version
   - Example: GroupId: org.springframework, ArtifactId: spring-core, Version: 5.1.4.RELEASE
   - Version is optional but recommended

### How to find Dependency Coordinates?
1. Visit the project page - spring.io, hibernate.org, etc.
2. Visit https://central.sonatype.org/ - Maven Central Repository

### Maven wrapper files
- Maven wrapper files allow you to run Maven without installing it
- No need to have Maven installed or present on your path
- If correct version of Maven is not installed, it will download it for you automatically
- Two files
  - mvnw - Maven wrapper for Unix
  - mvnw.cmd - Maven wrapper for Windows
- If you already installed Maven then you can ignore / delete these files
- if you are using Maven wrapper files, you can run Maven commands like this
  - `./mvnw clean install`
  - `./mvnw spring-boot:run`
  - `./mvnw clean compile test`
- If maven already installed then you can run Maven commands like this
  - `mvn clean install`
  - `mvn spring-boot:run`
  - `mvn clean compile test`

### Maven POM file - pom.xml
- pom.xml includes info that you entered in Spring Initializr
- pom.xml includes dependencies that you entered in Spring Initializr
- For example, Spring Boot Starter Web, Spring Boot DevTools, Lombok, Spring Boot Starter Test
- includes spring-boot-maven-plugin - used for excutable JAR or WAR file and can easily run your application
- `./mvnw package` - will create a JAR file in the target directory
- `./mvnw spring-boot:run` - will run your application

### Java source code
- main spring boot application class - `@SpringBootApplication` annotation - created by Spring Initializr
- RestController class - that we created for our REST API

### Application properties - `application.properties` file
- Contains configuration for your application
- For example, server port, database connection details, etc.
- Spring Boot will automatically read this file and apply the configuration
- You can override the configuration in `application.properties` file using command line arguments
- For example, `java -jar target/spring-boot-rest-api-0.0.1-SNAPSHOT.jar --server.port=8081`
- Read data from `application.properties` file using `@Value` annotation. example - `@Value("${welcome.message}")`

### Static content - `src/main/resources/static` directory
- Contains static content like HTML, CSS, JS files
- Spring Boot will automatically serve these files
- By default, Spring Boot will serve static content from `/static` directory
- For example, `src/main/resources/static/index.html` will be available at `http://localhost:8080/index.html`

### Warning - `src/main/webapp` directory - Do not use this directory
- if your application packaging is JAR, then `src/main/webapp` directory will not be used
- Although it is a standard maven directory in a WAR project, it will not be used in a JAR project
- Beacuse it is siliently ignored by most build tools if you are packaging as JAR
- your many hours of hard work will be wasted if you use `src/main/webapp` directory in a JAR project

### Templates - `src/main/resources/templates` directory
- Spring Boot includes auto-configuration for Thymeleaf, FreeMarker, and Mustache temoplate engines

### Unit Tests - `src/test/java` directory
- Spring boot unit test class created by Spring Initializr
- `@SpringBootTest` annotation - will start the Spring application context

### Spring boot starters
- The problem is Building Spring app is complex and really hard. You need to add a lot of dependencies
  - Which Maven dependencies do I need?
  - It is hard because you need to know which dependencies to add
- Solution is Spring boot starters
- A curated list of dependencies that you can add to your project
- A collection of related dependencies grouped together
- Tested and verified by Spring Development team
- Makes it easier for the developers to get started with Spring
- Reduces the amount of maven configurations
- For example, `spring-boot-starter-web` includes all the dependencies you need to build a web application
- In Spring Initializr, you selected Spring Boot Starter Web, Spring Boot DevTools, Lombok, Spring Boot Starter Test
- And it will add in `pom.xml` file

### What is in the starters?
- View the starter's dependencies in the `pom.xml` file
- For example, `spring-boot-starter-web` includes
  - spring-boot-starter
  - spring-boot-starter-json
  - spring-boot-starter-tomcat
  - spring-web
  - spring-webmvc
  - etc.
- In IDE like Eclipse, you can view the dependencies in the Maven Dependencies folder
- In VS Code, you can view the dependencies in the External Libraries folder

### Spring Boot starter parent
- The parent of all Spring Boot starters is `spring-boot-starter-parent`
- It provides default configurations for your project - Java version, encoding, etc.
- It also provides dependency management - versions of dependencies
- This is special starter that provides Maven defaults
- Maven defaults defined int the starter parent
  - Java version
  - Encoding
  - Plugin versions
  - Dependency versions
- To override the default configurations, you can specify the properties in your `pom.xml` file
  - For example, `<java.version>17</java.version>` in the `pom.xml` file under `<properties>` tag
- for `spring-boot-starter-*` dependencies, you don't need to specify the version, Inherit from `spring-boot-starter-parent`
- default configurations of spring bott plugin
  - `spring-boot-maven-plugin` - used for excutable JAR or WAR file and can easily run your application

### Benefits of Spring Boot Starter Parent
- Default maven configurations - Java version, encoding, etc.
- Dependency management
  - Use version of parent only
  - `spring-boot-starter-*` dependencies inherit from parent version

### Spring Boot DevTools
- Problem - When you make changes to your code, you need to restart your application
- Solution - Spring Boot DevTools
- automatically restarts your application when you make changes to your code
- Simply add the dependency to your `pom.xml` file
- No need to write additional code
- No need to restart your application

### IMP
Annotations - mapping annotations REST APIS
Database connections annotations - JPA
Oauth2 / Oauth
GraphQL
IOC
AOP

### Installation steps I followed
- Maven installed by brew