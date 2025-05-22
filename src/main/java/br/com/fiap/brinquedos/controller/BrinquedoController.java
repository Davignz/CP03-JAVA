package br.com.fiap.brinquedos.controller;

import br.com.fiap.brinquedos.model.Brinquedo;
import br.com.fiap.brinquedos.repository.BrinquedoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository repository;

    // CREATE
    @PostMapping
    public ResponseEntity<Brinquedo> cadastrar(@RequestBody @Valid Brinquedo brinquedo) {
        return ResponseEntity.ok(repository.save(brinquedo));
    }

    // READ ALL
    @GetMapping
    public List<Brinquedo> listar() {
        return repository.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Brinquedo> buscarPorId(@PathVariable Long id) {
        Optional<Brinquedo> brinquedo = repository.findById(id);
        return brinquedo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Brinquedo> atualizar(@PathVariable Long id, @RequestBody @Valid Brinquedo atualizado) {
        return repository.findById(id)
                .map(b -> {
                    atualizado.setId(b.getId());
                    return ResponseEntity.ok(repository.save(atualizado));
                }).orElse(ResponseEntity.notFound().build());
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
