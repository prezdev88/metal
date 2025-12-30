package com.not.vibe.metal.domain.port;

import java.util.List;

import com.not.vibe.metal.domain.model.Country;

public interface CountryPort {
    List<Country> getAllCountries();
}
