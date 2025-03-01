package production;

import java.util.concurrent.atomic.AtomicLong;

public class Task {
	private String name;
	private String description; 
	private final String taskId;
	
	// AtomicLong is used for generating unique IDs
	private static AtomicLong idGenerator = new AtomicLong();
	
	
	public Task(String name, String description) {
		
		// taskId is generated when constructor is called. it is also set as static and has no getters or setters as it should stay the same after being called
		this.taskId = String.valueOf(idGenerator.getAndIncrement());
		
		// if name is null or empty, set name to "nullN" to easily identify what the issue is 
		if (name == null || name.isEmpty()) {
			this.name = "nullN";
		}
		
		// else if the name is greater than 20 characters long, set name to "nullN1" to identify what the issue is
		else if (name.length() > 20) {
			this.name = "nullN1";
		}
		
		// else name is acceptable and will be assigned to name
		else {
			this.name = name;
		}
		
		// if description is null or empty, set name to "nullD" to easily identify what the issue is 
		if (description == null || description.isEmpty()) {
			this.description = "nullD";
		}
		
		// else if the description is greater than 50 characters long, set name to "nullD1" to identify what the issue is
		else if (description.length() > 50) {
			this.description = "nullD1";
		}
		
		// else description is acceptable and will be assigned to description
		else {
			this.description = description;
		}
	}
	
	// getters, functions that are created for easily retrieving information later on
	public String getTaskId() {
		return taskId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	// setters, functions that are created for easily setting information according to the requirements put forth
	// this setter is used for setting name
	public void setName(String name) {
		
		// if name is null or empty, set name to "nullN" to easily identify what the issue is 
		if (name == null || name.isEmpty()) {
			this.name = "nullN";
		}
				
		// else if the name is greater than 20 characters long, set name to "nullN1" to identify what the issue is
		else if (name.length() > 20) {
			this.name = "nullN1";
		}
				
		// else name is acceptable and will be assigned to name
		else {
			this.name = name;
		}
	}
	
	// this setter is used for setting description
	public void setDescription(String description) {
		
		// if description is null or empty, set name to "nullD" to easily identify what the issue is 
		if (description == null || description.isEmpty()) {
			this.description = "nullD";
		}
				
		// else if the description is greater than 50 characters long, set name to "nullD1" to identify what the issue is
		else if (description.length() > 50) {
			this.description = "nullD1";
		}
				
		// else description is acceptable and will be assigned to description
		else {
			this.description = description;
		}
	}	
}