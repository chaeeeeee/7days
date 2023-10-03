--데이터베이스와 관련한 다음 <처리 조건>에 부합하도록 괄호 (1~4)룰 채워 SQL문을 완성하시오.
--<처리 조건>
--1. 이름 학번, 전공, 성별, 생년월일로 구성된 <학생> 테이블을 정의하는 SQL문을 작성하시오. 단, 제약 조건은 다음과 같다.
--(1) 이름은 NULL이 올 수 없고, 학번은 기본키다.
--(2) 전공은 <학과> 테이블의 학과코드를 참조하는 외래키로 사용된다.
--(3) <학과> 테이블에서 삭제가 일어나면 관련된 튜플들의 전공 값을 NULL로 만든다.
--(4) <학과> 테이블에서 학과코드가 변경되면 전공 값도 같은 값으로 변경된다.
--(5) 생년월일은 1980-01-01 이후의 데이터만 저장할 수 있다.
--(6) 제약 조건의 이름은 '생년월일제약'으로 한다.
--(7) 각 속성의 데이터형은 적당하게 지정한다. 단, 성별은 도메인 'SEX'를 사용한다.
--2. SQL문의 문법은 ISO/IEC 9075 표준을 따른다.
--<SQL문>
CREATE TABLE 학생
  ( 이름 VARCHAR(15) (  1  ),
    학번 CHAR(8),
    전공 CHAR(5),
    성별 SEX,
    생년월일 DATE,
    (  2  ) KEY(학번),
    (  3  ) KEY(전공) (  4  ) 학과(학과코드)
      ON DELETE SET NULL,
      ON UPDATE CASCADE,
    CONSTRAINT 생년월일제약
      CHECK(생년월일 >= '1980-01-01') );


--답
--1: NOT NULL
--2: PRIMARY
--3: FOREIGN
--4: REFERENCES
