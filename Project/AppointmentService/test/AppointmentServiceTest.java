package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import production.Appointment;
import production.AppointmentService;

class AppointmentServiceTest {
	
	// test to add appointment
	@Test
	@DisplayName("test to ensure appointment with a unique id can be added")
	@Order(1)
	void testAddAppointment() {
		AppointmentService service = new AppointmentService();
		
		// use calendar to set the date to what is desired
		Calendar calendar = Calendar.getInstance();
		calendar.set(2025, Calendar.FEBRUARY, 25);
			
		// convert calendar to date
		Date date = calendar.getTime();
				
		// add appointment with these parameters
		service.addAppointment(date, "Travel to Fire Falls and slay the dragon!\n");
		
		// call this function to display this appointment to the terminal and show what their appointmentId is
		service.displayAppointmentList();
		
		// this ensures the appointment is not null and that it was added
		assertNotNull(service.getAppointment("5"), "appointment was not added");
	}
	
	
	// tests that appointments can be deleted
	@Test
	@DisplayName("test to ensure appointments can be deleted")
	@Order(2)
	void testDeleteAppointment() {
		AppointmentService service = new AppointmentService();
		
		// use calendar to set the date to what is desired
		Calendar calendar = Calendar.getInstance();
		calendar.set(2025, Calendar.FEBRUARY, 25);
					
		// convert calendar to date
		Date date = calendar.getTime();
		
		// add appointment with these parameters
		service.addAppointment(date, "Spread joy at the harvest festival!\n");
		
		// delete appointment with id of 2
		service.deleteAppointment("2");
		
		// confirm that appointmentList is empty by creating an empty appointmentList to compare it with
		ArrayList<Appointment> appointmentListEmpty = new ArrayList<Appointment>();
		
		// call this function to display this appointment to the terminal and show what their appointmetnId is
		service.displayAppointmentList();
		
		// checks if the appointment was deleted
		assertEquals(service.appointmentList, appointmentListEmpty, "The appointment was not deleted.");
	}
}