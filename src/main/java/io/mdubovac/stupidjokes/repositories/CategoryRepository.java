package io.mdubovac.stupidjokes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.mdubovac.stupidjokes.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
