USE adlister_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
                       id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                       username VARCHAR(240) NOT NULL,
                       email VARCHAR(240) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       PRIMARY KEY (id)
);

CREATE TABLE ads (
                     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                     user_id INT UNSIGNED NOT NULL,
                     title VARCHAR(240) NOT NULL,
                     description TEXT NOT NULL,
                     PRIMARY KEY (id),
                     FOREIGN KEY (user_id) REFERENCES users(id)
                         ON DELETE CASCADE
);

INSERT INTO users(username, email, password) VALUES
                                       ('joeblow', 'joe@gmail', '11dszd1'),
                                       ('moeblow', 'moe@gmail', '234ed4'),
                                       ('sally', 'sally@gmail', '42fss');


INSERT INTO ads (title, description, user_id)
VALUES ('Dog for Sale', 'Hairy, howling husky.', (select id from users where email = 'joe@gmail'));

INSERT INTO ads (title, description, user_id)
VALUES ('Husky Puppies', 'Smol husky puppies.', (select id from users where email = 'joe@gmail'));

INSERT INTO ads (title, description, user_id)
VALUES ('Fast greyhound for sale', 'Fast boi.', (select id from users where email = 'sally@gmail'));

INSERT INTO ads (title, description, user_id)
VALUES ('Toyota Truck', 'It runs.', (select id from users where email = 'moe@gmail'));

INSERT INTO ads (title, description, user_id)
VALUES ('Loveseat', 'Black Leather.', (select id from users where email = 'moe@gmail'));



