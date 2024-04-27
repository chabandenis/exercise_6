#FROM maven:latest
#ENV PROJECT_DIR=/opt/project
#RUN mkdir -p $PROJECT_DIR
#WORKDIR $PROJECT_DIR
#ADD ./pom.xml $PROJECT_DIR
#RUN mvn -B clean install -DskipTests -Dcheckstyle.skip -Dasciidoctor.skip
#RUN mvn dependency:resolve
#ADD ./src/ $PROJECT_DIR/src
#RUN mvn install

FROM openjdk:17-jdk-alpine
#ENV PROJECT_DIR=/opt/project
#RUN mkdir -p $PROJECT_DIR
#WORKDIR $PROJECT_DIR
#COPY --from=0 $PROJECT_DIR/target/* $PROJECT_DIR/
#COPY target/exercise_5-0.0.1-SNAPSHOT.jar exercise_5.jar
COPY target/exercise_5-0.0.1-SNAPSHOT.jar exercise_5.jar

EXPOSE 8081
#CMD ["ls -l"]
ENTRYPOINT ["java", "-jar", "exercise_5.jar"]
















