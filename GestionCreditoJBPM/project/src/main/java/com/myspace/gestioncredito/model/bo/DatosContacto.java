package com.myspace.gestioncredito.model.bo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DatosContacto implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Direccion")
	private java.lang.String direccion;
	@org.kie.api.definition.type.Label(value = "Telefono")
	private java.lang.Integer telefono;
	@org.kie.api.definition.type.Label(value = "Email")
	private java.lang.String email;

	public DatosContacto() {
	}

	public java.lang.String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(java.lang.String direccion) {
		this.direccion = direccion;
	}

	public java.lang.Integer getTelefono() {
		return this.telefono;
	}

	public void setTelefono(java.lang.Integer telefono) {
		this.telefono = telefono;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public DatosContacto(java.lang.String direccion,
			java.lang.Integer telefono, java.lang.String email) {
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

}