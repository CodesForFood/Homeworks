package Week2.Monday;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees = createSmallCompany();
		
		noManager(employees);
		
	}
	
	public static void managerIsJulie(List<Employee> employees) {
		
		employees.stream().filter(emp -> emp.getManagerId() == 3).collect(Collectors.toList());	
	}
	
	public static void noManager(List<Employee> employees) {
		List<Employee> noManagers = employees.stream().filter(emp -> emp.getManagerId() == null).collect(Collectors.toList());
		
		String result = noManagers.stream().map(e -> e.getName())
				.collect(Collectors.joining(" and ", "No manager: ", " have no manager" ));
		
		System.out.println(result);
		
	}
	
	private static List<Employee> createSmallCompany() {

		Department technologyDept = new Department();
		technologyDept.setId(1);
		technologyDept.setDepartmentName("Technology");
		
		Department hrDept = new Department();
		hrDept.setId(2);
		hrDept.setDepartmentName("Human Resource");
		
		Department payrollDept = new Department();
		payrollDept.setId(3);
		payrollDept.setDepartmentName("Payroll");
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, "Tom", 200000, null, hrDept));
		employees.add(new Employee(2, "Joe", 95000, 1, hrDept));
		
		employees.add(new Employee(3, "Julie", 180000, null, technologyDept));
		employees.add(new Employee(4, "Adam", 140000, 3, technologyDept));
		employees.add(new Employee(5, "James", 135000, 3, technologyDept));
		
		employees.add(new Employee(6, "Jake", 125000, null, payrollDept));
		
		return employees;
	}
	
}
