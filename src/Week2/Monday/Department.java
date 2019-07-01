package Week2.Monday;

public class Department {
	
	private int id;
	private String departmentName;
	
	public int getId() { return id; }
	public void setId(int id) {	this.id = id; }
	
	public String getDepartmentName() { return departmentName; }
	public void setDepartmentName(String name) { this.departmentName = name;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id != other.id)
			return false;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		return true;
	}

	
}
