package lt.emotion.cloudtask.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWorldApplication {

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new HelloWorldApplicationCommandLineRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    public static class HelloWorldApplicationCommandLineRunner implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            System.out.println("Hello, World!");
        }
    }
}
