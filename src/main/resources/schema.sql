create table video
(
    id bigint not null,
    name varchar(255) not null,
    seconds bigint not null,
    primary key(id)
);

insert into video values (1, 'Hello', 3245);
