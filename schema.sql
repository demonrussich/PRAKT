create table cours
(
    id         serial 
            primary key,
    name       varchar(20) not null,
    date_start varchar(10) not null,
    date_end   varchar(10) not null
);
create table lesson
(
    id        serial 
            primary key,
    name      varchar(20),
    day       varchar(11),
    time      varchar(5),
    own_cours integer
            references cours(id)
);
create table prepod
(
    id     serial      
            primary key,
    name   varchar(20) not null,
    family varchar(20) not null,
    years  integer     not null
);
student
(
    id      serial      
            primary key,
    name    varchar(20) not null,
    family  varchar(20) not null,
    "group" integer     not null
);
