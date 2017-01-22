package com.oxtail.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OxtailBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(OxtailBlogApplication.class, args);
	}
	
	@RestController
	class OxtailBlogController
	{
		@RequestMapping("/")
		public String home()
		{
			return "Hello World! from Docker";
		}
	}
}
