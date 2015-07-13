package com.levent.client;

import java.util.LinkedList;
import java.util.List;

public class RehberImpl implements Rehber {

	// private static int ARRAY_LIST_SIZE = 10;
	private List<User> rehber = new LinkedList<User>();

	public RehberImpl( ) {
		// while ( ( rehber.size() < ARRAY_LIST_SIZE ) ) {
		// rehber.add( null );
		// }
		System.out.printf( "Rehber olusturuldu\n" );
	}

	@Override
	public void printUser( int userId ) {

		// check if the rehber is populated
		for ( int i = 0; i < rehber.size(); i++ ) {

			if ( rehber.get( i ).getId() == userId ) {
				System.out.printf( rehber.get( i ).toString() );
				return;
			}
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

		for ( int i = 0; i < rehber.size(); i++ ) {

			if ( rehber.get( i ).getId() == user.getId() ) {
				System.out.printf( "There is already userId: %d in the list\n", user.getId() );
				return;
			}
		}
		rehber.add( user );
		System.out.printf( "Inserted userId: %d: %s %s to the list\n", user.getId(), user.getName(),
				user.getSurname() );
	}

	@Override
	public User findUser( int userId ) {
		// check if the specific ID is populated in the ArrayList
		for ( int i = 0; i < rehber.size(); i++ ) {

			if ( rehber.get( i ).getId() == userId ) {
				User user = rehber.get( i );
				System.out.printf( "Found userId: %d at index: %d\n", userId, i );
				return user;
			}
		}
		System.out.printf( "Rehberde boyle biri yok (findUser)\n\n" );
		return null;
	}

	@Override
	public void modifyUser( User user ) {
		// check if ID matches the index of the ArrayList and that specific
		// index is populated
		for ( int i = 0; i < rehber.size(); i++ ) {
			if ( rehber.get( i ).getId() == user.getId() ) {
				rehber.remove( i );
				rehber.add( i, user );
				System.out.printf( "%s %s modified at the index %d\n", user.getName(), user.getSurname(),
						user.getId() );
				return;
			}
		}
		System.out.printf( "Rehberin bu indexi bos (modifyUser)\n" );
	}

	@Override
	public void deleteUser( int userId ) {
		// check if the specific ID is populated in the ArrayList
		for ( int i = 0; i < rehber.size(); i++ ) {
			if ( rehber.get( i ).getId() == userId ) {
				rehber.remove( i );
				System.out.printf( "Removed userId: %d from index: %d\n", userId, i );
				return;
			}
		}
		System.out.printf( "userId: %d doesn't exist in rehber\n", userId );
	}

}
