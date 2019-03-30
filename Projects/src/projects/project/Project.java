package projects.project;

import java.util.ArrayList;
import java.util.Date;

import projects.dep.Employee;
import projects.status.Status;
import projects.tasks.Task;

public class Project {
	private String Name;
	private ArrayList<Task> Tasks = new ArrayList<Task>();
	private ArrayList<Employee> Members = new ArrayList<Employee>();
	private Date Due;
	private Status status;
	private Employee Manager;
	
	public Project(String name, ArrayList<Task> tasks, ArrayList<Employee> members, Date due, Status status,
			Employee manager) {
		Name = name;
		Tasks = tasks;
		Members = members;
		Due = due;
		this.status = status;
		Manager = manager;
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
	 * @return the due
	 */
	public Date getDue() {
		return Due;
	}
	
	/**
	 * @param due the due to set
	 */
	public void setDue(Date due) {
		Due = due;
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
	 * @return the manager
	 */
	public Employee getManager() {
		return Manager;
	}
	
	/**
	 * @param manager the manager to set
	 */
	public void setManager(Employee manager) {
		Manager = manager;
	}
	
	/**
	 * @return the tasks
	 */
	public ArrayList<Task> getTasks() {
		return Tasks;
	}
	
	/**
	 * @return the members
	 */
	public ArrayList<Employee> getMembers() {
		return Members;
	}
	
	
	void AddMember(Employee emp) {
		Members.add(emp);
	}
	
	void RemoveMember(Employee emp) {
		Members.remove(emp);
	}
	
	void AddTask(Task task) {
		Tasks.add(task);
	}
	
	void RemoveTask(Task task) {
		Tasks.remove(task);
	}
	
	void UpdateTask(Task task) {
		for (Task t : Tasks) {
			if(t.toString().equals(task.toString())) {
				RemoveTask(t);
				AddTask(task);
				return;
			}
		}
	}
	
	ArrayList<Task> GetTask(Employee emp) {
		ArrayList<Task> tasks = new ArrayList<Task>();
		for (Task task : Tasks) {
			if(task.getWorker().equals(emp)) {
				tasks.add(task);
			}
		}
		return tasks;
	}
}
