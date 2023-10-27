package fr.doranco.md.fitness.services;

import java.util.List;

import fr.doranco.md.fitness.business.Tapis;


public interface TapisService {

	Tapis ajouterTapis(String nom);

	Tapis recupererTapisParId(long id);

	List<Tapis> recupererTousLesTapis();

	Tapis modifierTapis(Tapis aeroport);
	
	boolean supprimerTapis(long id);
}
