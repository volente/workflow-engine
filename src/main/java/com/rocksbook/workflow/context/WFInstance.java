package com.rocksbook.workflow.context;

import com.rocksbook.workflow.definition.Transition;
import com.rocksbook.workflow.definition.User;
import com.rocksbook.workflow.engine.WorkflowEngine;

public class WFInstance {

	private WorkflowEngine engine;
	
	private WFInstance(WorkflowEngine engine) {
		this.engine = engine;
	}
	
	public static WFInstance getWorkflowInstance(String workflowInstanceId) {
		return null;
	}
	
	public static WFInstance crateWFInstance(WorkflowEngine engine) {
		return new WFInstance(engine);
	}
	
	public void proceed(User user, Transition transition) {
		engine.proceed(user, transition);
	}
	
	public void pullBack(User user) {
		engine.pullBack(user, this);
	}
	
	public void changeEngine(WorkflowEngine engine) {
		this.engine = engine;
	}
	
	
	
}
