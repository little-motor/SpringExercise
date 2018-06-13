package configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import soundsystem.SoundPackageConfig;

@Configuration
//类型安全
@ComponentScan(basePackageClasses = {SoundPackageConfig.class})
public class CDPlayerConfig { 
}
