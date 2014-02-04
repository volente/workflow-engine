package com.rocksbook.workflow.engine;

import com.rocksbook.workflow.context.WFInstance;
import com.rocksbook.workflow.definition.ProcessDefinition;
import com.rocksbook.workflow.definition.Transition;
import com.rocksbook.workflow.definition.User;

public class NormalEngine extends DefaultEngine {

	public NormalEngine(ProcessDefinition definition) {
		super(definition);
	}
	
	@Override
	public ProcessDefinition changeDefinition() {
		
		return null;
	}

	@Override
	public WFInstance proceed(User user, Transition transition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WFInstance pullBack(User user, WFInstance wfInstance) {
		throw new UnsupportedOperationException();
	}

}
