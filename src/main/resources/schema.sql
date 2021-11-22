DROP TABLE IF EXISTS STUDENT;

CREATE TABLE STUDENT (
 student_id BIGINT PRIMARY KEY,
 student_name VARCHAR(35),
 email VARCHAR(320),
 dob DATE
);

INSERT INTO STUDENT(
    student_id, student_name, email, dob, age)
    VALUES(1111, 'wonbin', 'wb@gmail.com', '2000-07-11');
INSERT INTO STUDENT(
    student_id, student_name, email, dob, age)
    VALUES(1112, 'nico', 'nico@gmail.com', '1976-01-11');
INSERT INTO STUDENT(
    student_id, student_name, email, dob, age)
    VALUES(1113, 'jenkins', 'jenkins@gmail.com', '1989-05-11');