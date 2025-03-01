package production;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	private final String contactID;
	
	// AtomicLong is used for generating unique IDs
	private static AtomicLong idGenerator = new AtomicLong();
	

	public Contact(String firstName, String lastName, String number, String address) {

		// contactID is generated when constructor is called. it is also set as static and has no getters or setters as it should stay the same after being called
		this.contactID = String.valueOf(idGenerator.getAndIncrement());

		// if first name is null or empty
		if (firstName == null || firstName.isEmpty()) {
					
			// first name will be equal to "nullFN", as a placeholder so it can easily identified this condition was triggered
			this.firstName = "nullFN";

		// else if first name is longer than 10 characters, set firstName equal to "nullFN1" (FN is short for first name) so it is differientiated from the conditional before this
		} else if (firstName.length() > 10) {
			this.firstName = "nullFN1";
				
		// else, the firstName variable is neither null/empty nor is it longer than 10 characters. thus it is acceptable and is assigned
		} else {
			this.firstName = firstName;
		}

		// if last name is null or empty
		if (lastName == null || lastName.isEmpty()) {
					
			// last name will be equal to "nullLN", as a placeholder so it can easily identified this condition was triggered
			this.lastName = "nullLN";
					
		// else if last name is longer than 10 characters, set lastName equal to "nullLN1" (LN is short for last name) so it is differientiated from the conditional before this
		// 1 in null shows difference to distinguish between the conditional before it
		// then output a message saying it cannot be longer than 10 characters
		} else if (lastName.length() > 10) {
			this.lastName = "nullLN1";
					
		// else, the lastName variable is neither null/empty nor is it longer than 10 characters. thus it is acceptable and is assigned
		} else {
			this.lastName = lastName;
		}
		
		// if number is null or empty 
		if (number == null || number.isEmpty() || number.length() != 10) {
					
			// number will be set to "nullNum" to show that this error was encountered
			this.number = "nullNum";
					
		// else if length of number does not equal 10
		// set number equal to "nullNum1" to identify it is not equal to 10 characters
		} else if (number.length() != 10) {
			this.number = "nullNum1";
		}
					
		// else, no earlier conditions are met. the number is acceptable and will remain as such
		else {
			this.number = number;
		}
		
		// if address is null or empty
		if (address == null || address.isEmpty()) {
					
			// address will be equal to nullAdd as a placeholder so this issue can be easily identified
			this.address = "nullAdd";
					
		// else if address is longer than 30 characters, set address to "nullAdd1" so it can be differientiated from conditional before this
		} else if (address.length() > 30) {
			this.address = "nullAdd1";
					
		// else, no earlier conditions are met. the address is fine and will remain as such
		} else {
			this.address = address;
		}
	}

	// getters, functions that are created for easily retrieving information later on
	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNumber() {
		return number;
	}

	public String getAddress() {
		return address;
	}

	// setters, functions that are created for easily setting information according to the requirements put forth
	// this setter is for setting the FirstName variable
	public void setFirstName(String firstName) {
		
		// if first name is null or empty
		if (firstName == null || firstName.isEmpty()) {
			
			// first name will be equal to "nullFN", as a placeholder so it can easily identified this condition was triggered
			this.firstName = "nullFN";

		// else if first name is longer than 10 characters, set firstName equal to "nullFN1" (FN is short for first name) so it is differientiated from the conditional before this
		} else if (firstName.length() > 10) {
			this.firstName = "nullFN1";
		
		// else, the firstName variable is neither null/empty nor is it longer than 10 characters. thus it is acceptable and is assigned
		} else {
			this.firstName = firstName;
		}
	}
	
	
	// this setter pertains to the lastName variable
	public void setLastName(String lastName) {
		
		// if last name is null or empty
		if (lastName == null || lastName.isEmpty()) {
			
			// last name will be equal to "nullLN", as a placeholder so it can easily identified this condition was triggered
			this.lastName = "nullLN";
			
		// else if last name is longer than 10 characters, set lastName equal to "nullLN1" (LN is short for last name) so it is differientiated from the conditional before this
		// 1 in null shows difference to distinguish between the conditional before it
		// then output a message saying it cannot be longer than 10 characters
		} else if (lastName.length() > 10) {
			this.lastName = "nullLN1";
			
		// else, the lastName variable is neither null/empty nor is it longer than 10 characters. thus it is acceptable and is assigned
		} else {
			this.lastName = lastName;
		}
	}
	
	// this setter pertains to the number variable
	public void setNumber(String number) {
		
		// if number is null or empty 
		if (number == null || number.isEmpty() || number.length() != 10) {
			
			// number will be set to "nullNum" to show that this error was encountered
			this.number = "nullNum";
			
		// else if length of number does not equal 10
		// set number equal to "nullNum1" to identify it is not equal to 10 characters
		} else if (number.length() != 10) {
			this.number = "nullNum1";
		}
			
		// else, no earlier conditions are met. the number is acceptable and will remain as such
		 else {
			this.number = number;
		}
	}
	
	// this setter pertains to the address variable
	public void setAddress(String address) {
		
		// if address is null or empty
		if (address == null || address.isEmpty()) {
			
			// address will be equal to nullAdd as a placeholder so this issue can be easily identified
			this.address = "nullAdd";
			
		// else if address is longer than 30 characters, set address to "nullAdd1" so it can be differientiated from conditional before this
		} else if (address.length() > 30) {
			this.address = "nullAdd1";
			
		// else, no earlier conditions are met. the address is fine and will remain as such
		} else {
			this.address = address;
		}
	}
}