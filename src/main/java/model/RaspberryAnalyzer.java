package model;

import static java.util.Collections.unmodifiableList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RaspberryAnalyzer {
  private final List<Cam> allCams;

  public RaspberryAnalyzer(List<Cam> allCams) {
    this.allCams = unmodifiableList(allCams);
  }

  public List<String> getOutOfDateRaspberries() {
    Map<String, List<Cam>> idToCams = new HashMap<>();
    for (Cam currentCam : allCams) {
      idToCams.computeIfAbsent(currentCam.getId(), index -> new ArrayList<>()).add(currentCam);
    }

    List<String> result = new ArrayList<>();
    for (Entry<String, List<Cam>> next : idToCams.entrySet()) {
      String id = next.getKey();
      List<Cam> cams = next.getValue();
      boolean outOfDate = true;
      for (Cam currentCam : cams) {
        if (currentCam.getDays() < 3) {
          outOfDate = false;
          break;
        }
      }
      if (outOfDate) {
        result.add(id);
      }
    }
    return result;
  }
}
