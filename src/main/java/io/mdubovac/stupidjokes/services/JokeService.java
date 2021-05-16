package io.mdubovac.stupidjokes.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.mdubovac.stupidjokes.models.Joke;
import io.mdubovac.stupidjokes.repositories.JokeRepository;

@Service
public class JokeService {
	
	@Autowired
	private JokeRepository jokeRepository;

	public List<Joke> getAllJokes(long categoryId) {
		List<Joke> jokes = new ArrayList<>();
		jokeRepository.findByCategoryId(categoryId).forEach(jokes::add);
		return jokes;
	}

	public Joke getJoke(long id) {
		Joke joke = jokeRepository.findById(id).get();
		return joke;
	}

	public void addJoke(Joke joke) {
		jokeRepository.save(joke);
	}

	public void updateJoke(Joke joke) {
		jokeRepository.save(joke);
	}

	public void deleteJoke(long id) {
		jokeRepository.deleteById(id);
	}
}
