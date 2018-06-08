package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

  @RequestMapping("/hello")
  //控制器方法中可以提供正确的参数
  //将key=name的值赋值给userName变量
  public String hello(@RequestParam("name") String userName,
      Model model) {
    model.addAttribute("message", "Hello from " + userName);
    return "index";
  }
}
