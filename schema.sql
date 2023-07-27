create table owners (
    owner_id int auto_increment,
    name varchar (50) not null,
    primary key (owner_id)
);

create table dogs (
    id int auto_increment,
    name varchar(50) not null,
    age int not null,
    owner_id int not null,
    primary key (id),
    foreign key (owner_id) references owners(owner_id)
);

)