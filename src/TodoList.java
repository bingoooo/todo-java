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
		Task t = new Task("Test", false);
		Task t2 = new Task();
		
		// System Console output
		System.out.println(t);
		System.out.println(t2);
		t.done();
		System.out.println(t);
		
		if(t.isDone()) {
			System.out.println("Task is Done !!");
		} else {
			System.out.println("Task is TO DO !!");
		}
		
	}
}
