/**
 * 
 */
package co.com.soaint.custonWorkItem;



import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

import com.myspace.gestioncredito.model.bo.*;
import com.myspace.gestioncredito.model.dto.*;

import co.com.model.bo.Reportes;

/**
 * @author KB
 *
 */
public class WorkItem implements WorkItemHandler {

	
	public void executeWorkItem(org.kie.api.runtime.process.WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub

		PersonaBO persona = (PersonaBO) workItem.getParameter("Persona");
		DatosContacto dtContactos = (DatosContacto) workItem.getParameter("DatosContacto");
		Credito credito = (Credito) workItem.getParameter("Credito");
		String mensajero = workItem.getParameter("Mensajero").toString();
		java.util.Date fechaActual = (java.util.Date) workItem.getParameter("fechaActual");
		java.util.Date fechaRegistro = (java.util.Date) workItem.getParameter("fechaRegistro");
		int endeudamiento = (Integer) workItem.getParameter("valorEndeudamiento");
		String comentario = workItem.getParameter("Comentario").toString();
		String razonAprobacion = workItem.getParameter("razonAprobacion").toString();
		
		Reportes reporteaux = new Reportes(persona, dtContactos, credito, mensajero, fechaActual, fechaRegistro, endeudamiento, comentario, razonAprobacion);

		
		Map<String, Object> mapa = new HashMap<String, Object>();
		mapa.put("Resultado", reporteaux);
		
		
		manager.completeWorkItem(workItem.getId(), mapa);
		
		System.out.println("Resultado: " + workItem.getResults());

	}

	public void abortWorkItem(org.kie.api.runtime.process.WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub
		System.out.println("abortWorkItem ");
	}

}
