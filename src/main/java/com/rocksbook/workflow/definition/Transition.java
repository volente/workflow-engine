package com.rocksbook.workflow.definition;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transition {

	private String id;
	
	private String name;
	
	private State from;
	
	private State to;
	
	private List<Role> executableRoles;
	
}
