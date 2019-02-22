drop table if exists employee_department;
drop table if exists employee_projects;
drop table if exists employee;
drop table if exists department;
drop table if exists projects;


create table employee
(
       employee_number serial primary key,
       job_title varchar(255),
       first_name varchar(100) not null,
       last_name varchar(100) not null,
       gender varchar(25),
       date_of_birth varchar(25) not null,
       date_of_hire timestamp not null,
       department varchar(255)
);

create table department
(
       department_number serial primary key,
       department_name varchar(255)
);

create table projects
(
       project_number serial primary key,
       project_name varchar(255) not null,
       start_date timestamp not null 
);

create table employee_department
(
       employee_number int not null,
       department_number int not null,
       
       constraint fk_employee_department_employee_number foreign key (employee_number) references employee(employee_number),
       constraint fk_employee_department_department_number foreign key (department_number) references department(department_number)
);


create table employee_projects
(
       employee_number int not null,
       project_number int not null,
        
       constraint fk_employee_projects_employee_number foreign key (employee_number) references employee(employee_number),
       constraint fk_department_projects_project_number foreign key (project_number) references projects(project_number)
);

INSERT INTO projects(project_name, start_date) values ('Project X', '2019-02-19');
INSERT INTO projects(project_name, start_date) values ('Top-Secret Project', '2019-02-19');
INSERT INTO projects(project_name, start_date) values ('Super Top-Secret Project', '2019-02-20');
INSERT INTO projects(project_name, start_date) values ('Easy Project', '2019-02-18');
INSERT INTO department(department_name) values ('Special Ops');
INSERT INTO department(department_name) values ('Black Ops');
INSERT INTO department(department_name) values ('Video Games');
INSERT INTO employee(job_title, first_name, last_name, gender, date_of_birth, date_of_hire, department) values ('World Saver','Master', 'Chief', 'Male', '1988-06-19', '2019-02-10', 'Black Ops');
INSERT INTO employee(job_title, first_name, last_name, gender, date_of_birth, date_of_hire, department) values ('Operator', 'John', 'Wick', 'Male', '1980-01-30', '2019-02-04', 'Black Ops');
INSERT INTO employee(job_title, first_name, last_name, gender, date_of_birth, date_of_hire, department) values ('Hunter', 'Dean', 'Winchester', 'Male', '1980-04-15', '2019-02-04', 'Special Ops');
INSERT INTO employee(job_title, first_name, last_name, gender, date_of_birth, date_of_hire, department) values ('Hunter', 'Sammy', 'Winchester', 'Male', '1982-09-20', '2018-06-10', 'Special Ops');
INSERT INTO employee(job_title, first_name, last_name, gender, date_of_birth, date_of_hire, department) values ('Spy', 'James', 'Bond', 'Male', '1960-03-10', '2004-08-15', 'Video Games');
INSERT INTO employee(job_title, first_name, last_name, gender, date_of_birth, date_of_hire, department) values ('Rescuer', 'Link', 'Zelda', 'Male', '1985-11-11', '2002-12-22', 'Video Games');
INSERT INTO employee(job_title, first_name, last_name, gender, date_of_birth, date_of_hire, department) values ('Doggy Dog','Scooby', 'Doo', 'Male', '1972-02-16', '2008-11-26', 'Video Games');
INSERT INTO employee(job_title, first_name, last_name, gender, date_of_birth, date_of_hire, department) values ('Janitor', 'Logan', 'Wolverine', 'X-Man', '1975-09-14', '2010-10-09', 'Black Ops');
INSERT INTO employee_projects(employee_number, project_number) values (1, 3);
INSERT INTO employee_projects(employee_number, project_number) values (2, 2);
INSERT INTO employee_projects(employee_number, project_number) values (3, 1);
Insert INTO employee_projects(employee_number, project_number) values (6, 4);
insert into employee_department(employee_number, department_number) values (1, 2);
insert into employee_department(employee_number, department_number) values (2, 2);
insert into employee_department(employee_number, department_number) values (3, 1);
insert into employee_department(employee_number, department_number) values (4, 1);
insert into employee_department(employee_number, department_number) values (5, 3);
insert into employee_department(employee_number, department_number) values (6, 3);