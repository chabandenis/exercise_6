package ru.chaban.exercise_4;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.chaban.exercise_4.utility.FromFileToDB;

@SpringBootApplication
@AllArgsConstructor
public class Exercise4Application {

	private final FromFileToDB fromFileToDB;

	public static void main(String[] args) {
		SpringApplication.run(Exercise4Application.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("Start!!!!!!!!!!!!!!!!!!");
		fromFileToDB.doIt();
		System.out.println("--------");
	}

}
