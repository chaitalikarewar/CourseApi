package learncourseapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHi()
	{
		 	return "Hi Chaitali";
	}
	
	@RequestMapping("/")
	public String welcome()
	{
		 	return "Welcome to Learn Course";
	}
}
