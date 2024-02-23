package com.screen.app.inventory.services;

import com.screen.app.inventory.entities.RecalledProduct;
import com.screen.app.inventory.repositories.RecalledProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RecalledProductService {

    private final RecalledProductRepository recalledProductRepository;

    public RecalledProduct save(RecalledProduct recalledProduct) {
        return recalledProductRepository.save(recalledProduct);
    }

    public Collection<RecalledProduct> getAllRecalledProducts() {
        return recalledProductRepository.findAll();
    }

    public Optional<RecalledProduct> findById(Integer id) {
        return recalledProductRepository.findById(id);
    }
}
