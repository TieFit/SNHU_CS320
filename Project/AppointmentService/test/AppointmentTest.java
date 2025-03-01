package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import production.Appointment;

// there are only 4 tests that need to be done for this portion
// 2 of these check if the date or description fields are null
// 1 tests the description length
// 1 tests that the date is not in the past

// Id does not need either tests as it is randomly generated using AtomicLong it will never be null or greater than 10 characters
// Also the Id is declared as final/static so once it has been created it cannot be changed

class AppointmentTest {
	
	// tests if date is null
	@Test
	@DisplayName("Date will not be null.")
	void testDateNotNull() {
		
		// create appointment object
		Appointment appointment = new Appointment(null, "description");
		
		// check if appointment is null
		assertNotNull(appointment.getDate(), "date was null");
	}
	
	// tests if description is null
	@Test
	@DisplayName("description will not be null")
	void testAppointmentDescriptionNotNull() {
		
		// use calendar to set the date to what is desired
		Calendar calendar = Calendar.getInstance();
		calendar.set(2025, Calendar.FEBRUARY, 25);
	
		// convert calendar to date
		Date date = calendar.getTime();
		
		// create appointment object
		Appointment appointment = new Appointment(date, null);
		
		// check that description is not null
		assertNotNull(appointment.getDescription(), "description was null.");
	}
	
	// tests if description is > 50 characters
	@Test
	@DisplayName("description will not be longer than 50 characters")
	void testDescriptionNotLongerThan50() {
		
		// use calendar to set the date to what is desired
		Calendar calendar = Calendar.getInstance();
		calendar.set(2025, Calendar.FEBRUARY, 25);
			
		// convert calendar to date
		Date date = calendar.getTime();
				
		// create appointment object
		Appointment appointment = new Appointment(date, "Once Upon A Time There Was An Elven Mage Who Strode Through The Lands of Deatnaem And Ferried Joy Wherever She Traveled");
		
		if (appointment.getDescription().length() > 50) {
			fail("description has more than 50 characters");
		}
	}
	
	// tests if date is in past
	@Test
	@DisplayName("date will not be in past")
	void testAppointmentDateNotInPast() {
			
		// use calendar to set the date to what is desired
		Calendar calendar = Calendar.getInstance();
		calendar.set(2025, Calendar.FEBRUARY, 25);
		
		// convert calendar to date
		Date date = calendar.getTime();
			
		// create appointment object
		Appointment appointment = new Appointment(date, "description");
			
		if (appointment.getDate().before(new Date())) {
			fail("date is in the past");
		}
	}
	

}	