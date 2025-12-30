package com.not.vibe.metal.application.mapper;

import java.util.List;

import org.springframework.stereotype.Service;

import com.not.vibe.metal.application.dto.CountryDto;
import com.not.vibe.metal.domain.model.Country;

@Service
public class CountryDtoMapper {

    public List<CountryDto> mapTo(List<Country> allCountries) {
        return allCountries.stream()
                .map(this::mapTo)
                .toList();
    }

    public CountryDto mapTo(Country country) {
        CountryDto dto = new CountryDto();

        dto.setId(country.getId());
        dto.setName(country.getName());
        
        return dto;
    }

}
