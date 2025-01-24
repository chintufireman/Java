package com.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Certificarte {
	private String course;
	private String duration;

	public Certificarte(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}

	public Certificarte() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Certificarte [course=" + course + ", duration=" + duration + "]";
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
}
