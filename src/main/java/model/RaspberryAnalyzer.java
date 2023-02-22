package model;

import static java.util.Collections.unmodifiableList;

import java.util.ArrayList;
import java.util.List;

public class RaspberryAnalyzer {
  private final List<Cam> allCams;

  public RaspberryAnalyzer(List<Cam> allCams) {
    this.allCams = unmodifiableList(allCams);
  }

  public List<String> getOutOfDateRaspberries() {
    List<String> result = new ArrayList<>();
    return result;
  }
}
