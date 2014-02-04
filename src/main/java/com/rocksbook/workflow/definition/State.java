package com.rocksbook.workflow.definition;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class State {

	enum StateType {
		FIRST, ENDED, NORMAL
	}
	
	private String id;
	
	private String name;
	
	private StateType type;
	
	public State() {
		this.type = StateType.NORMAL;
	}

}
