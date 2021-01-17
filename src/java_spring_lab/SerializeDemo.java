package java_spring_lab;
import java.io.*;

import java.io.IOException;

public class SerializeDemo {

	public static void main(String[] args) {
		System.out.printf("-> start program");
		Employee e = new Employee("badr","1706 shrbrooke,qc,canada",112233,101);
		
		try {
			  FileOutputStream fileOut = new FileOutputStream("tmp/employee.ser");
			  ObjectOutputStream out = new ObjectOutputStream(fileOut);
			  out.writeObject(e);
			  out.close();
			  fileOut.close();
			  System.out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			 System.out.printf("++ see exception created by badr programmer: ->");
			i.printStackTrace();
		}

	}

}
