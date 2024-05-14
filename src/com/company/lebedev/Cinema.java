package com.company.lebedev;

public class Cinema {
  private String name;
  private String genre;
  private int duration;
  
  public Cinema(String name, String genre, int duration) {
    this.name = (name == null || name.isEmpty()) ? "default_film" : name;
    this.genre = (genre == null || genre.isEmpty()) ? "default_genre" : genre;
    this.duration = Math.max(0, duration);
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    if(name != null && !(name.isEmpty())) {
      this.name = name;
    }
  }
  
  public String getGenre() {
    return genre;
  }
  
  public void setGenre(String genre) {
    if(genre != null && !(genre.isEmpty())) {
      this.genre = genre;
    }
  }
  
  public int getDuration() {
    return duration;
  }
  
  public void setDuration(int duration) {
    if(duration > 0) {
      this.duration = duration;
    }
  }
}
