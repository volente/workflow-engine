package com.rocksbook.workflow.engine;

import java.util.HashSet;
import java.util.Set;

import com.rocksbook.workflow.context.WFInstance;
import com.rocksbook.workflow.definition.ProcessDefinition;
import com.rocksbook.workflow.definition.Role;
import com.rocksbook.workflow.definition.State;
import com.rocksbook.workflow.definition.Transition;
import com.rocksbook.workflow.definition.User;

public abstract class DefaultEngine implements WorkflowEngine {

	private ProcessDefinition definition;

	private State currentState;

	public DefaultEngine(ProcessDefinition definition) {
		this.definition = definition;
	}

	public abstract WFInstance proceed(User user, Transition transition);

	public abstract WFInstance pullBack(User user, WFInstance wfInstance);

	@Override
	public State getCurrentState() {
		return this.currentState;
	}

	@Override
	public Set<Transition> getExecutableTransitions(Role role) {
		Set<Transition> transitions = new HashSet<Transition>();
		for (Transition tr : definition.getTransitions().values()) {
			if (!tr.getFrom().getId().equals(currentState.getId())) {
				continue;
			}
			for (Role executable : tr.getExecutableRoles()) {
				if (executable.getId().equals(role.getId())) {
					transitions.add(tr);
				}

			}
		}
		return transitions;
	}
	
	@Override
	public ProcessDefinition getProsessDefinition() {
		return this.definition;
	}


}
