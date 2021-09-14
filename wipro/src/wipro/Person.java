package wipro;

public class Person {
	
	private int personid;
	private String name;
	
	
	public Person(int personid, String name) {
		super();
		this.personid = personid;
		this.name = name;
	}
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Person p) {
		if(p==this) {
			return true;
		}
		
		if(!(p instanceof Person))
		{
			return false;
		}
		
		if(p.getPersonid() == this.personid)
		{
			return true;
		}
		
		return false;
		
	}
	

}
