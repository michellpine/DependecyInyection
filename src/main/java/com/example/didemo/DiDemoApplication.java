package com.example.didemo;

import com.example.didemo.controllers.ConstructorInjectedController;
import com.example.didemo.controllers.MyController;
import com.example.didemo.controllers.PropertyInjectedController;
import com.example.didemo.controllers.SetterInjectedController;
import com.example.didemo.examplebeans.FakeDataSource;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());

	}
}
