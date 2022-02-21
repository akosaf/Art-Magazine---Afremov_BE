CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE images (
    image_id int,
    content varchar(255),
    category_id int,
    artist_id int,
    PRIMARY KEY (image_id)
);

CREATE TABLE categories (
    category_id int,
    category_name varchar(255),
	PRIMARY KEY (category_id)
);

CREATE TABLE users (
    user_id int,
    user_name varchar(255),
    password varchar(255),
	PRIMARY KEY (user_id)
);

CREATE TABLE artists (
    artist_id int,
    artist_name varchar(255),
	PRIMARY KEY (artist_id)
);

CREATE TABLE favourites (
    fav_id int,
    user_id int,
    image_id int,
	PRIMARY KEY (fav_id)
);

ALTER TABLE images
	ADD CONSTRAINT images_fk
	FOREIGN KEY (category_id)
	REFERENCES categories(category_id)
;

ALTER TABLE images
	ADD CONSTRAINT images_fk1
	FOREIGN KEY (artist_id)
	REFERENCES artists(artist_id)
;

ALTER TABLE favourites
	ADD CONSTRAINT favourites_fk
	FOREIGN KEY (user_id)
	REFERENCES users(user_id)
;

ALTER TABLE favourites
	ADD CONSTRAINT favourites_fk1
	FOREIGN KEY (image_id)
	REFERENCES images(image_id)
;

GRANT ALL PRIVILEGES ON TABLE images TO myuser;
GRANT ALL PRIVILEGES ON TABLE categories TO myuser;
GRANT ALL PRIVILEGES ON TABLE users TO myuser;
GRANT ALL PRIVILEGES ON TABLE artists TO myuser;
GRANT ALL PRIVILEGES ON TABLE favourites TO myuser;