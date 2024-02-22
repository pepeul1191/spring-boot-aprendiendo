package pe.softweb.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.softweb.demo.entities.Level;
import pe.softweb.demo.repositories.LevelRepository;

@Service
public class LevelService {
  @Autowired
  private LevelRepository levelRepository;

  public List<Level> getAllLevels() {
    return (List<Level>) levelRepository.findAll();
  }

  public Optional<Level> getLevelById(Long id) {
    return levelRepository.findById(id);
  }

  // Otros métodos de servicio según tus necesidades
}