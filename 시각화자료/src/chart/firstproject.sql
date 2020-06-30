select * from members
select * from meetings
 
desc members

drop table members cascade constraints;
drop table meetings cascade constraints;
drop table posts cascade constraints;
drop table academies cascade constraints;
drop table reviews cascade constraints;
drop table join_meet cascade constraints;
drop sequence meet_id_seq;
drop sequence post_no_seq;
drop sequence review_no_seq;
drop sequence join_no_seq;

create table members
(mem_id varchar(20),
mem_pw varchar(20) constraint mem_pw_nn not null,
mem_name varchar(20) constraint mem_name_nn not null,
mem_age number(5) constraint mem_age_nn not null,
mem_sex varchar(10) constraint mem_sex_nn not null,
mem_inter varchar(20),
mem_grade varchar(20) constraint mem_grade_varchar_nn  not null,
constraint members_mem_id_pk primary key (mem_id));

create table meetings
(meet_id number(10),
mem_id varchar(20) constraint meet_id_nn not null,
meet_name varchar(40) constraint meet_name_nn not null,
personnel number(5) constraint meet_personnel_nn not null,
meet_inter varchar(20),
constraint meetings_meet_id_pk primary key (meet_id),
constraint meetings_mem_id_fk foreign key (mem_id)
references members(mem_id));

create table posts
(post_no varchar(20),
mem_id varchar(20) constraint p_mem_id_nn not null,
meet_id number(10),
post_name varchar(100) constraint post_name_nn not null,
post_cont varchar(400) constraint post_cont_nn not null,
post_file varchar(400),
post_date date default sysdate constraint post_date_nn not null,
constraint posts_post_no_pk primary key(post_no),
constraint posts_mem_id_fk foreign key (mem_id)
references members(mem_id),
constraint posts_meet_id_fk foreign key (meet_id)
references meetings(meet_id));

create table academies
(aca_id varchar(20),
aca_name varchar(20) constraint aca_name_nn not null,
aca_add varchar(20) constraint aca_add_nn not null,
aca_inter varchar(20) constraint aca_inter_nn not null,
constraint academies_aca_id_pk primary key (aca_id));

create table reviews
(review_no number(10),
mem_id varchar(20) constraint r_mem_id_nn not null,
meet_id number(10) constraint r_meet_id_nn not null,
review_star number(5)  constraint review_star_nn not null,
review_title varchar(40) constraint review_title_nn not null,
review_cont varchar(400),
review_date date default sysdate constraint reivew_date_nn not null,
constraint reviews_review_no_pk primary key (review_no),
constraint reviews_mem_id_fk foreign key (mem_id)
references members(mem_id));

create table join_meet
(join_no number(5),
meet_id number(5) constraint join_meet_id_nn not null,
mem_id varchar(20) constraint join_mem_id_nn not null,
constraint join_meet_join_no_pk primary key (join_no),
constraint join_meet_id_fk foreign key (meet_id)
references meetings(meet_id),
constraint join_mem_id_fk foreign key (mem_id)
references members(mem_id));

create sequence meet_id_seq
increment by 1
start with 1
maxvalue 9999;

create sequence post_no_seq
increment by 1
start with 1
maxvalue 9999;

create sequence review_no_seq
increment by 1
start with 1
maxvalue 9999;

create sequence join_no_seq
increment by 1
start with 1
maxvalue 9999;



INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('kpg123', '456' ,'����','20','male', 'sport, study', 'nomal');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('pmj123', '456' ,'�ڹ���','20','female', 'music, dance', 'super');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('ksa123', '456' ,'�輳��','20','female', 'music, dance', 'great');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('uss123', '456' ,'�ֿ���','20','male', 'sport, study', 'nomal');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('cdh123', '456' ,'�ֵ���','20','male', '1,3', 'super');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('rjy123', '456' ,'���翵','20','male', 'sport, study', 'great');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('pgy123', '456' ,'�ڱٿ�','20','male', 'sport, study', 'super');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('jsh123', '456' ,'������','20','female', 'music, dance', 'super');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('nar123', '456' ,'���Ƹ�','20','female', 'music, dance', 'normal');

INSERT INTO MEMBERS(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade)
VALUES('kjs123', '456' ,'���ؼ�','20','male', 'sport, study', 'super');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'kpg123', '����ȸȭ', 4 , 'study');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'pmj123', '�����', 8 , 'dance');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'ksa123', '���ǽ̾�', 5 , 'music');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'uss123', '�౸��', 11 , 'sport');

INSERT INTO MEETINGS(meet_id, mem_id, meet_name, personnel, meet_inter)
VALUES (meet_id_seq.nextval, 'cdh123', '�߱���� �Բ�', 4 , 'study');

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'kpg123', 1 , 5 , '�̹� �� ���ͽ���ŷLv7�޼�', '30�ϸ��� ���ͽ���ŷ �ڰ����� �� �� �־����.', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'pmj123', 1 , 2 , '�̹� �� ���ͽ���ŷLv1�޼�', '�ʹ� �������', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'ksa123', 1 , 4 , '�̹� �� ���ͽ���ŷLv7�޼�', '��� �� �� �־��', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'uss123', 1 , 3 , '�̹� �� ���ͽ���ŷLv7�޼�', '�����׿�', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'pmj123', 2 , 4 , '���̾�Ʈ���� ������� �ְ�', '�Ѵ޸��� 5kg �����߾��.', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'ksa123', 3 , 4 , 'jyp1������� �հ�', '��̻�� �� �뷡�ε� ����ǿ� �հ��߾��.', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'uss123', 4 , 5 , '�౸���� �� �λ��� ������', '�౸�� �ϴٺ��� �������� �ð� ���� ���� ���������.', default);

INSERT INTO REVIEWS(review_no, mem_id, meet_id,review_star, review_title, review_cont, review_date)
VALUES (review_no_seq.nextval, 'cdh123', 5 , 5 , '����, �߱�����', '�߱������� ȥ�� �� �� �ִ� �ڽŰ��� ������.', default);

INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'cdh123', '1');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'cdh123', '3');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'kpg123', '4');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'pmj123', '4');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'ksa123', '4');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'uss123', '4');
INSERT INTO join_meet(join_no, mem_id, meet_id)
VALUES (join_no_seq.nextval, 'MASTER', '1');


INSERT INTO ACADEMIES(aca_id, aca_name, aca_add, aca_inter)
VALUES ('123', '123', ' �п��ּ� ', '1');
INSERT INTO ACADEMIES(aca_id, aca_name, aca_add, aca_inter)
VALUES ('321', '321', ' �п��ּ� ', '3');
INSERT INTO ACADEMIES(aca_id, aca_name, aca_add, aca_inter)
VALUES ('231', '231', ' �п��ּ� ', '2');
INSERT INTO ACADEMIES(aca_id, aca_name, aca_add, aca_inter)
VALUES ('431', '231', ' �п��ּ� ', '13');

delete from members where mem_id = play123;

select meet_name from meetings where meet_inter like substr((select mem_inter from members where mem_id = 'play123'),6, 5)

select * from meetings
select * from meetings
select meet_name from meetings where meet_inter like substr((select mem_inter from members where mem_id = 'play123'),8,5)

select * from join_meet

select * from join_meet where meet_id = 1 and mem_id = 'cdh123'

select * from reviews