package com.oscar.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oscar.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
