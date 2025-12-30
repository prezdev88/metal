package com.not.vibe.metal.infrastructure.persistence.jpa.mapper;

import java.util.List;

import org.springframework.stereotype.Service;

import com.not.vibe.metal.domain.model.Country;
import com.not.vibe.metal.infrastructure.persistence.jpa.entity.CountryEntity;

@Service
public class CountryMapper {

    public List<Country> mapTo(List<CountryEntity> all) {
        return all.stream()
                .map(this::mapTo)
                .toList();
    }

    public Country mapTo(CountryEntity entity) {
        Country country = new Country();

        country.setId(entity.getId().toString());
        country.setName(entity.getName());

        return country;
    }

}
