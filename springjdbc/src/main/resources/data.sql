create table person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    primary key(id)
);

insert into person (id, name, location) values (1, 'Souvik', 'Pune' );
insert into person (id, name, location) values (2, 'Megha', 'Chennai' );
insert into person (id, name, location) values (3, 'Samriddhi', 'Hyderabad' );