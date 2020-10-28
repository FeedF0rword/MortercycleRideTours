package com.BCASKandy.MorterCycleTourPlanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MorterCycleTourPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MorterCycleTourPlannerApplication.class, args);
	}

}
