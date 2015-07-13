package com.levent.client;

public class User {

	private int id;
	private String name;
	private String surname;
	private String mobileNumber;

	public User( ) {
	}

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname( String surname ) {
		this.surname = surname;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber( String mobileNumber ) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return String.format( "Id: %d, Name: %s, Surname: %s, Mobile: %s\n", id, name, surname, mobileNumber );
	}

}
