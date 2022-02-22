CREATE TABLE IF NOT EXISTS Images (
    image_id SERIAL PRIMARY KEY NOT NULL,
    category_id int,
    artist_id int,
    title varchar(255),
    content varchar(255)
);

CREATE TABLE IF NOT EXISTS categories (
    category_id SERIAL PRIMARY KEY NOT NULL,
    category_name varchar(255)
);

CREATE TABLE IF NOT EXISTS users (
    user_id SERIAL PRIMARY KEY NOT NULL,
    user_name varchar(255)
);

CREATE TABLE IF NOT EXISTS artists (
    artist_id SERIAL PRIMARY KEY NOT NULL,
    artist_name varchar(255)
);

CREATE TABLE IF NOT EXISTS favourites (
    fav_id SERIAL PRIMARY KEY NOT NULL,
    user_id int,
    image_id int
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