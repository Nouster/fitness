package fr.doranco.md.fitness.dao;

import java.sql.SQLException;
import java.util.List;

import fr.doranco.md.fitness.business.Course;


public interface CourseDao {
	// C
	Course createCourse(Course course) throws SQLException;

	// R
	Course findOneCourseById(long id) throws SQLException;

	List<Course> findAllCourse() throws SQLException;

	// U
	Course modifierCourse(Course course) throws SQLException;

	// D
	boolean delete(Long id) throws SQLException;
}
