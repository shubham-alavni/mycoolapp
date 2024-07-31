package com.spring2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
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

}
