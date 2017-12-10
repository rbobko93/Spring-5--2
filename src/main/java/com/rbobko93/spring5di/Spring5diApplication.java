package com.rbobko93.spring5di;

import com.rbobko93.spring5di.controller.ConstructorInjectedController;
import com.rbobko93.spring5di.controller.GetterInjectedController;
import com.rbobko93.spring5di.controller.MyController;
import com.rbobko93.spring5di.controller.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5diApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5diApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		controller.hello();

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
