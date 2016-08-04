/**
 * Task List class not yet used
 */

/**
 * @author Benjamin DANT
 *
 */
public class TaskList {
	public Task[] tasks = new Task[10];
	public int nbTasks = 0;
	
	public TaskList() {
		super();
	}
	
	public void addTask() {
		
	}
	
	public Boolean taskDone() {
		return true;
	}
	
	public void done(){
		
	}
	
	/*
	 * Display task list as strings
	 * @return Task list and state
	 */
	public String toString() {
		String someString = "";
		
		for (int i = 0; i < nbTasks; i++){
			someString += i + 1 + "/" + nbTasks + ": " + tasks[i] + "\n";
		}
		
		return someString;
	}
}
