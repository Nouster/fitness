package fr.doranco.md.fitness.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import fr.doranco.md.fitness.business.Course;
import fr.doranco.md.fitness.dao.ConnexionBdd;
import fr.doranco.md.fitness.dao.CourseDao;

public class CourseDaoImpl implements CourseDao {

	private Connection connexion;

	public CourseDaoImpl() {
		try {
			connexion = ConnexionBdd.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Course createCourse(Course course) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course findOneCourseById(long id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> findAllCourse() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course modifierCourse(Course course) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Long id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
}
