/**
 * Todo List Main class
 */

/**
 * @author Benjamin DANT
 *
 */
public class TodoList {

	/**
	 * @param args
	 */
	
	// Application main entry method
	public static void main(String[] args) {
		// Calls to Task class to create newtask
		TaskList list = new TaskList();
		
		list.addTask("Test 1");
		list.addTask("Test 2");
		list.addTask("Test 3");
		list.addTask("Test 4");
		list.addTask("Test 5");
		list.addTask("Test 6");
		list.addTask("Test 7");
		list.addTask("Test 8");
		list.addTask("Test 9");
		list.addTask("Test 10");
		list.addTask("Test 11");
		list.addTask("Test 12");
		
		System.out.println(list);
	}
}
