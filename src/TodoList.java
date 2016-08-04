/**
 * 
 */

/**
 * @author Benjamin DANT
 *
 */
public class TodoList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task t = new Task();
		
		t.label = "Test";
		t.state = false;
		
		System.out.println("Tâche '" + t.label + "' => " + t.state);

	}

}
