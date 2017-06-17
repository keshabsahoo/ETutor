package com.etutor.security

import java.util.Date;


class UserRole {
	
	User user
	Role role
	
	Date dateCreated
	Date lastUpdated

	static mapping = {
		table 'user_role_tbl'
		id composite: ['role', 'user']
		version false
		autoTimestamp: true
	}

    static constraints = {
    }
}
