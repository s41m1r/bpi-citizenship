package at.ac.wu.bpi.citizenship;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendTaskDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		if("send-acceptance-letter".equals(arg0.getCurrentActivityId())){
			System.out.println("Good news sent to "+arg0.getVariable("name")+" "+arg0.getVariable("surname"));
		}
		
		if("send-rejection-letter".equals(arg0.getCurrentActivityId())){
			System.out.println("Bad news sent to "+arg0.getVariable("name")+" "+arg0.getVariable("surname"));
		}
	}

}
