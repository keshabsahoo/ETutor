package com.etutor.security

class User {

	String firstName
	String lastName
	String city
	String userName
	String password
	String email
	String mobileNumber
	boolean isActive
	boolean isOTP
	boolean isPasswordExpired
	long loginCount
	
	Date dateCreated
	Date lastUpdated
	
	static mapping = {
		table 'user_tbl'
		version false
		id column:'user_id'
		autoTimestamp: true
	}
	static hasOne =[:]
	
    static constraints = {
		firstName			nullable:false, blank:false, unique:true, maxSize:20
		lastName 			nullable:false, blank:false, unique:true, maxSize:20
		city				nullable:true, blank:true
		userName			nullable:false, blank:false, unique:true, maxSize:100
		password			nullable:false, blank:false, maxSize:100
		email				nullable:false, blank:false, unique:true 
		mobileNumber		nullable:false, blank:false
		isActive			nullable:false, blank:false
		isOTP				nullable:false, blank:false
		isPasswordExpired	nullable:false, blank:false
		loginCount			nullable:false, blank:false
    }
}
