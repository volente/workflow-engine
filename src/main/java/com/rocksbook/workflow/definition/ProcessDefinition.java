package com.rocksbook.workflow.definition;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProcessDefinition {
	
	private String id;
	
	private String name;
	
	private List<State> states;
	
	private Map<String, Transition> transitions;

}
