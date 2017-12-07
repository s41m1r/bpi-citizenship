package at.ac.wu.bpi.citizenship;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PrepareRejectionLetterDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String name = (String) execution.getVariable("name");
		String surname = (String) execution.getVariable("surname");
		Long age = (Long) execution.getVariable("age");
		Boolean criminalRecord = (Boolean) execution.getVariable("criminalRecord");
		
		System.out.println("Dear "+name+ " "+surname+", \nWe are sorry to inform you that your citizenshiop application cannot be accepted. "
				+ "Details: age = "+age + " Criminal record = "+criminalRecord
				+ "Please check the eligibility requirements.\nYour sincerely,\n"
				+ "Ministry of Interior");
	}

}
