FROM openjdk:11
COPY target/student_docker.war /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-war","student_docker.war"]