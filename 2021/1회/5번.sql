--<EMP_TBL> 테이블을 참고하여 <SQL문>의 실행 결과를 쓰시오
--<EMP_TBL>
--| EMPNO | SAL  |
--|-------|------|
--| 100   | 1500 |
--| 200   | 3000 |
--| 300   | 2000 |

--<SQL문>
SELECT COUNT(*) FROM EMP_TBL WHERE EMPNO >= 100 AND SAL >= 3000 OR EMPNO = 200;

--답
--1
