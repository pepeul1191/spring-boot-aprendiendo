-- migrate:up

INSERT INTO user_states (id, name) VALUES (1, 'ACTIVO');
INSERT INTO user_states (id, name) VALUES (2, 'ACTIVACIÓN PENDIENTE');
INSERT INTO user_states (id, name) VALUES (3, 'SUSPENDIDO');
INSERT INTO user_states (id, name) VALUES (4, 'ELIMINADO');

-- migrate:down

TRUNCATE user_states;