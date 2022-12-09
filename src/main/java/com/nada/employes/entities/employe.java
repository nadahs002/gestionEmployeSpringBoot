package com.nada.employes.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class employe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmploye ;
	private String nomEmploye ;
	private Double salaireEmploye ;
	private Date date ;
	
	
	@ManyToOne
	private grade grade ;
	

	public employe() {
		super();
		
	}

	public employe( String nomEmploye, Double salaireEmploye, Date date) {
		super();
		
		this.nomEmploye = nomEmploye;
		this.salaireEmploye = salaireEmploye;
		this.date = date;
	}

	public Long getIdEmploye() {
		return idEmploye;
	}
	
	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}
	
	public String getNomEmploye() {
		return nomEmploye;
	}
	
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	
	public Double getSalaireEmploye() {
		return salaireEmploye;
	}
	
	public void setSalaireEmploye(Double salaireEmploye) {
		this.salaireEmploye = salaireEmploye;
	}
	
	public Date getDate() {
		
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "employe [idEmploye=" + idEmploye + ", nomEmploye=" + nomEmploye + ", salaireEmploye=" + salaireEmploye
				+ ", date=" + date + "]";
	}
	
	
	public grade getGrade() {
		return grade;
	}


	public void setGrade(grade grade) {
		this.grade = grade;
	}
	
	
	

}
