package com.learnSpheree.services;

import java.util.List;

import com.learnSpheree.entities.Course;
import com.learnSpheree.entities.Lesson;

public interface StudentService
{
	
	List<Course> fetchCourseList();
	
	
	Course fetchCourse(int courseId);


	Lesson getLesson(int lessonId);
	

}
