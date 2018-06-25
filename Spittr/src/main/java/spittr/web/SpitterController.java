package spittr.web;
//处理用户信息
import static org.springframework.web.bind.annotation.RequestMethod.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import spittr.Spitter;
import spittr.data.SpitterRepository;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

  private SpitterRepository spitterRepository;

  @Autowired
  public SpitterController(SpitterRepository spitterRepository) {
    this.spitterRepository = spitterRepository;
  }
  
  //处理GET请求
  @RequestMapping(value="/register", method=GET)
  //在model中加入key为spitter的Spitter对象
  public String showRegistrationForm(Model model) {
    model.addAttribute("spitter",new Spitter());
    return "registerForm";
  }
  
  //处理POST请求
  @RequestMapping(value="/register", method=POST)
  public String processRegistration(
      //验证信息
      @Valid Spitter spitter, 
      Errors errors) {
    if (errors.hasErrors()) {
      return "registerForm";
    }
    //提交信息后重定向显示用户信息，防止刷新重复提交
    spitterRepository.save(spitter);
    //Resolver识别redirect：为重定向，forward：为前往指定url
    return "redirect:/spitter/" + spitter.getUsername();
  }
  
  //占位符
  @RequestMapping(value="/{username}", method=GET)
  public String showSpitterProfile(@PathVariable String username, Model model) {
    Spitter spitter = spitterRepository.findByUsername(username);
    model.addAttribute(spitter);
    return "profile";
  }
  
}
