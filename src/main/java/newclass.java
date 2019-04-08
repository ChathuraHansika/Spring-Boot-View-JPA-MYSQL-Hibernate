import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Chathura on 4/7/2019.
 */
@SpringBootApplication
@ComponentScan("springboot")
@EntityScan("springboot.model")
@EnableJpaRepositories("springboot")

public class newclass extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(newclass.class);
    }

 public static void main(String[] args) {
        SpringApplication.run(newclass.class,args);
    }
}
