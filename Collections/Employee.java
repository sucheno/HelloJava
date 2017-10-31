// Suchen Oguri
public class Employee {
	
	public String empId;
	public String empName;	
	public int sal;
	
	public Employee(String empId, String empName, int sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}
	
}
