--학생(STUDENT) 테이블에 전기과 학생이 50명, 전산과 학생이 100명, 전자과 학생이 50명이 있다고 할 때
--다음 SQL문 1, 2, 3의 실행 결과로 표시되는 튜플의 수를 쓰시오. (단, DEPT 필드는 학과를 의미)

--1
SELECT DEPT FROM STUDENT;
--답: 200

--2
SELECT DISTINCT DEPT FROM STUDENT;
--답: 2

--3
SELECT COUNT(DISTINCT DEPT) FROM STUDENT WHERE DEPT = '전산과';
--답: 1
