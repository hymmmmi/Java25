desc emp;   -- emp 테이블 구조보기
select * from emp; -- emp 테이블 내용보기

desc dept;  -- dept 테이블 구조보기
select * from dept;  -- dept 테이블 내용보기

desc bonus; -- bonus 테이블 구조보기
select * from bonus; -- bonus 테이블 내용보기

desc salgrade; -- salgrade 테이블 구조보기
select * from salgrade ; -- salgrade테이블 내용보기

select empno, ename, deptno from emp; -- emp 테이블에 3가지 필드만 보임

select deptno from emp ; --emp 테이블의 deptno 테이블 내용보기

select distinct deptno from emp; -- emp테이블의 deptno테이블의 중복제거 (단일행)

select distinct job, deptno from emp ;-- emp테이블의 deptno테이블의 중복제거 (다수행)

select ename, sal, sal*12+comm, comm from emp ; -- emp 테이블의 사원연간총수입 내용보기

select ename, sal, sal*12+comm as ammsal , comm from emp ; 
--연간총수입 sal*12+comm 의 별칭지정

select * from emp order by sal ; --sal열을 기준으로 오름차순으로 모든 열 정렬

select * from emp order by empno desc; --empno열을 기준으로 내림차순으로 모든 열 정렬

select * from emp order by deptno asc,sal desc ;
-- emp 테이블의 deptno 오름차순(1순위), sal 내림차순(2순위) 정렬

select distinct job from emp;

select empno as employee_no, ename as employee_name, mgr as manager, sal as salary, comm as commission, deptno as department_no
from emp order by ename asc, empno desc;

----------------------------------------------
--CREATE INSERT 생성

create table dept_temp as select * from dept;

select * from dept_temp;
--dept_temp 테이블 만듬

drop table dept_temp;
-- 테이블 삭제

create table emp_temp as select * from emp where 1<>1;

select * FROM emp_temp;

insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values(9999,'홍길동','PRESIDENT',null, '2001/01/01', 5000, 1000,10);

select * from emp_temp;

insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values(1111, '성춘향', 'MANAGER',9999,'2001-01-05', 4000, null, 20);

select * from emp_temp;


insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values(2111,'이순신', 'MANAGER',9999, TO_DATE('07/01/2001', 'DD/MM/YYYY'), 4000, null, 20);

select * from emp_temp;

insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (3111, '심청이', 'MANAGER', 9999, sysdate, 4000, null, 30);

select * from emp_temp;

insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno
from emp e, salgrade s
where e.sal between s.losal and s.hisal and s.grade = 1;

select * from emp_temp;
-- 서브쿼리 사용하여 데이터 추가

---------------------------------------------------------
-- UNDATE 수정

create table dept_temp2 as select * from dept;

select * from dept_temp2; -- dept_temp2 테이블 만듬

update dept_temp2 set loc = 'SEOUL';

select * from dept_temp2;
-- loc열이 모두 seoul로 변경됨. 
--열 선택하여 수정을 원하면 where을 사용해야한다.

rollback;-- 되돌림

update dept_temp2 set dname = 'DATABASE', loc = 'SEOUL'
where deptno = 40 ;

select * from dept_temp2;
-- where을 사용하여 부서이름과 지역이름을 지정하여 수정함.

update emp_temp set comm = 50 where sal <=2500 ;

select * from emp_temp;

update dept_temp2 set (dname, loc) = (select dname, loc from dept where deptno=40)
where deptno = 40 ;

select * from dept_temp2;
--서브쿼리를 사용하여 DNAME의 DATABASE 과 LOC의 SEOUL 을 -> 기존의 40번 부서의 정보로 다시 재수정함.

UPDATE DEPT_TEMP2 SET DNAME = (SELECT DNAME FROM DEPT WHERE DEPTNO = 40),
LOC = (SELECT LOC FROM DEPT WHERE DEPTNO = 40)
WHERE DEPTNO = 40;
--서브쿼리로 데이터 하나하나 수정

UPDATE DEPT_TEMP2 SET LOC = 'SEOUL' WHERE DEPTNO = (SELECT DEPTNO FROM DEPT_TEMP2 
WHERE DNAME = 'OPERATIONS');

SELECT * FROM DEPT_TEMP2;
--WHERE에서 서브쿼리를 사용 하여 LOC 값을 수정함.

UPDATE DEPT_TEMP2 SET DNAME = 'DATABASE', LOC = 'SEOUL'
WHERE DEPTNO = 40 ;

SELECT * FROM DEPT_TEMP2 WHERE DEPTNO = 40;

--------------------------------------------------
--DELETE 삭제

CREATE TABLE EMP_TEMP2 AS SELECT * FROM EMP;

SELECT * FROM EMP_TEMP2;

DELETE FROM EMP_TEMP2 WHERE JOB = 'MANAGER';

SELECT * FROM EMP_TEMP2;
--DELETE를 사용 하여 MANAGER직책 사원들만 삭제

DELETE FROM EMP_TEMP2 WHERE EMPNO IN(SELECT E.EMPNO FROM EMP_TEMP2 E, SALGRADE S
WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL AND S.GRADE = 3 AND DEPTNO = 30);

SELECT * FROM EMP_TEMP2;

DELETE FROM EMP_TEMP2;

SELECT * FROM EMP_TEMP2; -- 전체 삭제

------------------------------------------------------
--CREATE 테이블 생성

CREATE TABLE EMP_DDL (EMPNO NUMBER(4), ENAME VARCHAR2(10), JOB VARCHAR2(9), MGR NUMBER(4),
HIEDATE DATE, SAL NUMBER(7,2), COMM NUMBER(7,2), DEPTNO NUMBER(2));

DESC EMP_DDL ; --EMP테이블 생성 

CREATE TABLE DEPT_DDL AS SELECT * FROM DEPT ; --DEPT 테이블 복사하여 테이블 생성. 

DESC DEPT_DDL;

SELECT * FROM DEPT_DDL; --전체조회 출력

CREATE TABLE EMP_DDL_30 AS SELECT * FROM EMP WHERE DEPTNO = 30;
-- EMP테이블에서 사원번호 30번인 값만 복사하여 테이블 생성

SELECT *FROM EMP_DDL_30;

CREATE TABLE EMPDEPT_DDL AS SELECT E.EMPNO, E.ENAME, E.JOB, E.HIREDATE,
E.SAL, E.COMM, D.DEPTNO, D.DNAME, D.LOC FROM EMP E, DEPT D WHERE 1<>1; 
-- EMP테이블과 DEPT 테이블의 열구조는 가져와서 테이블 생성.
-- 1<>1은 항상 false이기 때문에 테이블 안의 데이터는 가져오지 않는다.

SELECT * FROM EMPDEPT_DDL;

-----------------------------------------------------------------
-- ALTER 테이블 수정(변경)

CREATE TABLE EMP_ALTER AS SELECT * FROM EMP;

SELECT * FROM EMP_ALTER; 
-- EMP테이블 복사 ALTER 테이블 생성

ALTER TABLE EMP_ALTER ADD HP VARCHAR2(20);

SELECT * FROM EMP_ALTER;
-- ATLTER ADD로 HP열 추가함

ALTER TABLE EMP_ALTER RENAME COLUMN HP TO TEL;

SELECT * FROM EMP_ALTER;
--RENAME COLUMN TO 이름 변경

ALTER TABLE EMP_ALTER MODIFY EMPNO NUMBER(5);

DESC EMP_ALTER;
-- MODITY 를 사용하여 기존의 값 4자릿수 에서 5자릿수로 길이 변경.(열의 길이 변경)

ALTER TABLE EMP_ALTER DROP COLUMN TEL;

SELECT * FROM EMP_ALTER;
-- TEL 추가열 삭제

RENAME EMP_ALTER TO EMP_RENAME;

SELECT * FROM EMP_RENAME;
--이름 변경

-------------------------------------------------------------
-- 데이터 삭제 TRUNCATE
-- 테이블 삭제 DROP

TRUNCATE TABLE EMP_RENAME;

SELECT * FROM EMP_RENAME;
-- EMP 테이블 안의 데이터 삭제

DROP TABLE EMP_RENAME;

DESC EMP_RENAME;
-- EMP 테이블 삭제
------------------------------------------------------------

SELECT * FROM DICT;

SELECT TABLE_NAME FROM USER_TABLES;

SELECT OWNER, TABLE_NAME FROM ALL_TABLES;

SELECT * FROM DBA_TABLES; 
-- SYSTEM 사용자로 접속했을 때 실행가능

SELECT * FROM DBA_USERS WHERE USENAME = 'SCOTT';
-- SYSTEM 사용자로 접속했을 때 실행가능

SELECT * FROM USER_INDEXES;

SELECT * FROM USER_IND_COLUMNS;

CREATE INDEX IDX_EMP_SAL ON EMP(SAL);

SELECT * FROM USER_IND_COLUMNS;
--EMP 테이블 SAL 데이터에 인덱스 생성

DROP INDEX IDX_EMP_SAL; --인덱스 삭제

SELECT * FROM USER_IND_COLUMNS; --인덱스 조회출력

SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP WHERE DEPTNO = 20;

CREATE VIEW VW_EMP20 AS (SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP WHERE DEPTNO = 20) ;

SELECT * FROM USER_VIEWS;
-- SCOTT계정에서 뷰 생성

SELECT VIEW_NAME, TEXT_LENGTH, TEXT FROM USER_VIEWS;

SELECT * FROM VW_EMP20;

DROP VIEW VW_EMP20;

---------------------------------------------------------------
-- 테이블 생성하면서 제약조건 지정
-- NOTNULL

CREATE TABLE TABLE_NOTNULL(LOGIN_ID VARCHAR2(20) NOT NULL, LOGIN_PWD VARCHAR2(20) NOT NULL,
TEL VARCHAR2(20));

DESC TABLE_NOTNULL;
-- ID, PWD NOT NULL 설정
-- INSERT 값 넣을때 NULL을 넣으면 오류 발생.

INSERT INTO TABLE_NOTNULL(LOGIN_ID, LOGIN_PWD) VALUES ('TEST_ID_01','1234');

SELECT * FROM TABLE_NOTNULL;
-- TELL은 NOT NULL 설정하지않아서 NULL을 넣어도 무방하다.

UPDATE TABLE_NOTNULL SET LOGIN_PWD = NULL WHERE LOGIN_ID = 'TEST_ID_01';
-- NOT NULL로 제약을 걸면 UPDATE로 NULL 수정이 불가능하다.

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS;
-- 제약조건 확인문 
--오라클이 자동으로 이름 지정

CREATE TABLE TABLE_NOTNULL2( LOGIN_ID VARCHAR2(20) CONSTRAINT TBLNN2_LGNID_NN NOT NULL,
LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLNN2_LGNPW_NN NOT NULL, TEL VARCHAR2(20));
--제약조건 이름 직접지정.

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS;

SELECT * FROM USER_CONSTRAINTS;

SELECT * FROM TABLE_NOTNULL;

ALTER TABLE TABLE_NOTNULL MODIFY(TEL NOT NULL); 
--TEL 데이터에 이미 NULL의 값이 존재함.
--NOT NULL의 제약조건이 추가되지않는다.

UPDATE TABLE_NOTNULL SET TEL = '010-1234-5678' WHERE LOGIN_ID = 'TEST_ID_01';

SELECT * from TABLE_NOTNULL;

ALTER TABLE TABLE_NOTNULL MODIFY(TEL NOT NULL);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS;
--NOT NULL 제약조건 추가

ALTER TABLE TABLE_NOTNULL2 MODIFY(TEL CONSTRAINT TBLNN_TEL_NN NOT NULL);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS;
-- TEL열에 TBLNN_TEL_NN 이라는 이름을 지정하여 제약조건 추가

DESC TABLE_NOTNULL2;

ALTER TABLE TABLE_NOTNULL2 RENAME CONSTRAINT TBLNN_TEL_NN TO TBLNN2_TEL_NN;
--TBLNN 에서 TBLNN2로 이름변경

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS;


ALTER TABLE TABLE_NOTNULL2 DROP CONSTRAINT TBLNN2_TEL_NN;

DESC TABLE_NOTNULL2;

-----------------------------------------------------------------
--UNIQUE

CREATE TABLE TABLE_UNIQUE(LOGIN_ID VARCHAR2(20) UNIQUE, LOGIN_PWD VARCHAR2(20) NOT NULL,
TEL VARCHAR2(20));

DESC TABLE_UNIQUE;

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'TABLE_UNIQUE';
-- 테이블 UNIQUE 제약조건만 조회

INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL) VALUES ('TEST_IN_01','PWS01','010-1234-5678');

SELECT * FROM TABLE_UNIQUE;

INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD,TEL) VALUES ('TEST_ID_01','PWD01','010-1234-5678');
-- 중복데이터로 오류발생

INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD,TEL) VALUES ('TEST_ID_02', 'PWD01', '010-1234-5678');
-- PWD 열은 NOTNULL 조건으로 중복허용
SELECT * FROM TABLE_UNIQUE;

INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD,TEL) VALUES (NULL, 'PWD01', '010-1234-5678');
-- UNIQUE 조건에는 NULL 허용이된다.
SELECT * FROM TABLE_UNIQUE;

UPDATE TABLE_UNIQUE SET LOGIN_ID = 'TEST_ID_01' WHERE LOGIN_ID IS NULL;
-- UPDATE로 NULL에 이미 존재하는 값을 집어넣어 수정을 하려고 하면 증복 발생하여 수정이 안된다.

UPDATE TABLE_UNIQUE SET LOGIN_ID = 'TEST_ID_03' WHERE LOGIN_ID IS NULL;
-- 존재하지 않는 값을 집어 넣어 수정은 가능함.

SELECT * FROM TABLE_UNIQUE;

CREATE TABLE TABLE_UNIQUE2(LOGIN_ID VARCHAR2(20) CONSTRAINT TBLUNQ2_LGNID_UNQ UNIQUE,
LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLUNQ2_LGPWD_NN NOT NULL, TEL VARCHAR2(20));
-- CONSTRAINT 로 TBLUNQ2 ID,PW 조건이름 직접 지정.

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS
WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';
-- TABLE_UNIQUE로 시작하는 모든 테이블이름을 찾는다.
-- LIKE 테이블 이름 :  ~시작하는 테이블이름을 모두 찾는다. 문자열 검색시 사용.
-- %  :0이상의 임의 숫자

---------------ALTER로 UNIQUE 제약조건 추가

ALTER TABLE TABLE_UNIQUE MODIFY(TEL UNIQUE);
-- TEL 열에 이미 중복된 값이 들어가있어서 제약추가 실행이 안됨.

UPDATE TABLE_UNIQUE SET TEL=null;

SELECT * FROM TABLE_UNIQUE;
--UPDATE문을 사용 하여 TEL 열의 값을 모두 NULL로 수정.

ALTER TABLE TABLE_UNIQUE MODIFY(TEL UNIQUE);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS
WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';
--TEL 값에 UNIQUE 제약 조건 설정

ALTER TABLE TABLE_UNIQUE2 MODIFY(TEL CONSTRAINT TBLUNQ_TEL_UNQ UNIQUE);
--테이블 생성과 제약조건 이름 TBLUNQ_ 직접 지정

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS
WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

ALTER TABLE TABLE_UNIQUE2 RENAME CONSTRAINT TBLUNQ_TEL_UNQ TO TBLUNQ2_TEL_UNQ;
-- 생성한 테이블의 제약조건 이름 변경 
-- RENAME CONSTRAINT TO 사용 하여 이름을 변경.

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS
WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

ALTER TABLE TABLE_UNIQUE2 DROP CONSTRAINT TBLUNQ2_TEL_UNQ;
-- 제약 조건 삭제

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS
WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

----------------------------------------------------------
--PRIMARY KEY 내부키

CREATE TABLE TABLE_PK(LOGIN_ID VARCHAR2(20) PRIMARY KEY, LOGIN_PWD VARCHAR2(20) NOT NULL,
TEL VARCHAR2(20) );

DESC TABLE_PK;
--테이블 생성 PRIMARY KEY 조건 지정

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS
WHERE TABLE_NAME LIKE 'TABLE_PK%';

SELECT INDEX_NAME,TABLE_OWNER,TABLE_NAME FROM USER_INDEXES 
WHERE TABLE_NAME LIKE 'TABLE_PK%';

CREATE TABLE TABLE_PK2( LOGIN_ID VARCHAR2(20) CONSTRAINT TBLPK3_LGNID_PK PRIMARY KEY,
LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLPK3_LGNPW_NN NOT NULL,
TEL VARCHAR2(20));

DESC TABLE_PK2;

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS
WHERE TABLE_NAME LIKE 'TABLE_PK%';

INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD,TEL) VALUES ('TEST_ID_01', 'PW01', '010-1234-5678');

SELECT * FROM TABLE_PK;

INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD,TEL) VALUES ('TEST_ID_01', 'PW02', '010-1234-5678');
--PRIMARY 키로 제약 조건이 지정 되어있어 ID는 중복이 허용 되지 않는다.

INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD,TEL) VALUES ('TEST_ID_02', 'PW01', '010-1234-5678');
--PWD는 NOT NULL이므로 중복이 허용됨.

INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD,TEL) VALUES (NULL, 'PW02', '010-1234-5678');
--PRIMARY 키는 NULL 빈값도 허용하지 않는다.

---------------------------------------------------------------
--FOREINGN KEY 외부키

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME, R_OWNER,R_CONSTRAINT_NAME FROM USER_CONSTRAINTS
WHERE TABLE_NAME IN('EMP', 'DEPT');

CREATE TABLE DEPT_FK(DEPTNO NUMBER(2) CONSTRAINT DEPTFK_DEPTNO_PK PRIMARY KEY,
DNAME VARCHAR2(14), LOC VARCHAR2(13));

DESC DEPT_FK;
--DEPT_FK 테이블 생성

CREATE TABLE EMP_FK(EMPNO NUMBER(4) CONSTRAINT EMPFK_EMPNO_PK PRIMARY KEY, ENAME VARCHAR2(10), JOB VARCHAR2(9),
MGR NUMBER(4), HIREDATE DATE, SAL NUMBER(7,2), COMM NUMBER(7,2), DEPTNO NUMBER(2) CONSTRAINT EMPFK_DEPTNO_FK
REFERENCES DEPT_FK(DEPTNO));

DESC EMP_FK;

---------------------------------------------------------------
--사용자와 롤 생성

CREATE USER ORCLSTUDY IDENTIFIED BY ORACLE;
-- SCOTT은 일반사용자라서 사용자 생성이 안된다.

SELECT * FROM ALL_USERS WHERE USERNAME = 'ORCLSTUDY';

SELECT * FROM DBA_OBJECTS WHERE OWNER = 'ORCLSTUDY'; -- 테이블 생성 전이라서 아직 안뜸

ALTER USER ORCLSTUDY IDENTIFIED BY ORCL;
-- SCOTT이 아닌 SYSTEM에서 변경해야함


