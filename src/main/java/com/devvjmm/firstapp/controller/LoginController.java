package com.devvjmm.firstapp.controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/*
 * Clase que permite controlar la pagina de login
 */

@ManagedBean
public class LoginController {

	private String usuario;
	private String password;

	// Metodo que permite el login de ususarios
	public void ingresar() {
		System.out.println("Usuario: " + usuario);

		if (usuario.equals("vicmart") && password.equals("654321")) {
			//FacesContext.getCurrentInstance().addMessage("formLogin:txtUser", new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario correcto", ""));
			 
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe...", ""));
				e.printStackTrace();
			}
			
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUser",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o password incorrecto", ""));
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
