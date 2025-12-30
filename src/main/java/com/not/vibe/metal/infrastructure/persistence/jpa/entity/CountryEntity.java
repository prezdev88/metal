package com.not.vibe.metal.infrastructure.persistence.jpa.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "country")
@ToString
public class CountryEntity {
    @Id
    @Column
    private UUID id;

    @Column
    private String name;
}
