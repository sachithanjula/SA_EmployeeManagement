package projects.tasks;

import projects.dep.Employee;
import projects.status.Status;

public class Task {
	private String Name;
	private Status status;
	private Employee Worker;
	
	public Task(String name, Status status, Employee worker) {
		Name = name;
		this.status = status;
		Worker = worker;
	}

	public Task(String name, Employee worker) {
		Name = name;
		Worker = worker;
		status = Status.ON_HOLD;
	}

	public Task(String name) {
		Name = name;
		Worker = null;
		status = Status.UNASSIGNED;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	
	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	
	/**
	 * @return the worker
	 */
	public Employee getWorker() {
		return Worker;
	}
	
	/**
	 * @param worker the worker to set
	 */
	public void setWorker(Employee worker) {
		Worker = worker;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Name;
	}
}
