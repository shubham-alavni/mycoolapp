### What is JAR file?
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