--다음 <처리 조건>에 유의하여 <학생> 테이블에 대한 알맞은 SQL문을 작성하시오.
--<학생>
--| 학번   | 이름   | 학년 | 수강과목     | 점수 | 연락처      |
--|--------|--------|------|------------- |-----|------------ |
--| 180101 | 김기사 | 1    | 데이터베이스 | 90   | 123-4567   |
--| 180102 | 박산업 | 2    | 전자계산기   | 80   | 234-5678   |
--| 180103 | 최사무 | 3    | 정보통신     | 98   | 345-6789   |
--| 180104 | 조합격 | 4    | 시스템분석   | 85   | 456-7890   |

--<처리 조건>
--1. 학생 테이블에서 3학년과 4학년 학생의 학번과 이름을 검색하는 SQL문을 작성하시오.
--2. 원소 함수 IN을 사용하시오. 원소 함수 IN(VALUE1, VALUE2, ...)
--3. SQL문의 끝에는 세미콜론(;)으로 표시하시오.

--<답>
SELECT 학번, 이름 FROM 학생 WHERE 학년 IN (3, 4) ;
