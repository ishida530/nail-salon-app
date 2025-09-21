package com.nailstudio.nail_studio_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NailStudioAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NailStudioAppApplication.class, args);
	}



	@RestController
	@RequestMapping("/api/hello")
	public class HelloController {
		@GetMapping
		public String hello() {
			return "Hello from Nail Studio App!";
		}
	}

}
