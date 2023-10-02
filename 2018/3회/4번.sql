--<학생> 테이블을 참고하여 다음의 각 질문에서 요구하는 답을 쓰시오.
--| 학번      | 이름   | 학년 |
--|-----------|--------|------|
--| 16212060  | 이해준 | 1    |
--| 15212066  | 조은별 | 3    |
--| 15212022  | 박지영 | 2    |
--| 13112031  | 양세옥 | 4    |
--| 14212054  | 이범용 | 2    |
--| 12212001  | 곽광진 | 1    |
--| 13212052  | 김태균 | 3    |

--(1) 다음 SQL문의 실행 결과로 표시되는 레코드의 개수를 쓰시오.
SELECT COUNT(*) FROM 학생 WHERE 학년 = 4;

--답
--1

--(2) <학생> 테이블에서 이름이 '이'로 시작하는 학생들의 학번을 검색하되, 학년을 기준으로 내림차순으로 출력하는 SQL문을 쓰시오.

--답
SELECT 학번 FROM 학생 WHERE 이름 ='이%' ORDER BY 학년 DESC;
