package com.levent.client;

import java.util.ArrayList;

public class RehberImpl implements Rehber {

	private static int ARRAY_LIST_SIZE = 10;
	private ArrayList<User> rehber = new ArrayList<User>( ARRAY_LIST_SIZE );

	public RehberImpl( ) {
		while ( ( rehber.size() < ARRAY_LIST_SIZE ) ) {
			rehber.add( null );
		}
		System.out.printf( "Rehber olusturuldu\n" );
	}

	@Override
	public void printUser( int userId ) {

		// check if the rehber is populated
		if ( !rehber.isEmpty() ) {
			System.out.printf( rehber.get( userId ).toString() );
		}

	}

	@Override
	public void printUserList() {

		// check if the rehber is populated
		if ( !rehber.isEmpty() ) {
			for ( User users : rehber ) {
				if ( users == null ) {
					continue;
				}
				else
					System.out.printf( users.toString() );
			}
		}
		else
			System.out.printf( "Rehber bos\n\n " );

	}

	@Override
	public void insertUser( User user ) {

		// check if the specific ID is empty in the ArrayList
		if ( rehber.get( user.getId() ) == null ) {

			rehber.add( user.getId(), user );
			System.out.printf( "%s %s added to the index %d\n", user.getName(), user.getSurname(), user.getId() );
		}
		else
			System.out.printf( "Rehberin bu indexi dolu\n\n" );
	}

	@Override
	public User findUser( int userId ) {
		User user = new User();

		// check if the specific ID is populated in the ArrayList
		if ( rehber.get( userId ) != null ) {
			user = rehber.get( userId );
			return user;
		}
		else {
			System.out.printf( "Rehberin bu indexi bos (findUser)\n\n" );
			return null;
		}
	}

	@Override
	public void modifyUser( User user ) {
		// check if ID matches the index of the ArrayList and that specific
		// index is populated
		if ( rehber.get( user.getId() ) != null && user.getId() == rehber.indexOf( user ) ) {
			rehber.remove( user.getId() );
			rehber.add( user.getId(), user );
			System.out.printf( "%s %s modified at the index %d\n", user.getName(), user.getSurname(), user.getId() );
		}
		else
			System.out.printf( "Rehberin bu indexi bos (modifyUser)" );

	}

	@Override
	public void deleteUser( int userId ) {
		// check if the specific ID is populated in the ArrayList
		if ( rehber.get( userId ) != null ) {
			rehber.remove( userId );
		}
	}

}
