package com.nada.employes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.nada.employes.entities.grade;
import com.nada.employes.entities.employe;
import com.nada.employes.repos.EmployeRepository;


@Service
@SpringBootApplication
public class EmployeServiceImpl implements EmployeService{

	@Autowired
	EmployeRepository employeRepository;
	public employe saveEmploye(employe emp) {
		return employeRepository.save(emp);
	}
	@Override
	public employe updateEmploye(employe emp) {
	return employeRepository.save(emp);
	}
	@Override
	public void deleteEmploye(employe emp) {
	employeRepository.delete(emp);
	}
	 @Override
	public void deleteEmployeById(Long id) {
	employeRepository.deleteById(id);
	}
	@Override
	public employe getEmploye(Long id) {
	return employeRepository.findById(id).get();
	}
	@Override
	public List<employe> getAllEmployes() {
	return employeRepository.findAll();
	}
	@Override
	public List<employe> findByNomEmploye(String nom) {
		// TODO Auto-generated method stub
		return employeRepository.findByNomEmploye(nom);
	}
	@Override
	public List<employe> findByNomEmployeContains(String nom) {
		// TODO Auto-generated method stub
		return employeRepository.findByNomEmployeContains(nom);
	}
	@Override
	public List<employe> findByNomSalaire(String nom, Double salaire) {
		// TODO Auto-generated method stub
		return employeRepository.findByNomsalaire(nom, salaire);
	}
	@Override
	public List<employe> findByGrade(grade grade) {
		// TODO Auto-generated method stub
		return employeRepository.findByGrade(grade);
	}
	@Override
	public List<employe> findByGradeIdG(Long id) {
		// TODO Auto-generated method stub
		return employeRepository.findByGradeIdG(id);
	}
	@Override
	public List<employe> findByOrderByNomEmployeAsc() {
		// TODO Auto-generated method stub
		return employeRepository.findByOrderByNomEmployeAsc();
	}
	

	@Override
	public List<employe> trierEmployesNomSalaire(){
		// TODO Auto-generated method stub
		return employeRepository.trierEmployesNomsSalaire();
	}
	
	

	

}
