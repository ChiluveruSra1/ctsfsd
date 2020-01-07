package one;

import java.time.LocalDate;

public class Coach {
	private String fname,lname,coachesFor;
	private LocalDate date;
	private int coachId;

	public Coach() {
		//super();
	}

	public Coach(String fname, String lname, String coachesFor, LocalDate date, int coachId) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.coachesFor = coachesFor;
		this.date = date;
		this.coachId = coachId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + coachId;
		result = prime * result + ((coachesFor == null) ? 0 : coachesFor.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
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
		Coach other = (Coach) obj;
		//if (coachId != other.coachId)
		//		return false;
		if (coachesFor == null) {
			if (other.coachesFor != null)
				return false;
		} else if (!coachesFor.equals(other.coachesFor))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		return true;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCoachesFor() {
		return coachesFor;
	}

	public void setCoachesFor(String coachesFor) {
		this.coachesFor = coachesFor;
	}

	public int getCoachId() {
		return coachId;
	}

	public void setCoachId(int coachId) {
		this.coachId = coachId;
	}

	public void getDetails() {
		System.out.println("\nCoach ID: "+getCoachId()+"\nFname: "+getFname()+"\nLname: "+getLname()+"\nCoaches for: "+getCoachesFor()+"\nDate: "+getDate());
	}
	
	public static void main(String[] args) {
		Coach c = new Coach();
		Coach c1 = new Coach();
				
		c=new Coach("ch sravan", "kumar","fsd1", LocalDate.now(), c.hashCode());
		c1=new Coach("sra1", "kumar","fsd", LocalDate.now(), c.hashCode());
		c.getDetails();
		c1.getDetails();
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		System.out.println("Equals mthd: "+c.equals(c1));
		System.out.println("using '==': "+(c==c1));
	}

}



