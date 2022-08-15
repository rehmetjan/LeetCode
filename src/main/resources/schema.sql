create table video
(
    id bigint not null,
    name varchar(255) not null,
    seconds bigint not null,
    primary key(id)
);

insert into video values (1, 'Hello World Movie', 600);

create table department
(
    id bigint not null,
    name varchar(255) not null,
    pid bigint not null,
    primary key(id)
);

insert into department values ( 1, 'China', 0 );
insert into department values ( 2, 'Jiangsu', 1 );
insert into department values ( 3, 'Zhejiang', 1 );
insert into department values ( 4, 'Sichuan', 1 );
insert into department values ( 5, 'Taiwan', 1 );
insert into department values ( 6, 'Xinjiang', 1 );
insert into department values ( 7, 'Karamay', 6 );
insert into department values ( 8, 'Urumqi', 6 );
insert into department values ( 9, 'Yili', 6 );
insert into department values ( 10, 'Aksu', 6 );
insert into department values ( 11, 'Nanjing', 2 );
insert into department values ( 12, 'Hangzhou', 3 );
insert into department values ( 13, 'Taipei', 5 );
insert into department values ( 14, 'Chongqing', 4 );
insert into department values ( 15, 'Nantong', 2 );
