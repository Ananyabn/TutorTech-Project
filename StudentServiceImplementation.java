package com.learnSpheree.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSpheree.entities.Course;
import com.learnSpheree.entities.Lesson;
import com.learnSpheree.repositories.CourseRepository;
import com.learnSpheree.repositories.LessonRepository;

@Service
public class StudentServiceImplementation implements StudentService
{

	@Autowired
	CourseRepository repo;
	@Autowired
	LessonRepository lrepo;
	@Override
	public List<Course> fetchCourseList() 
	{
		return repo.findAll();
	}
	@Override
	public Course fetchCourse(int courseId) {
		// TODO Auto-generated method stub
		return repo.findByCourseId(courseId);
	}
	@Override
	public Lesson getLesson(int lessonId) {
		return lrepo.findByLessonId(lessonId);
	}
	
	
	
	

}
