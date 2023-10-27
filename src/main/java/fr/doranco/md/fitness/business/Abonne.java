package fr.doranco.md.fitness.business;

import java.time.LocalDateTime;

public class Abonne {
private Long id;
private String firstName;
private String lastName;
private LocalDateTime dateHeureInscription;

public Abonne() {
	super();
}

public Abonne(Long id, String firstName, String lastName, LocalDateTime dateHeureInscription) {
	this();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateHeureInscription = dateHeureInscription;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public LocalDateTime getDateHeureInscription() {
	return dateHeureInscription;
}

public void setDateHeureInscription(LocalDateTime dateHeureInscription) {
	this.dateHeureInscription = dateHeureInscription;
}


}
