FROM mysql
MAINTAINER kursova_os
ENV MYSQL_ROOT_PASSWORD 1234
ADD students_student.sql students_hibernate_sequence.sql /docker-entrypoint-initdb.d
EXPOSE 3306