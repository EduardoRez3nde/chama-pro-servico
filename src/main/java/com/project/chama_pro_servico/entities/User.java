package com.project.chama_pro_servico.entities;

import com.project.chama_pro_servico.entities.enums.UserType;

import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public abstract class User {

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Instant registration;
    private UserType userType;

    private Address address;
    private Set<Notification> notification = new HashSet<>();
    private final Set<Phone> phones = new HashSet<>();

    public User() { }

    public User(
            final UUID id,
            final String firstName,
            final String lastName,
            final String email,
            final String password,
            final Instant registration,
            final UserType userType,
            final Address address
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.registration = registration;
        this.userType = userType;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public Instant getRegistration() {
        return registration;
    }

    public void setRegistration(final Instant registration) {
        this.registration = registration;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(final UserType userType) {
        this.userType = userType;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public Set<Notification> getNotification() {
        return notification;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        final User user = (User) o;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
