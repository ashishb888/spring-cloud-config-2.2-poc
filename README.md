# Spring cloud config

> I have used Project Lombok, you may want to refer [this link](https://projectlombok.org/setup/eclipse) to configure Project Lombok in Eclipse

###### Architectural diagram 

![](https://github.com/ashishb888/spring-cloud-config-2.2-poc/blob/master/diagrams/spring-cloud-config.PNG)

###### Technologies stack

<pre>
Java 8
Maven 3.6.3
Spring boot 2.3.3.RELEASE
Spring cloud Hoxton.SR8
</pre>

###### Package
` mvn package `

###### Run

` nohup $JAVA_HOME/bin/java -jar spring-cloud-config-server-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 & `
` nohup $JAVA_HOME/bin/java -jar config-client-b-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 & `
` nohup $JAVA_HOME/bin/java -jar config-client-a-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 & `
