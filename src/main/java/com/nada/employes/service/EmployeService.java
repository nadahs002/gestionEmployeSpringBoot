package com.nada.employes.service;

import java.util.List;

import com.nada.employes.entities.grade;
import com.nada.employes.entities.employe;



public interface EmployeService {
	employe saveEmploye(employe emp);
	employe updateEmploye(employe emp);
	void deleteEmploye(employe p);
	void deleteEmployeById(Long id);
	employe getEmploye(Long id);
	List<employe> getAllEmployes();
	List<employe> findByNomEmploye(String nom);
	List<employe> findByNomEmployeContains(String nom);
	List<employe> findByNomSalaire (String nom, Double salaire);
	List<employe> findByGrade (grade grade);
	List<employe> findByOrderByNomEmployeAsc();
	List<employe> trierEmployesNomSalaire();
	List<employe> findByGradeIdG(Long id);
	

	

}
