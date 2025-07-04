--DBA_ 접두어 데이터는 SOCTT계정에서 조회가 불가능하다.
--DB관리 권한을 가진 계정에서 조회가 가능하므로 SYSTEM 계정에서 사용 가능.

SELECT * FROM DBA_TABLES;

SELECT * FROM DBA_USERS WHERE USERNAME = 'SCOTT';

SQLPLUS SYSTEM/oracle GRANT CREATE VIEW TO SCOTT;
-- SCOTT 계정에 뷰 생성 권한 부여

CREATE USER ORCLSTUDY IDENTIFIED BY ORACLE;
--시스템에서 사용자 생성.

GRANT CREATE SESSION TO ORCLSTUDY;
--사용자 권한 부여

ALTER USER ORCLSTUDY IDENTIFIED BY ORCL;
--사용자 정보 패스워드 변경

DROP USER ORCLSTUDY;
--오라클 사용자 삭제

CREATE USER ORCLSTUDY IDENTIFIED BY ORACLE; --사용자 생성

GRANT RESOURCE,CREATE SESSION, CREATE TABLE TO ORCLSTUDY; --권한부여

CREATE TABLE TEMP1(COL1 VARCHAR2(20), COL2 VARCHAR2(20));
--테이블 생성

INSERT INTO TEMP1 VALUES ('USER','GRANT_TEST');

SELECT * FROM TEMP1;

REVOKE RESOURCE, CREATE TABLE FROM ORCLSTUDY;
--권한 취소

CONN SCOTT/tiger

CREATE TABLE TEMP(COL1 VARCHAR2(20), COL2 VARCHAR2(20));
--TEMP 테이블 COL1 , COL2 열 생성

GRANT SELECT ON TEMP TO ORCLSTUDY;
--TEMP 테이블의 SELECT 권한 부여

GRANT INSERT ON TEMP TO ORCLSTUDY;
--TEMP 테이블의 INSERT 권한 부여

CONN ORCLSTUDY/ORACLE

SELECT * FROM SCOTT.TEMP;

INSERT INTO SCOTT.TEMP VALUES('TEXT', 'FROM ORCLSTUDY');

SELECT*FROM SCOTT.TEMP;

CONN SCOTT/tiger

REVOKE SELECT, INSERT ON TEMP FROM ORCLSTUDY;

CONN ORCLSTUDY/ORACLE

SELECT * FROM SCOTT.TEMP;
-----------------------------------------------------
--롤 생성과 권한

CONN SYSTEM/oracle

CREATE ROLE ROLESTUDY; -- 테이블 생성

GRANT CONNECT, RESOURCE, CREATE VIEW, CREATE SYNONYM TO ROLESTUDY; --권한부여

GRANT ROLESTUDY TO ORCLSTUDY;

CONN ORECLSTUDY/ORACLE

SELECT * FROM USER_SYS_PRIVS;

SELECT * FROM USER_ROLE_PRIVS;
