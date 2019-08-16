/**
 * 
 */
package co.com.model.bo;

import java.io.Serializable;
import java.util.Date;

import com.myspace.gestioncredito.model.bo.*;
import com.myspace.gestioncredito.model.dto.*;

/**
 * @author KB
 *
 */
public class Reportes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PersonaBO persona;
	private DatosContacto dtcontactos;
	private Credito credito;
	private String mensajero;
	private java.util.Date fechaActual;
	private java.util.Date fecharegistro;
	private int endeudamiento;
	private String comentario;
	private String razonAprobacion;
	
	public Reportes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reportes(PersonaBO persona, DatosContacto dtcontactos, Credito credito, String mensajero, Date fechaActual,
			Date fecharegistro, int endeudamiento, String comentario, String razonAprobacion) {
		super();
		this.persona = persona;
		this.dtcontactos = dtcontactos;
		this.credito = credito;
		this.mensajero = mensajero;
		this.fechaActual = fechaActual;
		this.fecharegistro = fecharegistro;
		this.endeudamiento = endeudamiento;
		this.comentario = comentario;
		this.razonAprobacion = razonAprobacion;
	}

	public PersonaBO getPersona() {
		return persona;
	}

	public void setPersona(PersonaBO persona) {
		this.persona = persona;
	}

	public DatosContacto getDtcontactos() {
		return dtcontactos;
	}

	public void setDtcontactos(DatosContacto dtcontactos) {
		this.dtcontactos = dtcontactos;
	}

	public Credito getCredito() {
		return credito;
	}

	public void setCredito(Credito credito) {
		this.credito = credito;
	}

	public String getMensajero() {
		return mensajero;
	}

	public void setMensajero(String mensajero) {
		this.mensajero = mensajero;
	}

	public java.util.Date getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(java.util.Date fechaActual) {
		this.fechaActual = fechaActual;
	}

	public java.util.Date getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(java.util.Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public int getEndeudamiento() {
		return endeudamiento;
	}

	public void setEndeudamiento(int endeudamiento) {
		this.endeudamiento = endeudamiento;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getRazonAprobacion() {
		return razonAprobacion;
	}

	public void setRazonAprobacion(String razonAprobacion) {
		this.razonAprobacion = razonAprobacion;
	}
	
}
