package fr.doranco.md.fitness.business;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Course {

	private Long id;
	private LocalDateTime startTime;
	private Integer distance;
	private Integer duration;
	private List<Abonne> abonne;
	
	public Course() {
		super();
		abonne = new ArrayList<>();
	}

	public Course(Long id, LocalDateTime startTime, Integer distance, Integer duration) {
		this();
		this.id = id;
		this.startTime = startTime;
		this.distance = distance;
		this.duration = duration;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public List<Abonne> getAbonne() {
		return abonne;
	}

	public void setAbonne(List<Abonne> abonne) {
		this.abonne = abonne;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", startTime=" + startTime + ", distance=" + distance + ", duration=" + duration
				+ ", abonne=" + abonne + "]";
	}


}
