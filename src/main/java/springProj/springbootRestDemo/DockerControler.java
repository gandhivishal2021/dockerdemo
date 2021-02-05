package springProj.springbootRestDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerControler {
	
	@GetMapping("/name")
	public String getMyName(){
		return "Simple Spring boot application";
	}

}
