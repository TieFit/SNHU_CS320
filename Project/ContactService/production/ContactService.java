package production;

import java.util.ArrayList;
import java.util.Iterator;

public class ContactService {
	
	// an ArrayList will hold all the contacts
	public ArrayList<Contact> contactList = new ArrayList<Contact>();

	// this function can be ran to display all contacts to the console
	// this is useful for checking what the contactId is for a contact
	// also it can be used to confirm if a contact was updated as it was supposed to be
	public void displayContactList() {
		
	    // Iterate through each contact in the contactList
	    for (Contact contact : contactList) {
	        System.out.println("\t Contact ID: " + contact.getContactID());
	        System.out.println("\t First Name: " + contact.getFirstName());
	        System.out.println("\t Last Name: " + contact.getLastName());
	        System.out.println("\t Phone Number: " + contact.getNumber());
	        System.out.println("\t Address: " + contact.getAddress() + "\n");
	    }
	}

	// Adds a new contact using the Contact constructor, then assign the new contact to the list.
	// function to add a new contact, passes values from Contact constructor to then add it to contact list
	public void addContact(String firstName, String lastName, String number, String address) {
		// create new contact using values from Contact constructor
		Contact contact = new Contact(firstName, lastName, number, address);
		
		// add the newly created contact to the contactList
		contactList.add(contact);
	}

	public Contact getContact(String contactID) {
		
	    // set contact as placeholder in case a contact is not found
	    Contact contact = new Contact(null, null, null, null);
	    
	    // iterate over contactList using an iterator
	    Iterator<Contact> iterator = contactList.iterator();
	    while (iterator.hasNext()) {
	        Contact currentContact = iterator.next();
	        
	        // if a match is found, assign the matched contact to the contact variable
	        if (currentContact.getContactID().contentEquals(contactID)) {
	            contact = currentContact;
	            
	            // breaks loop after match is found
	            break;  
	        }
	    }
	    
	    // Return either the matched contact, or the placeholder contact if no match was found
	    return contact;
	}

	// function to delete contact by using its contactId
	public void deleteContact(String contactID) {
		
		// use an iterator to iterate over the contactList
	    Iterator<Contact> iterator = contactList.iterator();
	    while (iterator.hasNext()) {
	        Contact contact = iterator.next();
	        
	        // if contactId equals the contactId being searched for
	        if (contact.getContactID().equals(contactID)) {
	        	// remove the contact using the iterator
	            iterator.remove(); 
	            
	            // output a message to confirm the contact was deleted
	            System.out.println("Contact ID: " + contactID + " has been deleted.\n");
	            
	            // exits the function after the matched contact is deleted
	            return;  
	        }
	    }
	    
	    // if no match was found
	    System.out.println("Contact ID: " + contactID + " not found.");
	}
	
	// function to update the first name of a contact
	// uses contactId to search contactList for a match
	// takes updated name as an argument as well to update firstName when match is found
	public void updateFirstName(String updatedString, String contactID) {
		
		// use an iterator to iterate over contactList
	    Iterator<Contact> iterator = contactList.iterator();
	    while (iterator.hasNext()) {
	        Contact contact = iterator.next();
	        
	        // if a match is found
	        if (contact.getContactID().equals(contactID)) {
	        	
	        	// update the firstName with what you input earlier
	            contact.setFirstName(updatedString);
	            
	            // output message to console to confirm the update was successful
	            System.out.println("Contact ID: " + contactID + " updated successfully.");
	            
	            // exits function after successful update
	            return;  
	        }
	    }
	    
	    // print an error message if the contactId was not found
	    System.out.println("Contact ID: " + contactID + " not found.");
	}
	
	// this function acts the exact same as the firstName function right before it to update lastName
	// uses contactId to search contactList for a match
	// takes updated name as an argument as well to update lastName when match is found
	public void updateLastName(String updatedString, String contactID) {
		
		// use an iterator to iterate over contactList
	    Iterator<Contact> iterator = contactList.iterator();
	    while (iterator.hasNext()) {
	        Contact contact = iterator.next();
	        
	        // if a match is found
	        if (contact.getContactID().equals(contactID)) {
	        	
	        	 // update the lastName with what you input earlier
	            contact.setLastName(updatedString); 
	            
	            // output message to console to confirm the update was successful
	            System.out.println("Contact ID: " + contactID + " updated successfully.");
	            
	            // exits function after successful update
	            return; 
	        }
	    }
	    
	    // print an error message if the contactId was not found
	    System.out.println("Contact ID: " + contactID + " not found.");
	}

	// this function acts similarly to the two previous ones, takes an updatedString and contactId as arguments to execute
	// uses contactId to search contactList for a match
	public void updateNumber(String updatedString, String contactID) {
		
		// use an iterator to iterate over contactList
	    Iterator<Contact> iterator = contactList.iterator();
	    while (iterator.hasNext()) {
	        Contact contact = iterator.next();
	        
	        // if a match is found
	        if (contact.getContactID().equals(contactID)) {
	        	
	        	// update the phone number with what you input earlier
	            contact.setNumber(updatedString);
	            
	            // output message to console to confirm the update was successful
	            System.out.println("Contact ID: " + contactID + " updated successfully.");
	            
	            // exits function after successful update
	            return;  
	        }
	    }
	    // print an error message if the contactId was not found
	    System.out.println("Contact ID: " + contactID + " not found.");
	}

	// this function acts similarly to the three previous ones, takes an updatedString and contactId as arguments to execute
	// uses contactId to search contactList for a match
	public void updateAddress(String updatedString, String contactID) {
		
		// use an iterator to iterate over contactList
	    Iterator<Contact> iterator = contactList.iterator();
	    while (iterator.hasNext()) {
	        Contact contact = iterator.next();
	        
	        // if a match is found
	        if (contact.getContactID().equals(contactID)) {
	            
	        	// update the address with what you input earlier
	        	contact.setAddress(updatedString);  
	        	
	            // output message to console to confirm the update was successful
	            System.out.println("Contact ID: " + contactID + " updated successfully.");
	            
	            // exits function after successful update
	            return;  
	        }
	    }
	    // print an error message if the contactId was not found
	    System.out.println("Contact ID: " + contactID + " not found.");
	}
}