package fr.doranco.md.fitness.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.doranco.md.fitness.business.Tapis;
import fr.doranco.md.fitness.dao.ConnexionBdd;
import fr.doranco.md.fitness.dao.Requete;
import fr.doranco.md.fitness.dao.TapisDao;

public class TapisDaoImpl implements TapisDao {
	
	private Connection connexion;
	
	public TapisDaoImpl() {
		try {
			connexion = ConnexionBdd.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Tapis createTapis(Tapis tapis) throws SQLException {
		PreparedStatement ps = connexion.prepareStatement(Requete.AJOUT_TAPIS, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, tapis.getName());
		ps.executeUpdate();

		ResultSet rs = ps.getGeneratedKeys();
		if (rs.next()) {
			tapis.setId(rs.getLong(1));
		}
		return tapis;
	}
	
	

	@Override
	public Tapis findOneTapisById(long id) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = connexion.prepareStatement(Requete.TAPIS_PAR_ID);
		ps.setLong(1, id);

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Tapis tapis = new Tapis();
			tapis.setId(rs.getLong("Id_Tapis"));
			tapis.setName("nom");
			return tapis;
		}
		return null;
	}

	@Override
	public List<Tapis> findAllTapis() throws SQLException {
		// TODO Auto-generated method stub
		List<Tapis> allTapis = new ArrayList<>();

		PreparedStatement ps = connexion.prepareStatement(Requete.TOUS_LES_TAPIS);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Tapis tapis = new Tapis();
			tapis.setId(rs.getLong("Id_Tapis"));
			tapis.setName(rs.getString("nom"));
			allTapis.add(tapis);

		}
		return allTapis;
	}

	@Override
	public Tapis updateTapis(Tapis tapis) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = connexion.prepareStatement(Requete.MODIFIER_TAPIS);
		ps.setLong(1, tapis.getId());
		ps.setString(2, tapis.getName());
		ps.executeUpdate();

		return tapis;
	}

	@Override
	public boolean delete(Long id) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = connexion.prepareStatement(Requete.SUPPRESSION_TAPIS);
		ps.setLong(1, id);
		return ps.execute();
	}


}
