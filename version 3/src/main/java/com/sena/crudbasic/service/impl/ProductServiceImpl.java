package com.sena.crudbasic.service.impl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.sena.crudbasic.repository.ProductRepository;
import com.sena.crudbasic.service.ProductService;
import com.sena.crudbasic.model.Product;
import com.sena.crudbasic.dto.ProductDto;
import java.util.List;

@Service @RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
 private final ProductRepository repo;

 public List<Product> findAll(){return repo.findAll().stream().filter(Product::getActive).toList();}
 public Product findById(Long id){return repo.findById(id).orElseThrow();}
 public Product create(ProductDto d){
   Product p=new Product();
   p.setName(d.getName()); p.setPrice(d.getPrice());
   p.setCategoryId(d.getCategoryId()); p.setBrandId(d.getBrandId());
   p.setSupplierId(d.getSupplierId());
   return repo.save(p);
 }
 public Product update(Long id, ProductDto d){
   Product p=findById(id);
   p.setName(d.getName()); p.setPrice(d.getPrice());
   p.setCategoryId(d.getCategoryId()); p.setBrandId(d.getBrandId());
   p.setSupplierId(d.getSupplierId());
   return repo.save(p);
 }
 public void deleteLogical(Long id){
   Product p=findById(id); p.setActive(false); repo.save(p);
 }
 public void deletePhysical(Long id){ repo.deleteById(id); }
}