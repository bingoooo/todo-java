/**
 * Tasks description class
 */

/**
 * @author Benjamin DANT
 *
 */
public class Task {
	public String label = "";
	public Boolean state = Boolean.FALSE;
	
	public Task(){
		super();
	}
	
	public String toString(){
		String toString = "";
		return toString;
	}
	
	public void done(){
		// TODO : Code when a task is completed
	}
	
	public Boolean isDone(){
		Boolean isDone = Boolean.FALSE;
		return isDone;
	}
	
	public String getLabel(){
		return this.label;
	}
	
	public void setLabel(String newLabel){
		this.label = newLabel;
	}
}
