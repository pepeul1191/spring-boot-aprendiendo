package pe.softweb.demo.services;

import org.springframework.stereotype.Service;
import io.github.cdimascio.dotenv.Dotenv;

@Service
public class EnvService {
  private final Dotenv dotenv;

  public EnvService() {
    this.dotenv = Dotenv.configure().load();
  }

  public String get(String key) {
    return dotenv.get(key);
  }
}
