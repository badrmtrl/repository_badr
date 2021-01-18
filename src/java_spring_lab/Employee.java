package java_spring_lab;

public class Employee implements java.io.Serializable {
	   public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	   
	   public Employee(String name, String address, int sSN, int number) {
		super();
		this.name = name;
		this.address = address;
		SSN = sSN;
		this.number = number;
	}

	public void mailCheck() {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
	}