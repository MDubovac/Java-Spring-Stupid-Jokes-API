package io.mdubovac.stupidjokes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.mdubovac.stupidjokes.models.Joke;

public interface JokeRepository extends JpaRepository<Joke, Long> {
	public List<Joke> findByCategoryId(long categoryId);
}
