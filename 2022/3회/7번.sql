--다음과 같이 테이블을 정의하고 튜플들을 삽입하였을 때, 각 번호(1,2)의 SQL문을 실행한 결과를 쓰시오.
CREATE TABLE 부서 (
  부서코드 INT PRIMARY KEY,
  부서명 VARCHAR(20)
);
CREATE TABLE 직원 (
  직원코드 INT PRIMARY KEY,
  부서코드 INT,
  직원명 VARCHAR(20),
  FOREIGN KEY(부서코드) REFERENCES 부서(부서코드)
    ON DELETE CASCADE
);
INSERT INTO 부서 VALUES(10, '영업부');
INSERT INTO 부서 VALUES(20, '기획부');
INSERT INTO 부서 VALUES(30, '개발부');

INSERT INTO 직원 VALUES(1001, 10, '강감찬');
INSERT INTO 직원 VALUES(1002, 10, '김유신');
INSERT INTO 직원 VALUES(1003, 20, '홍길동');
INSERT INTO 직원 VALUES(1004, 20, '이순신');
INSERT INTO 직원 VALUES(1005, 20, '을지문덕');
INSERT INTO 직원 VALUES(1006, 30, '유성룡');
INSERT INTO 직원 VALUES(1007, 30, '김태백');

--1
SELECT DISTINCT COUNT(부서코드) FROM 직원 WHERE 부서코드 = 20;
--답 3
--풀이 : 부서코드가 20인 직원의 수를 카운트

--2
DELETE FROM 부서 WHERE 부서코드 = 20;
SELECT DISTINCT COUNT(부서코드) FROM 직원;
--답 4
--풀이: 부서코드 20인 부서 삭제, 남아있는 모든 직원의 부서 코드를 세어 카운트
