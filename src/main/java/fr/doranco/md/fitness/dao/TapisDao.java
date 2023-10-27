package fr.doranco.md.fitness.dao;

import java.sql.SQLException;
import java.util.List;

import fr.doranco.md.fitness.business.Tapis;


public interface TapisDao {

	
	// c
	Tapis createTapis(Tapis tapis) throws SQLException;

	// r
	Tapis findOneTapisById(long id) throws SQLException;

	List<Tapis> findAllTapis() throws SQLException;

	// u
	Tapis updateTapis(Tapis tapis) throws SQLException;
	// d
	boolean delete(Long id) throws SQLException;
}
