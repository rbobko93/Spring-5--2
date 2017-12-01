package com.rbobko93.spring5di;

import com.rbobko93.spring5di.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5diApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5diApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		controller.hello();
	}
}
