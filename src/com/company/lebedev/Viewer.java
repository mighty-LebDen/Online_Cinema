package com.company.lebedev;

import java.util.ArrayList;
import java.util.List;

public class Viewer {
  private String nickname;
  private int age;
  private List<Cinema> userFilms;
  
  public Viewer(String nickname, int age, List<Cinema> userFilms) {
    this.nickname = (nickname == null || nickname.isEmpty()) ? "default" : nickname;
    this.age = Math.max(0, age);
    this.userFilms = (userFilms != null && !(userFilms.isEmpty())) ? userFilms : new ArrayList<>();
  }
  
  public String getNickname() {
    return nickname;
  }
  
  public int getAge() {
    return age;
  }
  
  
  public List<Cinema> getUserFilms() {
    return this.userFilms;
  }
  
  public void setNickname(String nickname) {
    if (nickname != null && !(nickname.isEmpty())) {
      this.nickname = nickname;
    }
  }
  
  public void setAge(int age) {
    if(age > 0) {
      this.age = age;
    }
  }
  
  public void setUserFilms(List<Cinema> userFilms) {
    if(userFilms != null && !(userFilms.isEmpty())) {
      this.userFilms = userFilms;
    }
  }
}
