/**
 * Tasks description class
 */

/**
 * @author Benjamin DANT
 *
 */
public class Task {
	private String label = "New Task";
	private Boolean state = Boolean.FALSE;
	
	/*
	 * Default Constructor
	 */
	public Task(){
		super();
	}
	
	/*
	 * Custom Constructor
	 * @param label Task name
	 * @param st Task status
	 */
	public Task(String lbl, Boolean st){
		this.label = lbl;
		this.state = st;
	}
	
	/*
	 * Returns a string
	 * @return Returns Task name and status
	 */
	public String toString(){
		return "Tâche '" + this.label + " => " + this.state;
	}
	
	/*
	 * Put the Task status to "done" (true)
	 */
	public void done(){
		this.state = true;
	}
	
	/*
	 * Returns the Tasks status
	 * @return Returns status true/false
	 */
	public Boolean isDone(){
		return this.state;
	}
	
	/* Method that returns the Task label
	 * @return Returns Task.label property
	 */
	public String getLabel(){
		return this.label;
	}
	
	/* Method that sets the Task label
	 * @param newLabel String that will replace the previous label
	 */
	public void setLabel(String newLabel){
		this.label = newLabel;
	}
}
