package com.cydeo.cydeoApp.repository;

import com.cydeo.cydeoApp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByCategory(String category);

    List<Course> findByCategoryOrderByName(String category);

    boolean existsByCategory(String name);

    int countByCategory(String category);

    List<Course> findByNameStartingWith(String name);


    @Transactional(readOnly = true)
    Stream<Course> streamByCategory(String category);

    @Query(value = "select * from courses where category = :category and rating > :rating", nativeQuery = true)
    Optional<List<Course>> findAllByCategoryAndRatingGraterThat(@Param("category") String category, @Param("rating") int salary);

}
