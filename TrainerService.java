package com.learnSpheree.services;

import java.util.List;

import com.learnSpheree.entities.Course;
import com.learnSpheree.entities.Lesson;

public interface TrainerService {
	String addCourse(Course course);
	List<Course> fetchAllCourses();
	String addLesson(Lesson lesson);
	String saveCourse(Course course);
	

}
