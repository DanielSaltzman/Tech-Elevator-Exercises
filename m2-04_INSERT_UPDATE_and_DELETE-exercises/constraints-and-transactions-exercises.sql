-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

insert into actor (first_name, last_name)
values ('Hampton', 'Avenue'), ('Lisa', 'Byway');
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

insert into film (title, description, release_year, language_id, length)
values ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', '2008', '1', 198);
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

insert into film_actor (film_id, actor_id)
values (1001, 202), (1001, 203);
-- 4. Add Mathmagical to the category table.

insert into category (name)
values ('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

insert into film_category (film_id, category_id)
values (1001, 17), (274, 17), (494, 17), (714, 17), (996, 17);

select * from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id 
where category.category_id = 17;
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

update film
set rating = 'G'
where film_id in(select film_id from film_category where film_category.category_id = 17);

-- 7. Add a copy of "Euclidean PI" to all the stores.
insert into inventory (film_id, store_id)
values (1001, 1), (1001, 2);
-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
delete from film
where title = 'Euclidean PI';
it failed because of the foreign key restraint, "Euclidean PI" exists in other tables

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
delete from category
where category_id = 17;
failed because of a foreign key constraint as well, it exists in the film_category table also
-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
delete from film_category
where category_id = 17;
Yes it succeeded because it did not corrupt the data, it can stillexist as a category in the category table
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
delete from category
where category_id = 17;
Yes Mathmagical was deleted from category, now that it does not exist in film_category it is no longer a foreign key and can be deleted

delete from film
where film_id = 1001;
it failed to delete Euclidean PI because of a foreign key constraint, it exist in the other connector tables.
-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
the film_id would have to be deleted from film_category, inventory, and film_actor tables before it could be deleted from the film table

delete from film_category
where film_id = 1001;
delete from inventory
where film_id = 1001;
delete from film_actor
where film_id = 1001;
delete from film
where film_id = 1001;