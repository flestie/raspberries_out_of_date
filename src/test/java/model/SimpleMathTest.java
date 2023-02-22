package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SimpleMathTest {
  @Test
  void sumsTwoIntegers() {
    assertEquals(9, SimpleMath.sum(4, 5));
  }

  @Test
  void sumsTwoZeros() {
    assertEquals(0, SimpleMath.sum(0, 0));
  }

  @Test
  void sumsTwoOppositeIntegers() {
    assertEquals(0, SimpleMath.sum(-8, 8));
  }
}