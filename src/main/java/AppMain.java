import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spicejet.cms.configuration.AppConfig;
import com.spicejet.cms.model.Employee;
import com.spicejet.cms.service.EmployeeService;

public class AppMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		
		Employee employee = new Employee();
		employee.setName("Hello Spring");
//		employee.setId(1);
		
		service.saveEmployee(employee);
		
		context.close();
	}
}
