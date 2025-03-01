package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import production.Task;
import production.TaskService;

class TaskServiceTest {
	
	// tests that tasks can be added
	@Test
	@DisplayName("test to ensure tasks with a unique id can be added")
	@Order(4)
	void testAddContact() {
		TaskService service = new TaskService();
		
		// add task with these parameters
		service.addTask("Extermination", "Travel to Fire Falls and slay the dragon\n");
		
		// call this function to display this task to the terminal and show what their taskId is
		service.displayTaskList();
		
		// this ensures the task is not null and that it was added
		assertNotNull(service.getTask("5"), "Task was not added");
	}
	
	
	// tests that tasks can be deleted
	@Test
	@DisplayName("test to ensure tasks can be deleted")
	@Order(3)
	void testDeleteTask() {
		TaskService service = new TaskService();
		
		// add task with these parameters
		service.addTask("ATTACK", "Travel to Fire Falls and slay the dragon\n");
		
		// delete task with id of 0
		service.deleteTask("4");
		
		// confirm that taskList is empty by creating an empty taskList to compare it with
		ArrayList<Task> taskListEmpty = new ArrayList<Task>();
		
		// call this function to display this task to the terminal and show what their TaskId is
		service.displayTaskList();
		
		// checks if the task was deleted
		assertEquals(service.taskList, taskListEmpty, "The contact was not deleted.");
	}
	
	// tests that task name can be updated
	@Test
	@DisplayName("test to update name.")
	@Order(1)
	void testUpdateName() {
		TaskService service = new TaskService();
		
		// add task with these parameters
		service.addTask("Homecoming", "description\n");
		
		// update name for id 0 with the name "HEHEHEHE"
		service.updateName("HEHEHEHE", "0");
		
		// call this function to display this task to the terminal and show what their taskId is
		service.displayTaskList();
		
		// checks if name was updated
		assertEquals("HEHEHEHE", service.getTask("0").getName(), "name was not updated.");
	}
	
	// tests that task description can be updated
	@Test
	@DisplayName("test to update description")
	@Order(2)
	void testUpdateDescription() {
		TaskService service = new TaskService();
		
		// add task with these parameters
		service.addTask("name", "Go to the castle and meet the elven princess.\n");
		
		// update description for id 2 with the name "GO AND SEE STUFF!!"
		service.updateDescription("GO AND SEE STUFF!!", "2");
		
		// call this function to display this contact to the terminal and show what their contactId is
		service.displayTaskList();
		
		// checks if the description was updated
		assertEquals("GO AND SEE STUFF!!", service.getTask("2").getDescription(), "description was not updated.");
	}
}