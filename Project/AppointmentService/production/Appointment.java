package production;

import java.util.concurrent.atomic.AtomicLong;
import java.util.Calendar;
import java.util.Date;

public class Appointment {
	private Date date;
	private String description;
	private final String appointmentId;
	
	// AtomicLong is used for generating unique IDs
	private static AtomicLong idGenerator = new AtomicLong();
	
	@SuppressWarnings("deprecation")
	public Appointment(Date date, String description) {
		
		// uses atomiclong to generate an id
		this.appointmentId = String.valueOf(idGenerator.getAndIncrement());
		
		// this shall be a placeholder date if date is null
		if (date == null) {
			this.date = new Date(2000, Calendar.JANUARY, 1);
		}
		
		// throw an exception if the date is before what the current date is
		else if (date.before(new Date())) {
			throw new IllegalArgumentException("Cannot make appointment before current date.");
		}
		
		// the date is fine and can continue
		else {
			this.date = date;
		}
		
		// if null set to null to identify this was flagged
		if (description == null) {
			this.description = "null";
		}
		
		// else if length > 50, set to null1 to show this was flagged
		else if (description.length() > 50) {
			this.description = "null1";
		}
		
		// else description is fine and can continue
		else {
			this.description = description;
		}
	}
	
	// getters for retrieving information later on
	public String getAppointmentId() {
		return appointmentId;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getDescription() {
		return description;
	}
	
	// setter for setting the date
	@SuppressWarnings("deprecation")
	public void setDate(Date date) {
		
		// this shall be a placeholder date if date is null
		if (date == null) {
			this.date = new Date(2000, Calendar.JANUARY, 1);
		}
				
		// throw an exception if the date is before what the current date is
		else if (date.before(new Date())) {
			throw new IllegalArgumentException("Cannot make appointment before current date.");
		}
				
		// the date is fine and can continue
		else {
			this.date = date;
		}
				
	}
	
	// setter for setting the description
	public void setDescription(String description) {
		
		// if null set to null to identify this was flagged
		if (description == null) {
			this.description = "null";
		}
				
		// else if length > 50, set to null1 to show this was flagged
		else if (description.length() > 50) {
			this.description = "null1";
		}
				
		// else description is fine and can continue
		else {
			this.description = description;
		}
	}	
}