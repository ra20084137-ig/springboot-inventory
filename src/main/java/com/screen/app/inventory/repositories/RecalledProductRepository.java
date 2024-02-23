package com.screen.app.inventory.repositories;

import com.screen.app.inventory.entities.RecalledProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RecalledProductRepository extends JpaRepository<RecalledProduct, Integer> {}
