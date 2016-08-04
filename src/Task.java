/**
 * Tasks description class
 */

/**
 * @author Benjamin DANT
 *
 */
public class Task {
	/*
	 * @param
	 */
	public String label = "New Task";
	public Boolean state = Boolean.FALSE;
	
	/*
	 * Default Constructor
	 */
	public Task(){
		super();
	}
	
	/*
	 * Custom Constructor
	 */
	public Task(String lbl, Boolean st){
		this.label = lbl;
		this.state = st;
	}
	
	/*
	 * Returns a string
	 */
	public String toString(){
		String toString = "";
		return toString;
	}
	
	/*
	 * Put the Task status to "done" (true)
	 */
	public void done(){
		// TODO : Code when a task is completed
	}
	
	/*
	 * Returns the Tasks status
	 */
	public Boolean isDone(){
		Boolean isDone = Boolean.FALSE;
		return isDone;
	}
	
	// Method that returns the Task label
	public String getLabel(){
		return this.label;
	}
	
	// Method that sets the Task label
	public void setLabel(String newLabel){
		this.label = newLabel;
	}
}
