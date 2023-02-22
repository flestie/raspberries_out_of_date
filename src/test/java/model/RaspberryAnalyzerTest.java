package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class RaspberryAnalyzerTest {
  @Test
  void getsOutOfDateRaspberries() {
    List<Cam> allCams = new ArrayList<>();

    allCams.add(new Cam("snake_01_cz123", 5));
    allCams.add(new Cam("snake_01_ab178", 3));
    allCams.add(new Cam("snake_01_ab123", 4));

    allCams.add(new Cam("snake_02_cz123", 10));
    allCams.add(new Cam("snake_02_ab178", 15));

    allCams.add(new Cam("snake_03_cz123", 2));
    allCams.add(new Cam("snake_03_ab178", 3));

    allCams.add(new Cam("snake_04_cz123", 3));
    allCams.add(new Cam("snake_04_ab178", 3));

    allCams.add(new Cam("snake_05_cz123", 2));
    allCams.add(new Cam("snake_05_ab178", 2));

    RaspberryAnalyzer raspberryAnalyzer = new RaspberryAnalyzer(allCams);
    List<String> outOfDateRaspberries = raspberryAnalyzer.getOutOfDateRaspberries();
    assertEquals(Arrays.asList("01", "02", "04"), outOfDateRaspberries);
  }
}