package serverless.springbootstarter.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	@RequestMapping("/test")
	public String Test()
	{
		return "TestMessage";
	}
}
