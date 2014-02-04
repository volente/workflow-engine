package com.rocksbook.workflow.definition;

import java.util.List;

import lombok.Setter;

import lombok.Getter;

@Getter
@Setter
public class User {

	private String id;

	private String password;

	private String name;

	private List<Role> roles;

}
