--다음의 <성적> 테이블에서 과목별 점수의 평균이 90점 이상인 '과목이름', '최소점수', '최대점수'를 검색하고자 한다. <처리조건>을 참고하여 적합한 SQL문을 작성하시오.
--<성적>
--| 학번  | 과목번호 | 과목이름       | 학점 | 점수 |
--|-------|----------|----------------|-----|------|
--| a2001 | 101      | 컴퓨터구조     | 6   | 95   |
--| a2002 | 101      | 컴퓨터구조     | 6   | 84   |
--| a2003 | 302      | 데이터베이스   | 5   | 89   |
--| a2004 | 201      | 인공지능       | 5   | 92   |
--| a2005 | 302      | 데이터베이스   | 5   | 100  |
--| a2006 | 302      | 데이터베이스   | 5   | 88   |
--| a2007 | 201      | 인공지능       | 5   | 93   |

--<결과>
--| 과목이름      | 최소점수 | 최대점수 |
--|---------------|---------|---------|
--| 데이터베이스  | 88      | 100     |
--| 인공지능      | 92      | 93      |

--<처리 조건>
--1. WHERE문은 사용하지 않는다.
--2. GROUP BY와 HAVING을 이용한다.
--3. 집계함수를 사용하여 명령문을 구성한다.
--4. '최소점수', '최대점수'는 별칭을 위한 AS문을 이용한다.
--5. 명령문의 마지막의 세미콜론(;)은 생략이 가능하다.
--6. 인용 부호가 필요한 경우 작은 따옴표('')를 사용한다.

SELECT 과목이름, MIN(점수) AS 최소점수, MAX(점수) AS 최대점수 FROM 성적
GROUP BY 과목이름 HAVING AVG(점수) >= 90;
