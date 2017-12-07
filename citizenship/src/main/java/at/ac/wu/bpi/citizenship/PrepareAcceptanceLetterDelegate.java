package at.ac.wu.bpi.citizenship;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PrepareAcceptanceLetterDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String name = (String) execution.getVariable("name");
		String surname = (String) execution.getVariable("surname");
//		Long age = (Long) execution.getVariable("name");
//		Boolean criminalRecord = (Boolean) execution.getVariable("name");
		
		System.out.println("Dear "+name+ " "+surname+", \nWe are happy to have you as a citizen of our country.\nYour sincerely,\n"
				+ "Ministry of Interior");
		
	}

}
