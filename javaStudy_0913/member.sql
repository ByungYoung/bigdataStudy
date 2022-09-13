create table memberInfo(
id varchar(200),
pw varchar(200) not null,
name varchar(200) not null,
nick varchar(200) not null 
);

select * from memberInfo;

insert into MEMBERINFO values('admin', '1234', '박병영', '관리자')