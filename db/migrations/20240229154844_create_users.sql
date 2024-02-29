-- migrate:up

CREATE TABLE users (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  user VARCHAR(50) NOT NULL,
  password VARCHAR(80) NOT NULL,
  activation_key VARCHAR(25) NOT NULL,
  reset_key VARCHAR(25) NOT NULL,
  image_url VARCHAR(40),
  created_at DATETIME,
  updated_at DATETIME,
  user_state_id INT NOT NULL,
  FOREIGN KEY (user_state_id) REFERENCES user_states(id)
);

-- migrate:down

DROP TABLE IF EXISTS users;