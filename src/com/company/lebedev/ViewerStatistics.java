package com.company.lebedev;

import java.util.List;

public class ViewerStatistics {
  public static double averageAge(List<Viewer> listOfViewers) {
    int sumAges = 0;
    for(var viewer : listOfViewers) {
      sumAges += viewer.getAge();
    }
    return (double) sumAges / listOfViewers.size();
  }
}
