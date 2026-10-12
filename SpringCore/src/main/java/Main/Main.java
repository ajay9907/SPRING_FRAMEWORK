package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Entity.Employee;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");

		Employee emp = context.getBean(Employee.class);

		emp.setId(123);
		emp.setName("Ajyaa");
		emp.setAge(22);
		emp.setCity("BEED");

		System.out.println(emp);
	}
}
