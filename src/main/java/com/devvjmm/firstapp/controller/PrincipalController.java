package com.devvjmm.firstapp.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devvjmm.firstapp.entity.Empleado;
import com.devvjmm.firstapp.service.EmpleadoService;

@ManagedBean
@ViewScoped
public class PrincipalController {
	
	private List<Empleado> empleados;
	
	private EmpleadoService empService = new EmpleadoService();
	
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	public void consultarEmpleados() {
		this.empleados = this.empService.consultarEmpleados();
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

}
