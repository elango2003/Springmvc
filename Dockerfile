FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/springboot-master.jar springboot-master.jar
ENTRYPOINT [ "java","-jar","/springboot-master.jar" ]