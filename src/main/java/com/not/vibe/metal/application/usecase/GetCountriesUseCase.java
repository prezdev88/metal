package com.not.vibe.metal.application.usecase;

import java.util.List;

import org.springframework.stereotype.Service;

import com.not.vibe.metal.application.dto.CountryDto;
import com.not.vibe.metal.application.mapper.CountryDtoMapper;
import com.not.vibe.metal.application.response.GetCountriesResponse;
import com.not.vibe.metal.domain.model.Country;
import com.not.vibe.metal.domain.port.CountryPort;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GetCountriesUseCase {

    private final CountryPort countryPort;
    private final CountryDtoMapper mapper;

    public GetCountriesResponse execute() {
        List<Country> allCountries = countryPort.getAllCountries();
        List<CountryDto> countryDtos = mapper.mapTo(allCountries);

        return new GetCountriesResponse(countryDtos);
    }
}
