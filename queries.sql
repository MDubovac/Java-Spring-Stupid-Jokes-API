-- Create categories table:
CREATE TABLE categories(
  id INT(11) AUTO_INCREMENT NOT NULL,
  name VARCHAR(255) NOT NULL,
  PRIMARY KEY(id)
);

-- Create jokes table:
CREATE TABLE jokes(
	id INT(11) AUTO_INCREMENT NOT NULL,
	title VARCHAR(255) NOT NULL,
	body VARCHAR(255) NOT NULL,
	PRIMARY KEY(id),
	CONSTRAINT fk1 FOREIGN KEY (id) REFERENCES categories(id)
);
