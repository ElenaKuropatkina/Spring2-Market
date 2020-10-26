CREATE TABLE products (id serial, title VARCHAR(255), price int, PRIMARY KEY (id)) engine=InnoDB;
GO
CREATE TABLE users(id bigserial, login VARCHAR(50) NOT NULL UNIQUE, password VARCHAR(80) NOT NULL, first_name VARCHAR(50), last_name VARCHAR(50), PRIMARY KEY (id)) engine=InnoDB;
GO
CREATE TABLE roles(id serial, name VARCHAR(50) NOT NULL, PRIMARY KEY (id)) engine=InnoDB;
GO
CREATE TABLE user_roles(user_id INT NOT NULL, role_id INT NOT NULL, PRIMARY KEY (user_id, role_id), FOREIGN KEY (user_id) REFERENCES users(id), FOREIGN KEY (role_id) REFERENCES roles(id)) engine=InnoDB;
GO