package com.company.lebedev;

public class Viewer {
  private String nickname;
  private int age;
  private int countOfFilms;
  
  public Viewer(String nickname, int age, int countOfFilms) {
    this.nickname = (nickname == null || nickname.isEmpty()) ? "default" : nickname;
    this.age = Math.max(0, age);
    this.countOfFilms = Math.max(0, countOfFilms);
  }
  
  public String getNickname() {
    return nickname;
  }
  
  public int getAge() {
    return age;
  }
  
  
  public int getCountOfFilms() {
    return countOfFilms;
  }
  
  public void setNickname(String nickname) {
    if (nickname != null && !(nickname.isEmpty())) {
      this.nickname = nickname;
    }
  }
  
  public void setAge(int age) {
    if(age > 0) {
    
    } this.age = age;
   
  }
  
  public void setCountOfFilms(int countOfFilms) {
    this.countOfFilms = countOfFilms;
  }

}
