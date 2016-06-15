import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spicejet.cms.configuration.AppConfig;
import com.spicejet.cms.model.Employee;
import com.spicejet.cms.model.Login;
import com.spicejet.cms.service.EmployeeService;
import com.spicejet.cms.service.LoginService;

public class AppMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		
		LoginService loginService = (LoginService) context.getBean("loginservice");
		
		Employee employee = new Employee();
		employee.setName("Hello Spring");
//		employee.setId(1);
		
		
		Login login = new Login();
		
		login.setUserName("hello");
		login.setPassword("welcome");
		login.setUserRoll("admin");
		
		loginService.saveLoginDetails(login);
		service.saveEmployee(employee);
		
		context.close();
	}
}
