package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public Optional<Producto> getProducto(long idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    public Producto saveProducto(Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void deleteProducto(long idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
