create table emp(
num number(5) primary key,
name varchar2(16) not null,
dept varchar2(16),
score number(7,2)); --테이블생성

drop table emp;

create sequence emp_seq increment by 1 start with 1 nocache nocycle; -- 자동번호 생성

drop sequense emp_seq;

insert into emp(num, name, dept, score)
values (emp_seq.nextval, '에이군', '부서1', 75.3)
insert into emp(num, name, dept, score)
values (emp_seq.nextval, '비군', '부서2', 85.3)
insert into emp(num, name, dept, score)
values (emp_seq.nextval, '씨군', '부서3', 95.3)
insert into emp(num, name, dept, score)
values (emp_seq.nextval, '디양', '부서4', 55.3)
insert into emp(num, name, dept, score)
values (emp_seq.nextval, '에프양', '부서5', 65.3)
insert into emp(num, name, dept, score)
values (emp_seq.nextval, '지양', '부서6', 78.3)
--더미테이터 입력

select * from emp;
