package com.levent.client;

public interface Rehber {
	
	// print user for specific user id
	public void printUser( int userId );
	
	// print user list
	public void printUserList();
	
	//Inserts the user
	public void insertUser( User user );
	
	//Fetch user for specific user id
	public User findUser( int userId );
	
	// modify user
	public void modifyUser( User user );
	
	// delete user for specific user id
	public void deleteUser( int userId );

}
