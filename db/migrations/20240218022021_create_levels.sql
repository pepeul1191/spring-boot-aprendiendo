-- migrate:up

CREATE TABLE levels (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(30)
);

-- migrate:down

DROP TABLE IF EXISTS levels;