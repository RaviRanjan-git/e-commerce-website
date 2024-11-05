package ravi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ravi.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
