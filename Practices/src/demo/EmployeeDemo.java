package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDemo {
private int EmployeeNum ;
private String Name;

public EmployeeDemo(String Name,int EmployeeNum) {
	this.Name= Name;
	this.EmployeeNum = EmployeeNum;
	
}


	public int getEmployeeNum() {
	return EmployeeNum;
}


public void setEmployeeNum(int employeeNum) {
	EmployeeNum = employeeNum;
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}



	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<EmployeeDemo> employee = Arrays.asList(
				new EmployeeDemo("John Doe", 101),
			    new EmployeeDemo("Jane Smith", 102),
			    new EmployeeDemo("Michael Johnson", 103),
			    new EmployeeDemo("Emily Davis", 104)
			    );
		
		int target =102;
Optional <EmployeeDemo> employees =employee.stream().filter(e -> e.getEmployeeNum() == target ).findFirst()
;

if(employees.isPresent()) {
	System.out.println("Employee found : " + employees.get().getName());
}
else
	System.out.println("Employee number : " + target + "not found" );
	}


}
