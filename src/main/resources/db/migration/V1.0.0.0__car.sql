create sequence car_seq;

create table car (
    id bigserial,
    name varchar(255),
    constraint car_pk primary key (id)
);