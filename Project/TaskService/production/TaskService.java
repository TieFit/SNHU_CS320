package production;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskService {
	
	// array list will hold all tasks
	public ArrayList<Task> taskList = new ArrayList<Task>();
	
	// this function can be ran to display all tasks to the console
	// this is useful for checking what the taskId is for a task
	// also it can be used to confirm if a task was updated as it was supposed to be
	public void displayTaskList() {
		
	    // Iterate through each task in the taskList
	    for (Task task : taskList) {
	        System.out.println("\t Task ID: " + task.getTaskId());
	        System.out.println("\t Name: " + task.getName());
	        System.out.println("\t Description: " + task.getDescription());
	    }
	}
	
	// getter function for getting tasks
	public Task getTask(String taskId) {
		
	    // set task as placeholder in case a task is not found
	    Task task = new Task(null, null);
	    
	    // iterate over taskList using an iterator
	    Iterator<Task> iterator = taskList.iterator();
	    while (iterator.hasNext()) {
	        Task currentContact = iterator.next();
	        
	        // if a match is found, assign the matched task to the task variable
	        if (currentContact.getTaskId().contentEquals(taskId)) {
	            task = currentContact;
	            
	            // breaks loop after match is found
	            break;  
	        }
	    }
	    
	    // Return either the matched task, or the placeholder task if no match was found
	    return task;
	}
	
	// Adds a new task using the Task constructor, then assign the new task to the list.
	// function to add a new task, passes values from Task constructor to then add it to task list
	public void addTask(String name, String description) {
		
		// create new task using values from Task constructor
		Task task = new Task(name, description);
			
		// add the newly created task to the taskList
		taskList.add(task);
	}
	
	// function to delete task by using its taskId
	public void deleteTask(String taskId) {
			
		// use an iterator to iterate over the taskList
		Iterator<Task> iterator = taskList.iterator();
		while (iterator.hasNext()) {
			Task task = iterator.next();
		        
			// if taskId equals the taskId being searched for
		    if (task.getTaskId().equals(taskId)) {
		    	
		    	// remove the task using the iterator
		    	iterator.remove(); 
		            
		        // output a message to confirm the task was deleted
		        System.out.println("Task ID: " + taskId + " has been deleted.\n");
		            
		        // exits the function after the matched contact is deleted
		        return;  
		    }
		}
		    
		// if no match was found
		System.out.println("Task ID: " + taskId + " not found.");
	}
		
	// function to update the name of a task
	// uses taskId to search taskList for a match
	// takes updated name as an argument as well to update name when match is found
	public void updateName(String updatedString, String taskId) {
			
		// use an iterator to iterate over taskList
		Iterator<Task> iterator = taskList.iterator();
		while (iterator.hasNext()) {
		    Task task = iterator.next();
		        
		    // if a match is found
		    if (task.getTaskId().equals(taskId)) {
		        	
		    	// update the name with what you input earlier
		        task.setName(updatedString);
		            
		        // output message to console to confirm the update was successful
		        System.out.println("Task ID: " + taskId + " updated successfully.");
		            
		        // exits function after successful update
		        return;  
		    }
		}
		    
		// print an error message if the taskId was not found
		System.out.println("Task ID: " + taskId + " not found.");
	}	
	
	// follows same logic as function before this, instead it updates the description
	public void updateDescription(String updatedString, String taskId) {
		
		// use an iterator to iterate over taskList
		Iterator<Task> iterator = taskList.iterator();
		while (iterator.hasNext()) {
		    Task task = iterator.next();
		        
		    // if a match is found
		    if (task.getTaskId().equals(taskId)) {
		        	
		    	// update the name with what you input earlier
		        task.setDescription(updatedString);
		            
		        // output message to console to confirm the update was successful
		        System.out.println("Task ID: " + taskId + " updated successfully.");
		            
		        // exits function after successful update
		        return;  
		    }
		}
		    
		// print an error message if the taskId was not found
		System.out.println("Task ID: " + taskId + " not found.");
	}		
		
}





































