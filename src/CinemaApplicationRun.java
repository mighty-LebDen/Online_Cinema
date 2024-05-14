import com.company.lebedev.*;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
  public static void main(String[] args) {
    Cinema cinema = new Cinema("film1", "genre 1", 2);
    Cinema cinema1 = new Cinema("film2", "genre 2", 2);
    Cinema cinema2 = new Cinema("film3", "genre 3", 2);
    Cinema cinema3 = new Cinema("film4", "genre 4", 2);
    List<Cinema> cinemaList = new ArrayList<>(){{
      add(cinema);
      add(cinema1);
      add(cinema2);
      add(cinema3);
    }};
    Viewer viewer1 = new Viewer("viewer1", 10, cinemaList);
    Viewer viewer2 = new Viewer("viewer2", 20, cinemaList);
    Viewer viewer3 = new Viewer("viewer3", 30, cinemaList);
    Viewer viewer4 = new Viewer("viewer4", 40, cinemaList);
    Viewer viewer5 = new Viewer("viewer5", 50, cinemaList);
    List<Viewer> viewerList = new ArrayList<>();
    viewerList.add(viewer1);
    viewerList.add(viewer2);
    viewerList.add(viewer3);
    viewerList.add(viewer4);
    viewerList.add(viewer5);
    System.out.println(String.format("Average age of Viewers is %.2f", ViewerStatistics.averageAge(viewerList)));
  }
}