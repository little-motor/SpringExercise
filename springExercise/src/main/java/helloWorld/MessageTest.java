package helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.HelloWorldConfig;

public class MessageTest {
  public static void main(String[] args) {
    //声明Spring上下文，采用java配置类
    ApplicationContext context = 
        new AnnotationConfigApplicationContext(HelloWorldConfig.class);
    Message mess = context.getBean(MessagePrinter.class);
    mess.printMessage();
  }
}



