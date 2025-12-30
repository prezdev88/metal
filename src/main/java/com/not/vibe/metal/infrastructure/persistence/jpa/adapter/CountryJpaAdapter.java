package com.not.vibe.metal.infrastructure.persistence.jpa.adapter;

import java.util.List;

import org.springframework.stereotype.Service;

import com.not.vibe.metal.domain.model.Country;
import com.not.vibe.metal.domain.port.CountryPort;
import com.not.vibe.metal.infrastructure.persistence.jpa.entity.CountryEntity;
import com.not.vibe.metal.infrastructure.persistence.jpa.mapper.CountryMapper;
import com.not.vibe.metal.infrastructure.persistence.jpa.repository.CountryJpaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CountryJpaAdapter implements CountryPort {

    private final CountryMapper mapper;
    private final CountryJpaRepository repository;

    @Override
    public List<Country> getAllCountries() {
        List<CountryEntity> all = repository.findAll();
        return mapper.mapTo(all);
    }

}
