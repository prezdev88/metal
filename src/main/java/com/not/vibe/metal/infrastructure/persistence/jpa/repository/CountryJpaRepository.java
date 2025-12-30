package com.not.vibe.metal.infrastructure.persistence.jpa.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.not.vibe.metal.infrastructure.persistence.jpa.entity.CountryEntity;

@Repository
public interface CountryJpaRepository extends JpaRepository<CountryEntity, UUID> {

}
