package com.devvjmm.firstapp.entity;

import java.io.Serializable;

public class Empleado implements Serializable{
	
	private static final long serialVersionUID = 2130662452737607936L;

	//Nombre del empleado
	private String nombre;
	
	//Primer apellidos del empleado
	private String primerApellido;
	
	//Segundo apellidos del empleado
	private String segundoApellido;
	
	//Puesto o cargo del empleado
	private String puesto;
	
	//Estado actual del empleado
	private boolean estatus;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	public Empleado(String nombre, String primerApellido, String segundoApellido, String puesto, boolean estatus) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.puesto = puesto;
		this.estatus = true;
	}
	*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	

}
