package pe.softweb.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "levels")
public class Level {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String name;

  protected Level() {}

  public Level(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format(
      "Level[id=%d, name='%s']",
      id, name);
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}