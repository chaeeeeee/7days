--다음은 테이블에 데이터를 삽입하기 위한 과정이다. 보기의 조건식에 맞게 데이터 삽입을 위한 SQL문을 작성하시오.
--<보기>
CREATE TABLE 학생 (
  학번 INT,
  이름 VARCHAR(20),
  학년 INT,
  전공 VARCHAR(30),
  전화번호 VARCHAR(20)
);

--답
INSERT INTO 학생 VALUES(9830287, '홍길동', 3, '경영학개론', '010-1234-1234');
