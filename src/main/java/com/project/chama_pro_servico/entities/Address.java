package com.project.chama_pro_servico.entities;

import java.util.Objects;
import java.util.UUID;

public class Address {

    private UUID id;
    private String street;
    private String neighborhood;
    private String city;
    private String zipCode;
    private String complement;

    public Address() { }

    private  Address(
            final UUID id,
            final String street,
            final String neighborhood,
            final String city,
            final String zipCode,
            final String complement
    ) {
        this.id = id;
        this.street = street;
        this.neighborhood = neighborhood;
        this.city = city;
        this.zipCode = zipCode;
        this.complement = complement;
    }

    public static Address from(
            final UUID id,
            final String street,
            final String neighborhood,
            final String city,
            final String zipCode,
            final String complement
    ) {
        return new Address(id, street, neighborhood, city, zipCode, complement);
    }

    public static Address of(final Address address) {
        return Address.from(
                address.getId(),
                address.getStreet(),
                address.getNeighborhood(),
                address.getCity(),
                address.getZipCode(),
                address.getComplement()
        );
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(final String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(final String zipCode) {
        this.zipCode = zipCode;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(final String complement) {
        this.complement = complement;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        final Address address = (Address) o;
        return Objects.equals(getId(), address.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
