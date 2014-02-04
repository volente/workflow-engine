package com.rocksbook.workflow.engine;

import java.util.Set;

import com.rocksbook.workflow.context.WFInstance;
import com.rocksbook.workflow.definition.ProcessDefinition;
import com.rocksbook.workflow.definition.Role;
import com.rocksbook.workflow.definition.State;
import com.rocksbook.workflow.definition.Transition;
import com.rocksbook.workflow.definition.User;

public interface WorkflowEngine {

	WFInstance proceed(User user, Transition transition);
	
	WFInstance pullBack(User user, WFInstance WFInstance);
	
	State getCurrentState();
	
	Set<Transition> getExecutableTransitions(Role role);
	
	ProcessDefinition getProsessDefinition();
	
	ProcessDefinition changeDefinition();
	
}
