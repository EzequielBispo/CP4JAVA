package com.emi.cp3java.controller;

import com.emi.cp3java.model.Brinquedo;
import com.emi.cp3java.service.BrinquedoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/brinquedos")
@Tag(name = "Brinquedo")
public class BrinquedoController {

    @Autowired
    BrinquedoService service;

    // GET
    @GetMapping("/{id}")
    @Operation(
            summary = "Buscar brinquedo por ID",
            description = "Retorna brinquedo pesquisado por ID")
    @ApiResponse(responseCode = "200", description = "Brinquedo encontrado")
    @ApiResponse(responseCode = "404", description = "Brinquedo não encontrado")
    public ResponseEntity<EntityModel<Brinquedo>> buscarId(@PathVariable int id) {
        Brinquedo brinquedo = service.getBrinquedo(id);
        if (brinquedo == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        EntityModel<Brinquedo> resource = EntityModel.of(brinquedo);
        resource.add(linkTo(methodOn(BrinquedoController.class).buscarId(id)).withSelfRel());
        resource.add(linkTo(methodOn(BrinquedoController.class).deletar(id)).withRel("deletar"));
        resource.add(linkTo(methodOn(BrinquedoController.class).atualizar(id, brinquedo)).withRel("atualizar"));
        return ResponseEntity.ok(resource);
    }

    // POST
    @PostMapping
    @Operation(
            summary = "Salvar brinquedo",
            description = "Salva um novo brinquedo")
    @ApiResponse(responseCode = "201", description = "Brinquedo salvo")
    @ApiResponse(responseCode = "400", description = "Erro ao salvar brinquedo")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<EntityModel<Brinquedo>> salvar(@RequestBody Brinquedo brinquedo) {
        Brinquedo savedBrinquedo = service.setBrinquedo(brinquedo);
        EntityModel<Brinquedo> resource = EntityModel.of(savedBrinquedo);
        resource.add(linkTo(methodOn(BrinquedoController.class).buscarId(savedBrinquedo.getId_brinquedo())).withSelfRel());
        return ResponseEntity.status(HttpStatus.CREATED).body(resource);
    }

    // DELETE
    @DeleteMapping("/{id}")
    @Operation(
            summary = "Deletar brinquedo",
            description = "Deleta um brinquedo")
    @ApiResponse(responseCode = "204", description = "Brinquedo deletado")
    @ApiResponse(responseCode = "404", description = "Brinquedo não encontrado")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deletar(@PathVariable int id) {
        Brinquedo brinquedo = service.getBrinquedo(id);
        if (brinquedo == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        service.deleteBrinquedo(id);
        return ResponseEntity.noContent().build();
    }

    // PUT
    @PutMapping("/{id}")
    @Operation(
            summary = "Atualizar brinquedo",
            description = "Atualiza um brinquedo existente")
    @ApiResponse(responseCode = "200", description = "Brinquedo atualizado")
    @ApiResponse(responseCode = "404", description = "Brinquedo não encontrado")
    public ResponseEntity<EntityModel<Brinquedo>> atualizar(@PathVariable int id, @RequestBody Brinquedo brinquedo) {
        Brinquedo existente = service.getBrinquedo(id);
        if (existente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        brinquedo.setId_brinquedo(id);
        Brinquedo updatedBrinquedo = service.save(brinquedo);
        EntityModel<Brinquedo> resource = EntityModel.of(updatedBrinquedo);
        resource.add(linkTo(methodOn(BrinquedoController.class).buscarId(id)).withSelfRel());
        return ResponseEntity.ok(resource);
    }
}
