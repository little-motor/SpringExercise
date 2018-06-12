package helloWorld;

import org.springframework.stereotype.Component;

@Component
public class MessagePrinter implements Message{

    @Override
    public void printMessage(){
      System.out.println("hello world!");;
    }
}
