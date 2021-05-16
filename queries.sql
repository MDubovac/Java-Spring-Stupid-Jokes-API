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
	category_id INT(11),
	PRIMARY KEY(id),
	CONSTRAINT fk1 FOREIGN KEY (category_id) REFERENCES categories(id)
);

-- Seed data to categories table:
INSERT INTO categories(name)
VALUES 
 ("Animal Jokes"),
 ("Pun Jokes"),
 ("Marriage Jokes"),
 ("Yo Mama Jokes"),
 ("Science Jokes");
 
 -- Seed data to jokes table:
INSERT INTO jokes (title, body, category_id)
VALUES
	("RATTLE SNAKE", "Two men are hiking through the woods when one of them cries out, “Snake! Run!” His companion laughs at him. “Oh, relax. It’s only a baby,” he says. “Don’t you hear the rattle?” —Steve Smith", 2),
	("WHITEBOARD", "I'm a big fan of whiteboards. I find them quite re-markable.", 3),
	("MARRIAGE", "Marriage is like going to a restaurant. You order what you want, then when you see what the other person has, you wish you had ordered that.", 4),
	("YO MAMM...", "Yo mama's so fat, when she wears high heels, she strikes oil.", 5),
	("SHY GENE", "They have just found the gene for shyness. They would have found it earlier, but it was hiding behind two other genes.", 6);
