/**
 * 
 */
package co.com.model.bo;

import java.io.Serializable;

/**
 * @author KB
 *
 */
public class Motivo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String descripcion;
	
	public Motivo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Motivo(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
