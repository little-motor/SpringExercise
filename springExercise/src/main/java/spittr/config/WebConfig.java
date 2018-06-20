package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//启用SpringMvc
@EnableWebMvc
@ComponentScan("spittr.web")
//适配器
public class WebConfig extends WebMvcConfigurerAdapter{
  @Bean
  public ViewResolver viewResolver() {
    //解析器
    InternalResourceViewResolver resolver = new 
        InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/views/");
    resolver.setSuffix(".jsp");
    return resolver;
  }
}
