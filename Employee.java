/**
 * The class employee contains the following pieces of data about a employee:
 * emp (name of the employee stored as string), supervior (name of the supervisor
 * stored as a string) and salary (the money that employee earn, stroed as a double).
 * this information is private to the class. Clients can obtain this information
 * only by using the various methods defined by the class 
 * @author User
 */

public class Employee {

	/**
	 * Creates a new objet Employee with the specified name, responsable and salary
	 * @param name The employee's name as a string
	 * @param responsable The employee's supervisor as a string
	 * @param money The employee's salary as a double
	 */
	public Employee (String name, String responsable, Double money){
			emp = name;
			supervisor = responsable;
			salary = money;
	}
	/**
	 * Gets the employee name
	 * @return The employee name
	 */
	public String getName(){
		return emp;
	}
	/**
	 * Gets the employee's supervisor
	 * @return The employee supervisor
	 */
	public String getResponsable(){
		return supervisor;
	}
	/**
	 * 
	 * @return
	 */
	public double getMoney(){
		return salary;
	}
	/**
	 * 
	 * @param money
	 * @return
	 */
	public void setSalary(double money){
		salary = money;
	}
	/**
	 * 
	 * @param mane
	 * @return
	 */
	public void setEmp(String mane){
		emp = mane;
	}
	
	public void setSupervisor(String responsable){
		supervisor = responsable;
	}
	
	/**
	 * 
	 * @return
	 */
	public String toString(){
		return "Employee : " + getName() + " Boss: " + getResponsable() + " salary " + getMoney(); 
	}
	
	// private instance variables
	private String emp;
	private String supervisor;
	private double salary;
}


