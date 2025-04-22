package com.project.chama_pro_servico.entities;

import com.project.chama_pro_servico.entities.enums.UserType;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_contractor")
public class Contractor extends User {

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "contractor_id")
    private final Set<Order> orders = new HashSet<>();

    public Contractor() { super(); }

    public Contractor(
            final UUID id,
            final String firstName,
            final String lastName,
            final String email,
            final String password,
            final Instant registration,
            final UserType userType,
            final Address address
    ) {
        super(id, firstName, lastName, email, password, registration, userType, address);
    }

    public Set<Order> getOrders() {
        return orders;
    }
}
