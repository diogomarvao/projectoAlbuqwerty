package com.musicstadium.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;


public class Event extends Entity{

//	Variaveis
	private String name;
	
//	@Column(name="Date (Start)")
//	private Date dateS;
//	
//	@Column(name="Date (End)")
//	private Date dateF;
	
	private String image;
	
	private String description;
	
	private String localization;
	
	private String genre;
	
	
	
	//getter & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Date getDateS() {
//		return dateS;
//	}
//	public void setDateS(Date dateS) {
//		this.dateS = dateS;
//	}
//	public Date getDateF() {
//		return dateF;
//	}
//	public void setDateF(Date dateF) {
//		this.dateF = dateF;
//	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocal() {
		return localization;
	}
	public void setLocal(String local) {
		this.localization = local;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
//	Construtor Event
	public Event(){
		
	}
	
	
}
