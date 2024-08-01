package com.spring2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

  // Inject properties for: coach.name and team.name
  @Value("${coach.name}")
  private String coachName;

  @Value("${coach.team}")
  private String teamName;

  // expose "/" that return "Hello World"
  @GetMapping("/")
  public String sayHello() {
    return "Hello World!";
  }

  @GetMapping("/workout")
  public String workout() {
    return "Run a hard 5k!";
  }

  @GetMapping("/fortune")
  public String fortune() {
    return "You will have a great day!";
  }

  @GetMapping("/teaminfo")
  public String teamInfo() {
    return "Coach: " + coachName + ", Team name: " + teamName;
  }

}
