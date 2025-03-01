package production;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;

public class AppointmentService {
	
	// array list will hold all appointments
	public ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();
	
	// this function can be ran to display all appointments to the console
	// this is useful for checking what the appointmentId is for an appointment
	public void displayAppointmentList() {
			
		// Iterate through each task in the taskList
		for (Appointment appointment : appointmentList) {
			System.out.println("\t Appointment ID: " + appointment.getAppointmentId());
		    System.out.println("\t Date: " + appointment.getDate());
		    System.out.println("\t Description: " + appointment.getDescription());
		}
	}
	
	// getter function for getting appointments
	public Appointment getAppointment(String appointmentId) {
		
		// set as placeholder in case appointment is not found
		Appointment appointment = new Appointment(null, null);
		
		// iterate over appointmentList using an iterator
		Iterator<Appointment> iterator = appointmentList.iterator();
		
	    while (iterator.hasNext()) {
	        Appointment currentAppointment = iterator.next();
	        
	        // if a match is found, assign the matched task to the task variable
	        if (currentAppointment.getAppointmentId().contentEquals(appointmentId)) {
	            appointment = currentAppointment;
	            
	            // breaks loop after match is found
	            break;  
	        }
	        
	    }
	    
        return appointment;
	}
	
	// Adds a new appointment using the Appointment constructor, then assign the new appointment to the list.
	public void addAppointment(Date date, String description) {
			
		// create new appointment using values from appointment constructor
		Appointment appointment = new Appointment(date, description);
				
		// add the newly created appointment to the appointmentList
		appointmentList.add(appointment);
	}
		
	// function to delete appointment by using its appointmentId
	public void deleteAppointment(String appointmentId) {
				
		// use an iterator to iterate over the appointmentList
		Iterator<Appointment> iterator = appointmentList.iterator();
		
		while (iterator.hasNext()) {
			Appointment appointment = iterator.next();
			        
			// if appointmentId equals the appointmentId being searched for
			if (appointment.getAppointmentId().equals(appointmentId)) {
			    	
			    // remove the appointment using the iterator
			    iterator.remove(); 
			            
			    // output a message to confirm the appointment was deleted
			    System.out.println("Appointment ID: " + appointmentId + " has been deleted.\n");
			            
			    // exits the function after the matched appointment is deleted
			    return;  
			}
		}
			    
		// if no match was found
		System.out.println("Appointment ID: " + appointmentId + " not found.");
	}	
}