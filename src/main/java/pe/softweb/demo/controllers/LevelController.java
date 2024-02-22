package pe.softweb.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
/*
    @GetMapping("/list")
    public String getAllLevels() {
        List<Level> levels = levelService.getAllLevels();
        System.out.println("1 +++++++++++++++++++++++++++++++++");
        System.out.println(levels);
        System.out.println("2 +++++++++++++++++++++++++++++++++");
        return "futura lista de niveles";
    }*/
}