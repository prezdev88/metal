package com.not.vibe.metal.application.response;

import java.util.List;

import com.not.vibe.metal.application.dto.CountryDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetCountriesResponse {
    private List<CountryDto> countries;
}
