package com.project.chama_pro_servico.entities;

import com.project.chama_pro_servico.entities.enums.UserType;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Contractor extends User {

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
