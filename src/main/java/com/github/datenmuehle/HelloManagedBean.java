package com.github.datenmuehle;

import jakarta.faces.bean.ManagedBean;

@ManagedBean(name = "helloBean")
public class HelloManagedBean {

  public HelloManagedBean() {
    this.greeting = "Hello JSF - Myfaces";
  }

  private String greeting;

  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }
}
