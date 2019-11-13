package com.jlrm.springboot.app.productos.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jlrm.springboot.app.commons.models.entity.Producto;

@Repository
public interface ProductDao extends CrudRepository<Producto, Long>{

}
