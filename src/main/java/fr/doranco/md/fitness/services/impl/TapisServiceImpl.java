package fr.doranco.md.fitness.services.impl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;


import fr.doranco.md.fitness.business.Tapis;
import fr.doranco.md.fitness.dao.TapisDao;
import fr.doranco.md.fitness.dao.impl.TapisDaoImpl;
import fr.doranco.md.fitness.services.TapisService;

public class TapisServiceImpl implements TapisService {
	private TapisDao tapisDao = new TapisDaoImpl();

	@Override
	public Tapis ajouterTapis(String nom) {

		Tapis tapis = new Tapis(nom);

		try {
			tapisDao.createTapis(tapis);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tapis;
	}

	@Override
	public Tapis recupererTapisParId(long id) {
		try {
			return tapisDao.findOneTapisById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Tapis> recupererTousLesTapis() {
		try {
			return tapisDao.findAllTapis();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	@Override
	public Tapis modifierTapis(Tapis tapis) {
		try {
			return tapisDao.updateTapis(tapis);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tapis;
	}
	
	@Override
	public boolean supprimerTapis(long id) {
		try {
			return tapisDao.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
