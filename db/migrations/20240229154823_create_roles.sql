-- migrate:up

CREATE TABLE roles (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(25)
);

-- migrate:down

DROP TABLE IF EXISTS roles;