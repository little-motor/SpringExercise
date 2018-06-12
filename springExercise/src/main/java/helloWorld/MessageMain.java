package helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageMain {
  
  
  private MessagePrinter mess;
  
  @Autowired
  public MessageMain(MessagePrinter mess) {
    this.mess = mess;
  }
  
  public void print() {
    mess.printMessage();
  }
  
}
