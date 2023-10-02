--다음 <student> 테이블을 참고하여 'name 속성으로 'idx_name'이라는 인덱스를 생성하는 SQL문을 작성하시오.
--<student>
--| stid  | name  | score | deptid |
--|-------|-------|-------|--------|
--| 2001  | brown | 85    | PE01   |
--| 2002  | white | 45    | EF03   |
--| 2003  | black | 67    | UW11   |

CREATE INDEX idx_name ON student(name);
