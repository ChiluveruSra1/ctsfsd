package Assingment.one;

public class Account {
	Integer acId;
	String name;
	String add;
	public Account() {
		super();
	}
	public Account(Integer acId, String name, String add) {
		super();
		this.acId = acId;
		this.name = name;
		this.add = add;
	}
		
	public Integer getAcId() {
		return acId;
	}
	public void setAcId(Integer acId) {
		this.acId = acId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		System.out.println("-----------------------------------------------------------------------");
		return "\nAccount [acId=" + acId + ", name=" + name + ", add=" + add + ", getAcId()=" + getAcId()+", hashCode()=" + hashCode()+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acId == null) ? 0 : acId.hashCode());
		result = prime * result + ((add == null) ? 0 : add.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		Account a=null;
		if(obj instanceof Account) {
			a=(Account)obj;
		}
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (acId == null) {
			if (other.acId != null)
				return false;
		} else if (!acId.equals(other.acId))
			return false;
		if (add == null) {
			if (other.add != null)
				return false;
		} else if (!add.equals(other.add))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
