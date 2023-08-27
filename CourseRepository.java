package com.learnSpheree.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSpheree.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

	Course findByCourseId(int courseId);
}
