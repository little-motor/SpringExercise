package soundsystem;

import org.springframework.stereotype.Component;

//声明组件，spring自动装备bean
@Component
public class SgtPeppers implements CD {
  private String title = "love song";
  private String artist = "littlemotor";
  
  public void play() {
    System.out.println("Playing " + title + "by " + artist);
  }

}
