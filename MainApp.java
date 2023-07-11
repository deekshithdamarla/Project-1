import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Employee emp = (Employee) context.getBean("emp");
		Employee emp=context.getBean("emp", Employee.class);
		System.out.println(emp.getEno());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress().getCity());

	}

		
	}

     
