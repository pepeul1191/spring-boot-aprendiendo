package pe.softweb.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.softweb.demo.entities.Level;
import pe.softweb.demo.services.LevelService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/level")
public class LevelController {
  @Autowired
  private LevelService levelService;

  // Endpoint para listar todos los niveles
  @GetMapping("/list")
  public ResponseEntity<List<Level>> getAllLevels() {
    List<Level> levels = levelService.getAllLevels();
    return ResponseEntity.ok(levels);
  }

  @GetMapping("/{id}")
  public ResponseEntity<?> getLevelById(
    @PathVariable Long id, 
    @RequestParam(defaultValue = "valor_predeterminado") String parametro
  ) {
    System.out.println(parametro);
    Optional<Level> level = levelService.getLevelById(id);
    if (level.isPresent()) {
      return ResponseEntity.ok(level.get());
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el nivel con ID: " + id);
    }
  }
}