package com.coremei.conference.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "speakers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Speaker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "speaker_id")
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String title;
	private String company;

	@ManyToMany(mappedBy = "speakers")
	@JsonIgnore
	private List<Session> sessions;

	@Column(name = "speaker_photo")
	@Lob
	@Type(type = "org.hibernate.type.BinaryType")
	private byte[] speakerPhoto;

	public Speaker() {

	}

	public byte[] getSpeakerPhoto() {
		return speakerPhoto;
	}

	public void setSpeakerPhoto(byte[] speakerPhoto) {
		this.speakerPhoto = speakerPhoto;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

}
