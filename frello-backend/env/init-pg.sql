-- CREATE SCHEMA --
CREATE SCHEMA frelloapp;

-- SET DEFAULT SCHEMA --
SET search_path TO frelloapp;

CREATE TABLE frelloapp.User
(
    user_id BIGSERIAL UNIQUE NOT NULL,
    user_name  VARCHAR(255) UNIQUE NOT NULL,
    name VARCHAR(255),
    birthdate DATE NOT NULL,
    country   VARCHAR(3) NOT NULL,
    email     VARCHAR(255) UNIQUE NOT NULL,
    gender    VARCHAR(1),
    CONSTRAINT pk_customer PRIMARY KEY (user_name)
);

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA frelloapp TO frelloadm;

