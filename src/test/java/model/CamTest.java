package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CamTest {
  @Test
  void getsIdsOfCams() {
    assertEquals("05", new Cam("snake_05_ab123", 7).getId());
    assertEquals("07", new Cam("snake_07_ab123", 7).getId());
    assertEquals("12", new Cam("snake_12_ab123", 7).getId());
  }
}