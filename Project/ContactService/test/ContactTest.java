package test;

import org.junit.jupiter.api.Test;

import production.Contact;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
	
	// there are 9 tests in total that relate to Contact.java class.
	// 4 of these tests check if various values are null as per the requirements
	// 5 of these tests check to ensure that the various variables meet their size specifications per the requirements
	// the id is not being tested for null or a size greater than 10 characters as it is not capable of producing either these effects. 
	// the id is randomly generated with set parameters so this is not possible
	// not only that but it does not need to be tested for being updatable as it is declared as being static in the constructor, this prevents it from being changed once it is assigned a value
	
	@Test
	@DisplayName("first name will not be null")
	void testContactFirstNameNotNull() {
		Contact contact = new Contact(null, "LastName", "PhoneNumber", "Address");
		assertNotNull(contact.getFirstName(), "First name was null.");
	}
	
	@Test
	@DisplayName("last name will not be null")
	void testContactLastNameNotNull() {
		Contact contact = new Contact("FirstName", null, "PhoneNumber", "Address");
		assertNotNull(contact.getLastName(), "Last name was null.");
	}
	
	@Test
	@DisplayName("address will not be null")
	void testContactAddressNotNull() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumber", null);
		assertNotNull(contact.getAddress(), "Address was null.");
	}
	
	@Test
	@DisplayName("phone number will not be null")
	void testContactPhoneNotNull() {
		Contact contact = new Contact("FirstName", "LastName", null, "Address");
		assertNotNull(contact.getNumber(), "Phone number was null.");
	}
	
	@Test
	@DisplayName("id will not be longer than 10 characters")
	void testContactIDWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumber", "Address");
		if (contact.getContactID().length() > 10) {
			fail("Contact ID has more than 10 characters.");
		}
	}

	@Test
	@DisplayName("first name will not be longer than 10 characters")
	void testContactFirstNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("0123456789", "LastName", "PhoneNumber", "Address");
		if (contact.getFirstName().length() > 10) {
			fail("First Name has more than 10 characters.");
		}
	}

	@Test
	@DisplayName("last name will not be longer than 10 characters")
	void testContactLastNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "HEHOHIHEHOHI", "PhoneNumber", "Address");
		if (contact.getLastName().length() > 10) {
			fail("Last Name has more than 10 characters.");
		}
	}

	@Test
	@DisplayName("phone number will be exactly 10 characters")
	void testContactNumberWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "1234567890", "Address");
		if (contact.getNumber().length() != 10) {
			fail("Phone number length does not equal 10.");
		}
	}

	@Test
	@DisplayName("address will not be longer than 30 characters")
	void testContactAddressWithMoreThanThirtyCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumber",
				"0123456789" + "0123456789" + "01234567890");
		if (contact.getAddress().length() > 30) {
			fail("Address has more than 30 characters.");
		}
	}
}