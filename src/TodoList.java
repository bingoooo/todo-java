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
		System.out.println("Tâche '" + t.label + "' => " + t.state);
		System.out.printf("Tâche '%s' => '%s'", t2.label, t2.state);
		
	}
}
