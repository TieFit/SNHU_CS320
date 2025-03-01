package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import production.Task;


// there are only 4 tests that need to be done for task
// two of these are for testing if name or description is null
// the other two are for testing name and descriptions length 

// Id does not need either tests as it is randomly generated using AtomicLong it will never be null or greater than 10 characters
// Also the Id is declared as final/static so once it has been created it cannot be changed
class TaskTest {
	
	// tests if name is null
	@Test
	@DisplayName("name will not be null")
	void testTaskNameNotNull() {
		Task task = new Task(null, "description");
		assertNotNull(task.getName(), "name was null.");
	}
	
	// tests if description is null
	@Test
	@DisplayName("description will not be null")
	void testTaskDescriptionNotNull() {
		Task task = new Task("name", null);
		assertNotNull(task.getName(), "description was null.");
	}
	
	// tests if name has more than 20 characters
	@Test
	@DisplayName("name will not be longer than 20 characters")
	void testTaskNameWithMoreThanTwentyCharacters() {
		Task task = new Task("0123456789012345678", "description");
		if (task.getName().length() > 20) {
			fail("Name has more than 20 characters.");
		}
	}
	
	// tests if description has more than 50 characters
	@Test
	@DisplayName("description will not be longer than 50 characters")
	void testTaskDescriptionWithMoreThanFiftyCharacters() {
		Task task = new Task("name", "Once Upon A Time There Was An Elven Mage Who Strode Through The Lands of Deatnaem And Ferried Joy Wherever She Traveled");
		if (task.getDescription().length() > 50) {
			fail("description has more than 50 characters.");
		}
	}

}
