package edu.mum.cs.cs425.onetoone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "transcripts")
@Entity
public class Transcript {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transcriptId;
	private double cgpa;
	public Transcript(double cgpa) {
		super();
		this.cgpa = cgpa;
	}
	public int getTranscriptId() {
		return transcriptId;
	}
	public void setTranscriptId(int transcriptId) {
		this.transcriptId = transcriptId;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
}
