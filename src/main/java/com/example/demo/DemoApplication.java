package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner printServerPort(ServletWebServerApplicationContext webServerApp) {
		return args -> {
			int port = webServerApp.getWebServer().getPort();
			System.out.println("应用启动成功！");
			System.out.println("本地访问地址: http://localhost:" + port+"/login.html");
			// System.out.println("外部访问地址: http://" + java.net.InetAddress.getLocalHost().getHostAddress() + ":" + port);
		};
	}

}
