package fr.doranco.md.fitness.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import fr.doranco.md.fitness.business.Abonne;
import fr.doranco.md.fitness.dao.AbonneDao;
import fr.doranco.md.fitness.dao.ConnexionBdd;
import fr.doranco.md.fitness.dao.Requete;



public class AbonneDaoImpl implements AbonneDao {
	
	private Connection connexion;

	public AbonneDaoImpl() {
		try {
			connexion = ConnexionBdd.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Abonne createAbonne(Abonne abonne) throws SQLException {
		PreparedStatement ps = connexion.prepareStatement(Requete.AJOUT_ABONNE, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, abonne.getFirstName());
        ps.setString(2, abonne.getLastName());
        ps.setTimestamp(3, Timestamp.valueOf(abonne.getDateHeureInscription()));
        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            abonne.setId(rs.getLong(1));
        }
        return abonne;
		};

	// r
	public Abonne findOneAbonneById(long id) throws SQLException{
		PreparedStatement ps = connexion.prepareStatement(Requete.ABONNE_PAR_ID);
		ps.setLong(1, id);

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Abonne abonne = new Abonne();
			abonne.setId(rs.getLong("Id_Tapis"));
			abonne.setFirstName("prenom");
			abonne.setLastName("nom");
			abonne.setDateHeureInscription(null);

			return abonne;
		}
		return null;
	};

	public List<Abonne> findAllAbonne() throws SQLException{
		List<Abonne> abonnes = new ArrayList<>();

		PreparedStatement ps = connexion.prepareStatement(Requete.TOUS_LES_ABONNES);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Abonne abonne = new Abonne();
			abonne.setId(rs.getLong("Id_Abonne"));
			abonne.setFirstName("prenom");
			abonne.setLastName("nom");
			abonne.setDateHeureInscription(rs.getTimestamp("dateInscription").toLocalDateTime());
			

			abonnes.add(abonne);
		}
		return abonnes;
	}

	// u
	public Abonne updateAbonne(Abonne abonne) throws SQLException{
		PreparedStatement ps = connexion.prepareStatement(Requete.UPDATE_ABONNE);
		
		ps.setLong(1, abonne.getId());
		ps.setString(2, abonne.getFirstName());
		ps.setString(2, abonne.getLastName());

		ps.executeUpdate();

		return abonne;
		}
	
	
	// d
	public boolean delete(Long id) throws SQLException{
		return true;
	}

}
