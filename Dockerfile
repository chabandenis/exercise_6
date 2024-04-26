FROM maven:latest
ENV PROJECT_DIR=/opt/project
RUN mkdir -p $PROJECT_DIR
WORKDIR $PROJECT_DIR
ADD ./pom.xml $PROJECT_DIR
RUN mvn -B clean install -DskipTests -Dcheckstyle.skip -Dasciidoctor.skip
RUN mvn dependency:resolve
ADD ./src/ $PROJECT_DIR/src
#RUN mvn install

FROM alpine:3
ENV PROJECT_DIR=/opt/project
RUN mkdir -p $PROJECT_DIR
WORKDIR $PROJECT_DIR
COPY --from=0 $PROJECT_DIR/target/* $PROJECT_DIR/
EXPOSE 8080
CMD ["java", "-jar", "opt/project/exercise_5-0.0.1-SNAPSHOT.jar"]
















