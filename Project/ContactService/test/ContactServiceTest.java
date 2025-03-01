package test;

import production.Contact;
import production.ContactService;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Order;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {

	// These tests ensure that the requirements for the ContactService class are met
	// contactId is automatically generated and cannot be changed, as such it must match the contact you are testing
	// to confirm what id a contact has, simply run the service.displayContactList(); function to find out
	// this function is also responsible for printing out all the other contact information as well
	// Using @order makes it so the console lines up with how the tests are written here
	// this makes it easier to read but also easier to identify what the contactId is for various tests
	
	@Test
	@DisplayName("test to update first name.")
	@Order(1)
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		
		// add contact with these parameters
		service.addContact("Elenar", "Friede", "0123456789", "456 Fairy Fork");
		
		// update first name for id 0 with the name "Emilia"
		service.updateFirstName("Emilia", "0");
		
		// call this function to display this contact to the terminal and show what their contactId is
		service.displayContactList();
		
		// checks if the first name was updated
		assertEquals("Emilia", service.getContact("0").getFirstName(), "First name was not updated.");
	}

	@Test
	@DisplayName("test to update last name.")
	@Order(2)
	void testUpdateLastName() {
		ContactService service = new ContactService();
		
		// add contact with these parameters
		service.addContact("Riveria.", "Friede", "0123456789", "664 Astra Ave");
		
		// update last name for id 2 with the name "Alf"
		service.updateLastName("Alf", "2");
		
		// call this function to display this contact to the terminal and show what their contactId is
		service.displayContactList();
		
		// checks if the last name was updated
		assertEquals("Alf", service.getContact("2").getLastName(), "Last name was not updated.");
	}

	@Test
	@DisplayName("test to update phone number.")
	@Order(3)
	void testUpdatePhoneNumber() {
		ContactService service = new ContactService();
		
		// add contact with these parameters
		service.addContact("Frieren", "Friede", "0123456789", "456 Fairy Fork");
		
		// update phone number for id 4 with 9876543210
		service.updateNumber("9876543210", "4");
		
		// call this function to display this contact to the terminal and show what their contactId is
		service.displayContactList();
		
		// checks if the phone number was updated
		assertEquals("9876543210", service.getContact("4").getNumber(), "Phone number was not updated.");
	}

	@Test
	@DisplayName("test to update address.")
	@Order(4)
	void testUpdateAddress() {
		ContactService service = new ContactService();
		
		// add contact with these parameters
		service.addContact("Elenar", "Friede", "0123456789", "456 Fairy Fork");
		
		// update address for id 6 with "419 Dragon Drive"
		service.updateAddress("419 Dragon Drive", "6");
		
		// call this function to display this contact to the terminal and show what their contactId is
		service.displayContactList();
		
		// checks if the address was updated
		assertEquals("419 Dragon Drive", service.getContact("6").getAddress(), "Address was not updated.");
	}

	@Test
	@DisplayName("test to ensure contacts can be deleted")
	@Order(5)
	void testDeleteContact() {
		ContactService service = new ContactService();
		
		// add contact with these parameters
		service.addContact("Jack", "Lovell", "0123456789", "419 Dragon Drive");
		
		// delete contact with id of 8
		service.deleteContact("8");
		
		// confirm that contactList is empty by creating an empty contactList to compare it with
		ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		
		// call this function to display this contact to the terminal and show what their contactId is
		service.displayContactList();
		
		// checks if the contact was deleted
		assertEquals(service.contactList, contactListEmpty, "The contact was not deleted.");
	}

	@Test
	@DisplayName("test to ensure contacts with a unique id can be added")
	@Order(6)
	void testAddContact() {
		ContactService service = new ContactService();
		
		// add contact with these parameters
		service.addContact("Jack", "Lovell", "0123456789", "419 Dragon Drive");
		
		// call this function to display this contact to the terminal and show what their contactId is
		service.displayContactList();
		
		// this ensures the contact is not null and that it was added
		assertNotNull(service.getContact("9"), "Contact was not added");
	}

}