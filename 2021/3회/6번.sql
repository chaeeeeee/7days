--<A> 테이블과 <B> 테이블을 참고하여 <SQL문>의 실행 결과를 쓰시오.
--<A>
--| NAME  |
--|-------|
--| Smith |
--| Allen |
--| Scott |

--<B>
--| RULE |
--|------|
--| S%   |
--| %T%  |

--<SQL문>
SELECT COUNT(*) CNT FROM A CROSS JOIN B WHERE A.NAME LIKE B.RULE;

--답
--4

--풀이
--A와 B를 CROSS JOIN 한 후, A 테이블의 NAME이 B 테이블의 RULE과 일치하는 행의 개수를 세는 것
--CROSS JOIN의 결과
--| A.NAME | B.RULE |
--|--------|--------|
--| Smith  | S%     |
--| Smith  | %T%    |
--| Allen  | S%     |
--| Allen  | %T%    |
--| Scott  | S%     |
--| Scott  | %T%    |
--WHERE절에서 A.NAME이 B.RULE에 LIKE 조건을 만족하는 행을 선택하면
--| A.NAME | B.RULE |
--|--------|--------|
--| Smith  | S%     |
--| Smith  | %T%    |
--| Allen  | S%     |
--| Scott  | S%     |
--이므로 답은 4가 된다.
