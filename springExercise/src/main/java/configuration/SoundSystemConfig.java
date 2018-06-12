package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import soundsystem.SgtPeppers;

@Configuration
//通过确定定义的类而确定类所在的基础包
//确保实现类型安全的
@ComponentScan(basePackageClasses = {SgtPeppers.class})
public class SoundSystemConfig {

}
