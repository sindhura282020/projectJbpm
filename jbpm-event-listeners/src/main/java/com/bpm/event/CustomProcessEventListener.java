package com.bpm.event;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;
import org.kie.api.event.process.SLAViolatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomProcessEventListener implements ProcessEventListener {
	Logger logger=LoggerFactory.getLogger(CustomProcessEventListener.class);

	public void beforeProcessStarted(ProcessStartedEvent event) {
		logger.info("Process started");
		logger.info("process id {} ",event.getProcessInstance().getProcessId());
		// TODO Auto-generated method stub

	}

	public void afterProcessStarted(ProcessStartedEvent event) {
		// TODO Auto-generated method stub

	}

	public void beforeProcessCompleted(ProcessCompletedEvent event) {
		// TODO Auto-generated method stub

	}

	public void afterProcessCompleted(ProcessCompletedEvent event) {
		logger.info("Process completed");
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

	}

	public void afterNodeLeft(ProcessNodeLeftEvent event) {
		// TODO Auto-generated method stub

	}

	public void beforeVariableChanged(ProcessVariableChangedEvent event) {
		// TODO Auto-generated method stub

	}

	public void afterVariableChanged(ProcessVariableChangedEvent event) {
		// TODO Auto-generated method stub

	}
	public void afterSLAViolated(SLAViolatedEvent event) {
		// TODO Auto-generated method stub
		//ProcessEventListener.super.afterSLAViolated(event);
	
	}
}
