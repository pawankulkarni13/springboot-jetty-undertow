By default, Spring boot uses embedded tomcat server to run the application. 
At times, you may need to use jetty/undertow server in place of tomcat server. 

Spring Boot provides Tomcat and Jetty dependencies bundled together as 
separate starters to help make this process as easy as possible.

### Jetty
Jetty provides a web server and servlet container, additionally providing support for HTTP/2, 
WebSocket, OSGi, JMX, JNDI, JAAS and many other integrations. 
These components are open source and are freely available for commercial use and distribution.

Jetty is used in a wide variety of projects and products, both in development and production. 
Jetty has long been loved by developers due to its long history of being easily embedded in devices, 
tools, frameworks, application servers, and modern cloud services.

https://www.eclipse.org/jetty/

spring-boot-starter-jetty dependency needs to be added to the build file and 
exclusion on default tomcat dependency.

Tomcat

    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-tomcat</artifactId>
    
Jetty

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-jetty</artifactId>
    </dependency>

UnderTow

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-undertow</artifactId>
    </dependency>


### Undertow
Undertow is a flexible performant web server which provides both blocking and non-blocking API's. 
It comes from the JBoss project.
Most importantly, the undertow is lightweight.

_Points to note while switching to Undertow_

The most important point to note about is that you can’t use JSP with the Undertow. 
This is not necessarily a problem as most spring boot applications use template 
engines like thymeleaf or freemarker for their MVC setup.

Undertow is known to using “Direct Buffer” a concept introduced part of Java NiO. 
With direct buffers, undertow can allocate memory outside heap so that OS can perform IO operations quickly. 
But without proper JVM allocations, this might backfire if your machine doesn’t have enough RAM.

Bench marking tools like Apache Bench or Micrometer or Gatling would help to gate the metrics around web server.


### Conclusion
Selecting the right container implementation should likely be based on many factors that can't be neatly 
summarized with a handful of metrics alone. 
Comfort level, features, available configuration options, and policy are often equally important.
