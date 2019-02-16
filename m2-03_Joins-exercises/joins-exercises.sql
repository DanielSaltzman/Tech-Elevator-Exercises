-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
select film.title
from film
join film_actor on film_actor.film_id = film.film_id
join actor on actor.actor_id = film_actor.actor_id
where actor.last_name = 'STALLONE';
-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
select film.title
from film
join film_actor on film_actor.film_id = film.film_id
join actor on actor.actor_id = film_actor.actor_id
where actor.last_name = 'REYNOLDS' and actor.first_name = 'RITA';
-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
select film.title
from film
join film_actor on film_actor.film_id = film.film_id
join actor on actor.actor_id = film_actor.actor_id
where actor.last_name = 'DEAN' and actor.first_name = 'JUDY' or actor.first_name = 'RIVER';
-- 4. All of the the ‘Documentary’ films
-- (68 rows)
select film.title, category.name
from film
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
where category.name = 'Documentary'
order by category.name;    
-- 5. All of the ‘Comedy’ films
-- (58 rows)
select film.title, category.name
from film
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
where category.name = 'Comedy'
order by category.name; 
-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
select category.name, film.rating
from film
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
where category.name = 'Children' and film.rating = 'G'
order by category.name;
-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
select category.name, film.rating, film.length
from film
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
where category.name = 'Family' and film.rating = 'G' and film.length < 120
order by category.name;
-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
select film.title, film.rating
from film
join film_actor on film_actor.film_id = film.film_id
join actor on actor.actor_id = film_actor.actor_id
where actor.last_name = 'LEIGH' and actor.first_name = 'MATTHEW' and film.rating = 'G';
-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
select category.name, film.release_year
from film
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
where category.name = 'Sci-Fi' and film.release_year = 2006;
-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
select category.name, actor.last_name
from film
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
join film_actor on film_actor.film_id = film.film_id
join actor on actor.actor_id = film_actor.actor_id
where category.name = 'Action' and actor.last_name = 'STALLONE';
-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
select address.*, address.district, city.city, country.country
from store
join address on address.address_id = store.address_id
join city on city.city_id = address.city_id
join country on country.country_id = city.country_id;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
select address.*, country.country, store.store_id, store.manager_staff_id, staff.first_name, staff.last_name
from store
join address on address.address_id = store.address_id
join city on city.city_id = address.city_id
join country on country.country_id = city.country_id
join staff on staff.staff_id = store.store_id;
-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)
select customer.first_name, customer.last_name, count(rental.rental_id)
from customer
join rental on rental.customer_id = customer.customer_id
group by customer.first_name, customer.last_name
order by count(rental.rental_id) desc
limit 10;
-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)
select customer.first_name, customer.last_name, sum(payment.amount)
from customer
join payment on payment.customer_id = customer.customer_id
group by customer.first_name, customer.last_name
order by sum(payment.amount) desc
limit 10;
-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)
select store.store_id, address.address, count(rental.rental_id), sum(payment.amount), avg(payment.amount) 
from store
join address on address.address_id = store.address_id
join customer on customer.store_id = store.store_id
join payment on payment.customer_id = customer.customer_id
join rental on rental.rental_id = payment.rental_id
group by store.store_id, address.address;
--couldnt get the exact numbers to return

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)
select film.title, count(rental.rental_id)
from film
join inventory on inventory.film_id = film.film_id
join rental on rental.inventory_id = inventory.inventory_id
group by film.title
order by count(rental.rental_id) desc
limit 10;
-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)
select category.name, count(rental.rental_id) as rental_count 
from film
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
group by category.category_id
order by rental_count desc
limit 5;
-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)
select film.title, count(rental.rental_id) as rentals
from store
join inventory on inventory.store_id = store.store_id
join rental on rental.inventory_id = inventory.inventory_id
join film on film.film_id = inventory.film_id
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
where category.name = 'Action'
group by film.title
order by rentals desc
limit 5;
-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)
select actor.first_name, actor.last_name, count(rental.rental_id) as rentals
from store
join inventory on inventory.store_id = store.store_id
join rental on rental.inventory_id = inventory.inventory_id
join film on film.film_id = inventory.film_id
join film_actor on film_actor.film_id = film.film_id
join actor on actor.actor_id = film_actor.actor_id
group by actor.actor_id
order by rentals desc
limit 10;
-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)
select actor.first_name, actor.last_name, count(rental.rental_id) as rentals
from store
join inventory on inventory.store_id = store.store_id
join rental on rental.inventory_id = inventory.inventory_id
join film on film.film_id = inventory.film_id
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
join film_actor on film_actor.film_id = film.film_id
join actor on actor.actor_id = film_actor.actor_id
where category.name = 'Comedy'
group by actor.actor_id
order by rentals desc
limit 5;