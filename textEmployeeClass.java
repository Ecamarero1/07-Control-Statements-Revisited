/*
*	textEmployeeClass.java
*
*	Checks the class Employee
*
*/

import acm.program.*;
import java.math.*;

public class textEmployeeClass extends ConsoleProgram{
	
	public void run(){
		
		Employee Administrative = new Employee("Eduardo", "Maria Eugenia", 26000.0);
		String name = Administrative.getName();
		println(name);
		Administrative.setSalary(30000.0);
		double salary = Administrative.getMoney();
		println("new salay " + salary);
		
	}
}