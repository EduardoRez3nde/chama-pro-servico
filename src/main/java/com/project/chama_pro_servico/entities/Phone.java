package com.project.chama_pro_servico.entities;

import com.project.chama_pro_servico.entities.enums.TypeNumber;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String countryCode;

    @Column(nullable = false)
    private String areaCode;

    @Column(nullable = false)
    private String number;

    @Enumerated(value = EnumType.STRING)
    private TypeNumber typeNumber;

    @Column(nullable = false)
    private boolean isPrimary;

    public Phone() { }

    private Phone(
            final UUID id,
            final String countryCode,
            final String areaCode,
            final String number,
            final TypeNumber typeNumber,
            final boolean isPrimary
    ) {
        this.id = id;
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.number = number;
        this.typeNumber = typeNumber;
        this.isPrimary = isPrimary;
    }

    public static Phone of(final Phone phone) {
        return Phone.from(
                phone.id,
                phone.countryCode,
                phone.areaCode,
                phone.number,
                phone.typeNumber,
                phone.isPrimary
        );
    }

    public static Phone from(
            final UUID id,
            final String countryCode,
            final String areaCode,
            final String number,
            final TypeNumber typeNumber,
            final boolean isPrimary
    ) {
        return new Phone(id, countryCode, areaCode, number, typeNumber, isPrimary);
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(final String number) {
        this.number = number;
    }

    public TypeNumber getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(final TypeNumber typeNumber) {
        this.typeNumber = typeNumber;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(final boolean primary) {
        isPrimary = primary;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        final Phone phone = (Phone) o;
        return Objects.equals(getId(), phone.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
