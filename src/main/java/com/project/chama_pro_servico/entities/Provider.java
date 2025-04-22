package com.project.chama_pro_servico.entities;

import com.project.chama_pro_servico.entities.enums.UserType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_provider")
public class Provider extends User {

    @Column(nullable = false)
    private String areaOfExpertise;

    @Column(nullable = false)
    private String specialization;

    @Column(nullable = true)
    private String description;

    @Column(nullable = false)
    private BigDecimal valueHour;

    @OneToMany(mappedBy = "provider", cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<Service> services = new ArrayList<>();

    public Provider() { super(); }

    private Provider(
            final UUID id,
            final String firstName,
            final String lastName,
            final String email,
            final String password,
            final Instant registration,
            final UserType userType,
            final Address address,
            final String areaOfExpertise,
            final String specialization,
            final String description,
            final BigDecimal valueHour
    ) {
        super(id, firstName, lastName, email, password, registration, userType, address);
        this.areaOfExpertise = areaOfExpertise;
        this.specialization = specialization;
        this.description = description;
        this.valueHour = valueHour;
    }

    public static Provider from(
            final UUID id,
            final String firstName,
            final String lastName,
            final String email,
            final String password,
            final Instant registration,
            final UserType userType,
            final Address address,
            final String areaOfExpertise,
            final String specialization,
            final String description,
            final BigDecimal valueHour
    ) {
        return new Provider(
                id,
                firstName,
                lastName,
                email,
                password,
                registration,
                userType,
                address,
                areaOfExpertise,
                specialization,
                description,
                valueHour
        );
    }

    public static Provider of(final Provider provider) {
        return Provider.from(
                provider.getId(),
                provider.getFirstName(),
                provider.getLastName(),
                provider.getEmail(),
                provider.getPassword(),
                provider.getRegistration(),
                provider.getUserType(),
                provider.getAddress(),
                provider.areaOfExpertise,
                provider.specialization,
                provider.description,
                provider.valueHour
        );
    }

    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }

    public BigDecimal getValueHour() {
        return valueHour;
    }

    public void setValueHour(BigDecimal valueHour) {
        this.valueHour = valueHour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<Service> getServices() {
        return services;
    }
}
