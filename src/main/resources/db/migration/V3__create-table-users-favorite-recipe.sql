create table users_favorite_recipe(
users_id int not null,
recipe_id int not null,
primary key (users_id, recipe_id),
foreign key (users_id) references users(id),
foreign key (recipe_id) references recipe(id)
)