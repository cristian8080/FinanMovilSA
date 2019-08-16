/**
 * 
 */
package co.com.model.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author KB
 *
 */
public class Gestion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String autoriza;
	private String solicitante;
	private java.util.Date fecha;
	
	public Gestion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gestion(String autoriza, String solicitante, Date fecha) {
		super();
		this.autoriza = autoriza;
		this.solicitante = solicitante;
		this.fecha = fecha;
	}

	public String getAutoriza() {
		return autoriza;
	}

	public void setAutoriza(String autoriza) {
		this.autoriza = autoriza;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public java.util.Date getFecha() {
		return fecha;
	}

	public void setFecha(java.util.Date fecha) {
		this.fecha = fecha;
	}
	
	

}
