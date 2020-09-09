/*

insert into orders values (10001,'Amit Goyal',11101,sysdate(),'Pune',30);
insert into orders values (10002,'Akash',11102,sysdate(),'Pune',50);
insert into orders values (10003,'Sachin',11103,sysdate(),'Pune',60);
insert into orders values (10004,'Rohan',11102,sysdate(),'Pune',20);


Hibernate: create table order_item (
id integer not null, 
product_code varchar(255), 
product_name varchar(255), 
quantity integer not null, 
primary key (id))


*/

insert into order_item values(11101,'CR','Card Reader',10);

insert into order_item values(11102,'PD','Pen Drive',10);

insert into order_item values(11103,'HD','Hard Disk',10);