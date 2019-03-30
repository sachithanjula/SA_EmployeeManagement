package employeeclient;

import java.util.ArrayList;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.addemployee.object.Employee;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private ArrayList<Employee> empList = new ArrayList<>();
	Employee emp = new Employee();

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Starting Employee Client.....");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter First Name:- ");
		emp.setFirstName(scanner.nextLine());
		
		System.out.print("Enter Second Name:- ");
		emp.setSecondName(scanner.nextLine());
		
		System.out.print("Enter Age:- ");
		emp.setAge(scanner.nextInt());
		
		System.out.print("Enter Salary:- ");
		emp.setSalary(scanner.nextDouble());
		
		System.out.print("Enter Designation:- ");
		emp.setDesignation(scanner.nextLine());
		
		scanner.close();
		
		empList.add(emp);
		
		System.out.println(empList.toString());
		
		System.out.println("Started Employee Client!");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Stopped Employee Client!");
	}

}
