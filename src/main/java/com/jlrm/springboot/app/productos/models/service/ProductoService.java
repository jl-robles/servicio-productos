package com.jlrm.springboot.app.productos.models.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jlrm.springboot.app.commons.models.entity.Producto;
import com.jlrm.springboot.app.productos.models.repository.ProductDao;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private ProductDao productDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductoService.class);
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		
		LOGGER.info("All: "+productDao.findAll());
		return (List<Producto>) productDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {
		return productDao.save(producto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		productDao.deleteById(id);
	}

}
