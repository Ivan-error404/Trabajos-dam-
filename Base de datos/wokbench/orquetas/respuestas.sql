show tables;

use orchestras;

describe orchestras;

-- 1

SELECT  name from orchestras where city_origin 
in ( select city from concerts where year=2023);

-- 2

SELECT name, position 
FROM members 
WHERE experience > 10 AND orchestra_id NOT IN (
SELECT id FROM orchestras WHERE rating < 8.0);

-- 3

SELECT name, position, wage FROM members WHERE wage > ( select AVG (Wage) from members where position ="Violinista");

-- 4

SELECT name FROM orchestras 
WHERE year > (SELECT year FROM orchestras WHERE name = 'Filarmónica de Valencia')
AND rating > 8;

-- 5

SELECT orchestras.name AS orchestras, COUNT(members.id) AS Number_of_Members 
FROM orchestras  Join  members ON orchestras.id = members.orchestra_id
GROUP BY orchestras.id;

-- 2.1

select name,position from members where wage > all(
select wage from members where position="Pianista");

-- 2.2

select name,experience from members where experience > (
select experience from members where name = "Irene Soto");

-- 2.3



-- 2.4

-- 2.5

-- 2.6

