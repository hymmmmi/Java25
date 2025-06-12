------------------------------member 테이블 부모로 생성하기---------------------------------------------
drop table member

create table member(
mno number(5) not null,
bwriter nvarchar2(10) not null,
id nvarchar2(10) primary key,
pw nvarchar2(10) not null,
regidate date default sysdate not null
)

-- 부모 더미데이터 입력 
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '김기원', 'kkw', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '김샛별', 'ksb', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '이하늘', 'lhn', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '전혜진', 'jhj', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '김보령', 'kbr', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '김진우', 'kjw', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '전민기', 'jmg', '1234')

select * from member

delete from member



-------------------------------member의 자식 board외래키 생성 필수--------------------------------------
drop table board
drop sequence board_seq

create table board (
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
bdate date not null
)

create sequence board_seq increment by 1 start with 1 nocycle nocache

alter table board add constraint board_member_fk foreign key(bwriter) references member(id)

delete from board

insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '덥내용~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '안녕하세요~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '감사합니다.~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '수고하셨내요~', '무더운데 등교하시는냐고 고생 하셨습니다.', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '화이팅하세요~', '무더운데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '방갑습니다.~', '무더운데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate)

select * from board

----------------------------------------------------------------------------------
--조인 :  2개 테이블을 연결하여 값 가져오기

select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id = 'kkw'