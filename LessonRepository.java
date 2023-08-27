package com.learnSpheree.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSpheree.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

	Lesson findByLessonId(int lessonId);

}
