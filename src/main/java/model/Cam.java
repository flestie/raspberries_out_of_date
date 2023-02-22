package model;

public class Cam {
  private final String name;
  private final int days;
  private final String id;

  public Cam(String name, int days) {
    this.name = name;
    this.days = days;
    this.id = getId(name);
  }

  public String getId() {
    return id;
  }

  private static String getId(String name) {
    return name.split("_")[1];
  }
}
