package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import helloWorld.HelloWorldPackage;

@Configuration
//类型安全
@ComponentScan(basePackageClasses = {HelloWorldPackage.class})
public class HelloWorldConfig {

}
