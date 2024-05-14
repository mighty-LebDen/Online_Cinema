import com.company.lebedev.*;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
  public static void main(String[] args) {
    Viewer viewer1 = new Viewer("viewer1", 10, 5);
    Viewer viewer2 = new Viewer("viewer2", 20, 6);
    Viewer viewer3 = new Viewer("viewer3", 30, 7);
    Viewer viewer4 = new Viewer("viewer4", 40, 8);
    Viewer viewer5 = new Viewer("viewer5", 50, 9);
    List<Viewer> viewerList = new ArrayList<>();
    viewerList.add(viewer1);
    viewerList.add(viewer2);
    viewerList.add(viewer3);
    viewerList.add(viewer4);
    viewerList.add(viewer5);
    System.out.println(String.format("Average age of Viewers is %.2f", ViewerStatistics.averageAge(viewerList)));
  }
}