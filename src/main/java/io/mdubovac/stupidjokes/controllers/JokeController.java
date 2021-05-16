package io.mdubovac.stupidjokes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.mdubovac.stupidjokes.models.Category;
import io.mdubovac.stupidjokes.models.Joke;
import io.mdubovac.stupidjokes.services.JokeService;

@RestController
public class JokeController {
	
	@Autowired
	private JokeService jokeService;
	
	@RequestMapping("/categories/{categoryId}/jokes")
	public List<Joke> getAllJokes(@PathVariable long categoryId){
		return jokeService.getAllJokes(categoryId);
	}
	
	@RequestMapping("/categories/{categoryId}/jokes/{id}")
	public Joke getJoke(@PathVariable long categoryId, @PathVariable long id) {
		return jokeService.getJoke(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/categories/{categoryId}/jokes")
	public void addJoke(@RequestBody Joke joke, @PathVariable long categoryId) {
		joke.setCategory(new Category(categoryId, ""));
		jokeService.addJoke(joke);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/categories/{categoryId}/jokes/{id}")
	public void updateJoke(@RequestBody Joke joke, @PathVariable long categoryId, @PathVariable long id) {
		joke.setCategory(new Category(categoryId, ""));
		jokeService.updateJoke(joke);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/categories/{categoryId}/jokes/{id}")
	public void deleteJoke(@PathVariable long id) {
		jokeService.deleteJoke(id);
	}
}
