package com.sena.crudbasic.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.sena.crudbasic.service.ProductService;
import com.sena.crudbasic.dto.ProductDto;
import com.sena.crudbasic.model.Product;
import jakarta.validation.Valid;
import java.util.List;

@RestController @RequestMapping("/products") @RequiredArgsConstructor
public class ProductController{
 private final ProductService service;

 @GetMapping public List<Product> all(){return service.findAll();}
 @GetMapping("/{id}") public Product one(@PathVariable Long id){return service.findById(id);}
 @PostMapping public Product create(@Valid @RequestBody ProductDto d){return service.create(d);}
 @PutMapping("/{id}") public Product update(@PathVariable Long id,@Valid @RequestBody ProductDto d){return service.update(id,d);}
 @DeleteMapping("/logical/{id}") public void logical(@PathVariable Long id){service.deleteLogical(id);}
 @DeleteMapping("/physical/{id}") public void physical(@PathVariable Long id){service.deletePhysical(id);}
}