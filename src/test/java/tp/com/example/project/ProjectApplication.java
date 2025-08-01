package tp.com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tp.com.example.project.Main;
import tp.com.example.project.Main;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tp.com.example.project.Main;

@SpringBootApplication
public class ProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }


public String getMessage() {
        return "Hello, Jenkins!";
    }

    public String getMessage(String customMessage) {
        return customMessage;
    }
}