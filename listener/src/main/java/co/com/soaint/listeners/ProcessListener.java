package co.com.soaint.listeners;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;
import org.kie.api.runtime.process.NodeInstance;

public class ProcessListener implements ProcessEventListener {

	public void beforeProcessStarted(ProcessStartedEvent event) {
		// TODO Auto-generated method stub
	}

	public void afterProcessStarted(ProcessStartedEvent event) {
		// TODO Auto-generated method stub
		
		long idproceso = event.getProcessInstance().getId();
		String nomprocess = event.getProcessInstance().getProcessName();
		System.out.println("NombreProceso: "+nomprocess);
		System.out.println("IDProceso: "+idproceso);
		
	}

	public void beforeProcessCompleted(ProcessCompletedEvent event) {
		// TODO Auto-generated method stub
	}

	public void afterProcessCompleted(ProcessCompletedEvent event) {
		// TODO Auto-generated method stub		
	}

	public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
		// TODO Auto-generated method stub
	}

	public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
		// TODO Auto-generated method stub

	}

	public void beforeNodeLeft(ProcessNodeLeftEvent event) {
		// TODO Auto-generated method stub
		NodeInstance node = event.getNodeInstance();
		if(node.getVariable("Mensagero")== null) {
			
			System.out.println("Variable: "+node.getVariable("Mensajero"));
		}

	}

	public void afterNodeLeft(ProcessNodeLeftEvent event) {
		// TODO Auto-generated method stub
		
		NodeInstance node = event.getNodeInstance();
		if(node.getVariable("Mensagero")!= null) {
			
			System.out.println("Variable: "+node.getVariable("Mensajero"));
		}

	}

	public void beforeVariableChanged(ProcessVariableChangedEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void afterVariableChanged(ProcessVariableChangedEvent event) {
		// TODO Auto-generated method stub
	}
}
