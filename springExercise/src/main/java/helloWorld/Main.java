package helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    //1、创建Spring的IOC容器的对象
    ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
    //2、从IOC的容器中获取Bean的实例
    HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloworld");
    //3、调用hello方法
    helloWorld.hello();
}
}
