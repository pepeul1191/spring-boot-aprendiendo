-- migrate:up

CREATE TABLE user_states (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(25)
);

-- migrate:down

DROP TABLE IF EXISTS user_states;