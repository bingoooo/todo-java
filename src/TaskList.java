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
	
	/*
	 * Add a Task
	 * @param newTask Task to add
	 * @return <ul>
	 * 		<li> true : task have been added</li>
	 * 		<li> false : task hasn't been added</li>
	 * 		</ul>
	 */
	public Boolean addTask(Task newTask) {
		if (nbTasks == 10){
			String label = newTask.getLabel();
			System.out.println("No more space  to insert : " + label);
			return false;
		} else {
			tasks[nbTasks++] = newTask;
			return true;
		}
	}
	public Boolean addTask(String label){
		Task newTask = new Task(label);
		
		return addTask(newTask);
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
