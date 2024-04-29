package study.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringDataJpaStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaStudyApplication.class, args);
    }

}
