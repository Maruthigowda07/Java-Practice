package Comparable;

public class Emp implements Comparable {
	String name;
	int id;
	int age;
	
	public Emp(String name,int id,int age) {
		this.name=name;
		
		this.age=age;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Emp[name= " + name + ", age= " + age + ",id= " + id + "]";
	}
	@Override
	public int compareTo(Object o) {
		Emp e=(Emp)o;

     //return this.age-e.age;
		return this.name.compareTo(e.name);
	}
	
	

}
