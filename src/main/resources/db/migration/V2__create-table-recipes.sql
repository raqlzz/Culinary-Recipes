create table recipe(
id int auto_increment primary key,
name varchar(200) not null,
ingredientes varchar(1000) not null,
preparation varchar(2000) not null,
categoria varchar(200) not null
)