package com.devvjmm.firstapp.service;

import java.util.ArrayList;
import java.util.List;

import com.devvjmm.firstapp.entity.Empleado;

public class EmpleadoService {
	
	public List<Empleado> consultarEmpleados(){
		
		List<Empleado> empleados = new ArrayList<Empleado>();

		Empleado empIBM = new Empleado();
		Empleado empMS = new Empleado();
		Empleado empHP = new Empleado();
		
		empIBM.setNombre("Carlos");
		empIBM.setPrimerApellido("Mendez");
		empIBM.setSegundoApellido("Polanco");
		empIBM.setPuesto("Java Senior");
		empIBM.setEstatus(true);
		
		empMS.setNombre("Andres");
		empMS.setPrimerApellido("Sierra");
		empMS.setSegundoApellido("Lopez");
		empMS.setPuesto("CEO");
		empMS.setEstatus(true);
		
		empHP.setNombre("Jose");
		empHP.setPrimerApellido("Perez");
		empHP.setSegundoApellido("Perez");
		empHP.setPuesto("Architect");
		empHP.setEstatus(true);
		
		empleados.add(empIBM);
		empleados.add(empMS);
		empleados.add(empHP);
		
		return empleados;
		
	}
	


}
