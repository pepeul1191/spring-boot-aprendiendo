package pe.softweb.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @GetMapping("/")
  public String index(Model model) {
    // model.addAttribute("nombre", valor);
    return "home";
  }

  @GetMapping("/level")
  public String level(Model model) {
    // model.addAttribute("nombre", valor);
    return "level/index";
  }
}