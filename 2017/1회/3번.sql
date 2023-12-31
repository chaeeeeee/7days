--데이터베이스와 관련한 다음 <처리 조건>에 부합하는 SQL문을 작성하시오.
--<처리 조건>
--1. 테이블명은 학생으로 정의한다.
--2. 학생 테이블의 구조는 다음과 같다.
--| 속성명 | 데이터타입   | 비고        |
--|--------|-------------|-------------|
--| 학번   | INT         | PRIMARY KEY |
--| 성명   | VARCHAR(20) |             |
--| 학년   | INT         |             |
--| 과목   | VARCHAR(20) |             |
--| 연락처 | VARCHAR(20) |             |
--3. 학생 테이블에 학번이 98170823이고, 성명이 '한국산', 학년이 3, 과목이 '경영학개론', 연락처가 '?-1234-1234'인 학생의 정보를 입력하시오.
--문자형은 싱글(작은) 따옴표로 입력하고 문장의 끝에는 세미콜론(;)을 반드시 표기하시오.

--답
INSERT INTO 학생 VALUES(98170823, '한국산', 3, '경영학개론', '?-1234-1234');
