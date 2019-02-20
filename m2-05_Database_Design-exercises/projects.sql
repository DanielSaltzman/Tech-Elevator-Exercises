drop table if exists employee;
drop table if exists department;



create table employee
(
       employee_number serial primary key,
       first_name varchar(100) not null,
       last_name varchar(100) not null,
       gender varchar(25),
       date_of_birth varchar(25) not null,
       date_of_hire timestamp not null,
       department varchar(255)
);

create table employee_department
(
       employee_number int not null,
       department_number int not null,
       
       constraint fk_employee_department_employee_number foreign key (employee_number) references employee(employee_number),
       constraint fk_employee_department_department_number foreign key (department_number) references department(department_number)
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

create table department_projects
(
       department_number int not null,
       project_number int not null,
       
       constraint fk_department_projects_department_number foreign key (department_number) references department(department_number),
       constraint fk_department_projects_project_number foreign key (project_number) references projects(project_number)
);

create table employee_projects
(
       employee_number int not null,
       project_number int not null,
        
       constraint fk_employee_projects_employee_number foreign key (employee_number) references employee(employee_number),
       constraint fk_department_projects_project_number foreign key (project_number) references projects(project_number)
);