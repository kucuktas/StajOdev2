package com.levent.client;

public class TestRehber {

	public static void main(String[] args) {
		Rehber rehber = new RehberImpl();
		
		// Test insertUser #1
		User user1 = new User();
		
		user1.setId(1);
		user1.setName("Levent");
		user1.setSurname("Divilioglu");
		user1.setMobileNumber("0-507-9327323");
		
		System.out.printf("Inserting user1\n");
		rehber.insertUser(user1);
		System.out.printf("\nPrinting 1st index\n");
		rehber.printUser(1);
		
		// Test insertUser #2
		User user2 = new User();
		
		user2.setId(2);
		user2.setName("Mete");
		user2.setSurname("Kucuktas");
		user2.setMobileNumber("0-541-4479267");
		
		System.out.printf("Inserting user2\n");
		rehber.insertUser(user2);
		System.out.printf("\nPrinting 2nd index\n");
		rehber.printUser(2);
		
		// Test insertUser #3
		User user3 = new User();
		
		user3.setId(3);
		user3.setName("Ahmet");
		user3.setSurname("Yilmaz");
		user3.setMobileNumber("0-555-4443322");
		
		System.out.printf("Inserting user3\n");
		rehber.insertUser(user3);
		System.out.printf("\nPrinting 3rd index\n");
		rehber.printUser(3);
		
		// Test findUser
		User userFind = rehber.findUser(2);
		
		System.out.printf("Printing userFind (2nd index)\n");
		System.out.println(userFind);
		
		// Test modifyUser
		System.out.printf("\nPrinting 2nd index before modification\n");
		rehber.printUser(2);
		
		userFind.setSurname("FooName");
		rehber.modifyUser(userFind);

		System.out.printf("\nPrinting 2nd index after modification\n");
		rehber.printUser(2);
		
		// Test deleteUser

		System.out.printf("\nPrinting the list \n");
		rehber.printUserList();
		
		rehber.deleteUser(3);


		System.out.printf("\nPrinting the list after deleting 3rd index\n");
		rehber.printUserList();
	}

}
