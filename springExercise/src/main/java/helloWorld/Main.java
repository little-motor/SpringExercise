package helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    //1、创建Spring的IoC容器的对象
    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    //2、从IoC的容器中获取Bean的实例
    HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
    //3、调用hello方法
    helloWorld.hello();
}
}
