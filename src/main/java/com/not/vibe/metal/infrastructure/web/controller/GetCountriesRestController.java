package com.not.vibe.metal.infrastructure.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.not.vibe.metal.application.response.GetCountriesResponse;
import com.not.vibe.metal.application.usecase.GetCountriesUseCase;

import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@AllArgsConstructor
@RequestMapping("/countries")
public class GetCountriesRestController {

    private final GetCountriesUseCase useCase;

    @GetMapping
    public ResponseEntity<GetCountriesResponse> getCountries() {
        GetCountriesResponse getResponse = useCase.execute();
        return ResponseEntity.ok(getResponse);
    }
    

}
