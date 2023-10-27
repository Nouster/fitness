package fr.doranco.md.fitness.dao;

import java.sql.SQLException;
import java.util.List;

import fr.doranco.md.fitness.business.Abonne;


public interface AbonneDao {

	// c
		Abonne createAbonne(Abonne abonne) throws SQLException;

		// r
		Abonne findOneAbonneById(long id) throws SQLException;

		List<Abonne> findAllAbonne() throws SQLException;

		// u
		Abonne updateAbonne(Abonne aeroport) throws SQLException;
		// d
		boolean delete(Long id) throws SQLException;
}
