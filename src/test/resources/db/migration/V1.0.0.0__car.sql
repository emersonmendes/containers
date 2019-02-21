create sequence car_seq;

create table car (
    id bigserial,
    name varchar(255),
    constraint car_pk primary key (id)
);

insert into car(name) values('Ford Ka');
insert into car(name) values('Ford Ka1');
insert into car(name) values('Ford Ka2');
insert into car(name) values('Ford Ka3');
insert into car(name) values('Ford Ka4');
insert into car(name) values('Ford Ka5');
insert into car(name) values('Ford Ka6');
insert into car(name) values('Ford Ka7');