-- migrate:up

INSERT INTO roles (id, name) VALUES (1, 'admin');

-- migrate:down

TRUNCATE roles;