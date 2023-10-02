--다음 <TABLE>을 참조하여 <SQL문>을 실행했을 때 출력되는 결과를 쓰시오.
--<TABLE>에 표시된 'NULL'은 값이 없음을 의미한다.
--<TABLE>
--| INDEX | COL1 | COL2 |
--|-------|------|------|
--| 1     | 2    | NULL |
--| 2     | 4    | 6    |
--| 3     | 3    | 5    |
--| 4     | 6    | 3    |
--| 5     | NULL | 3    |

--<SQL문>
SELECT COUNT(COL2) FROM TABLE
WHERE COL1 IN (2,3)
  OR  COL2 IN (3,5);

--답
--3

--풀이
--아 COUNT(COL2)이므로
--| INDEX | COL1 | COL2 |
--| 3     | 3    | 5    |
--| 4     | 6    | 3    |
--| 5     | NULL | 3    |
--카운팅 되어서 3임.
