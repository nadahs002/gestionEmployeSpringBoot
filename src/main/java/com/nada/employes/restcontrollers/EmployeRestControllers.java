package com.nada.employes.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nada.employes.entities.employe;
import com.nada.employes.service.EmployeService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EmployeRestControllers {
	
	@Autowired
	
	EmployeService employeService;
	
	@RequestMapping(method=RequestMethod.GET)
	
	public List<employe>getAllEmployes()
	{
		return employeService.getAllEmployes();
 
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public employe getEmployeById(@PathVariable("id") Long id) {
	return employeService.getEmploye(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public employe createEmploye(@RequestBody employe employe) {
	return employeService.saveEmploye(employe);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public employe updateEmploye(@RequestBody employe employe) {
	return employeService.updateEmploye(employe);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteEmploye(@PathVariable("id") Long id)
	{
	employeService.deleteEmployeById(id);
	}
	
	
	@RequestMapping(value="/empsG/{idG}",method = RequestMethod.GET)
	public List<employe> getemployesByGId(@PathVariable("idG") Long idG) {
	return employeService.findByGradeIdG(idG);
	}
	
	
	@RequestMapping(value="/empsByName/{nom}",method = RequestMethod.GET)
	public List<employe> findByNomEmployeContains(@PathVariable("nom") String nom) {
	return employeService.findByNomEmployeContains(nom);
	}
	
	
	



	
}