package com.pluralsight.repository;
/*

BASE SPRING JPA using hibernate
import com.pluralsight.model.Exercise;

public interface ExerciseRepository {

	Exercise save(Exercise exercise);
	
}
*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Exercise;

@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise, Long>{
	
}