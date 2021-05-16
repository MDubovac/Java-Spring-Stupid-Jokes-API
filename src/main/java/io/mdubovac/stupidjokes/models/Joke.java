package io.mdubovac.stupidjokes.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jokes")
public class Joke {
	@Id
	private long id;
	private String title;
	private String body;
	
	@ManyToOne
	private Category category;

	// Constructors
	public Joke() {
		
	}
	
	public Joke(long id, String title, String body, Category category, long categoryId) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.category = new Category(categoryId, "");
	}

	// Getters & Setters
	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public Category getCategory() {
		return category;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
