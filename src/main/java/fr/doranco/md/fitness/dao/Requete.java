package fr.doranco.md.fitness.dao;

public class Requete {

		// Abonne
		public static final String AJOUT_ABONNE = "INSERT INTO `abonne`(`Id_Abonne`, `prenom`, `nom`, `dateInscription`) VALUES (?,?,?,?)";
		public static final String ABONNE_PAR_ID = "SELECT * FROM `abonne` WHERE 1";
		public static final String TOUS_LES_ABONNES = "SELECT * FROM abonne";
		public static final String UPDATE_ABONNE = "UPDATE `abonne` SET `prenom`=? WHERE id=?";
		public static final String SUPPRESSION_ABONNE = "DELETE FROM abonne where id=?";
		
		//Tapis
		public static final String AJOUT_TAPIS = "INSERT INTO tapis(nom) VALUES (?)";
		public static final String TAPIS_PAR_ID = "SELECT `Id_Tapis`, `nom` FROM `tapis` WHERE 1";
		public static final String TOUS_LES_TAPIS= "SELECT * FROM tapis";
		public static final String SUPPRESSION_TAPIS = "DELETE FROM tapis where id=?";
		public static final String MODIFIER_TAPIS = "UPDATE `tapis` SET `Id_Tapis`='[value-1]',`nom`='[value-2]' WHERE 1";

		//Course
		public static final String AJOUT_COURSE = "INSERT INTO `course`(`Id_Course`, `dateHeureDebut`, `dureeEnMinutes`, `distanceEnMetres`, `Id_Tapis`, `Id_Abonne`) VALUES (?,?,?,?,?,?)";
		public static final String COURSE_PAR_ID = "SELECT * FROM `course` WHERE 1";
		public static final String TOUTES_LES_COURSES = "SELECT * FROM course";
		public static final String SUPPRESSION_COURSE = "DELETE FROM course where id=?";


}
