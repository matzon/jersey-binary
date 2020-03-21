package dk.matzon.jerseybinary;

import com.sun.jersey.spi.container.servlet.ServletContainer;
import com.sun.jersey.spi.spring.container.servlet.SpringServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JerseyBinary extends SpringBootServletInitializer {

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new SpringServlet());
        bean.addInitParameter(ServletContainer.APPLICATION_CONFIG_CLASS, "dk.matzon.jerseybinary.infrastructure.RestApplication");
        bean.addUrlPatterns("/*");
        return bean;
    }

    public static void main(String[] args) {
        new SpringApplication(JerseyBinary.class).run(args);
    }
}

