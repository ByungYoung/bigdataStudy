CREATE TABLE memberTable (
	name varchar(20),
	age number(20) not null,
	address varchar(200) not null,
	phonenum varchar(100) not null,
	constraint memberInfo_primary_name primary key(name)
);

desc memberInfo;

insert into memberTable values('¹Úº´¿µ', 23, '200', '01000000000');
select * from memberTable;