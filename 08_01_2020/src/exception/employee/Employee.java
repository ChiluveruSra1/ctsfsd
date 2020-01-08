package exception.employee;

public class Employee {
	private int eid, experience;
	private String eName;
	private String add;

	public Employee(int eid, int experience, String eName, String add) {
		super();
		this.eid = eid;
		this.experience = experience;
		this.eName = eName;
		this.add = add;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public void display() throws EmployeeDoesntExistExp {
		if (experience <= 2) {
			System.out.println("Cant create employee DB");
			throw new EmployeeDoesntExistExp("Experince less than 2 yrs");

		}
		System.out.println("\nEmployee ID: " + getEid() + "\nEmployee Name: " + geteName() + "\nAddress: " + getAdd()
				+ "\nExperience: " + getExperience());
		;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((add == null) ? 0 : add.hashCode());
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + eid;
		result = prime * result + experience;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 * if (this == obj) return true; if (obj == null) return false; if (getClass()
		 * != obj.getClass()) return false;
		 */Employee other = (Employee) obj;
		if (add == null) {
			if (other.add != null)
				return false;
		} else if (!add.equals(other.add))
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		/*
		 * if (eid != other.eid) return false; if (experience != other.experience)
		 * return false;
		 */ return true;
	}

	public static void main(String[] args) throws Exception {
		Employee e = new Employee(1, 3, "Sravan", "spice garden");
		Employee e1 = new Employee(2, 5, "Sravan", "spice garden");
		try {
			if (e.equals(e1)) {
				System.out.println("cant create employees DB");
				throw new EqualsException("both are equal by name & add");
			}
			e.display();
			System.out.println();
			e1.display();

		} catch (EmployeeDoesntExistExp e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}

}
