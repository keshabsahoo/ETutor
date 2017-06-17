package com.etutor.security

import java.util.Date;

class Role {

	String code
	String name
	String description
	
	Date dateCreated
	Date lastUpdated

	static mapping = {
		table 'role_m_tbl'
		cache true
		version false
		id column:'role_id'
		autoTimestamp: true
	}

	static constraints = {
		code blank: false, unique: true, maxSize: 100
		name blank:false, nullable:false
		description blank:true, nullable:true
	}
}
