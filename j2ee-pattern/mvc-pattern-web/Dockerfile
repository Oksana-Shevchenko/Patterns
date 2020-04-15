FROM gradle:4.7.0-jdk8-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/mvc-pattern-web
WORKDIR /home/gradle/mvc-pattern-web
RUN gradle build --no-daemon

FROM tomcat:8.5.15-jre8

ADD tomcat-users.xml /usr/local/tomcat/conf/
ADD context.xml /usr/local/tomcat/webapps/manager/META-INF/context.xml
COPY --from=build /home/gradle/mvc-pattern-web/build/libs/*.war /usr/local/tomcat/webapps/mvc-pattern-web-war-1.0.war

ENV JPDA_ADDRESS="8000"
ENV JPDA_TRANSPORT="dt_socket"

EXPOSE 8080 8000

CMD ["catalina.sh", "jpda", "run"]
