package com.project.chama_pro_servico.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Service {

    private UUID id;
    private String title;
    private String description;
    private BigDecimal basePrice;
    private Instant creation;
    private boolean active;

    private Provider provider;
    private Category category;
    private final List<Order> orders = new ArrayList<>();

    public Service() { }

    private Service(
            final UUID id,
            final String title,
            final String description,
            final BigDecimal basePrice,
            final Instant creation,
            final boolean active,
            final Provider provider,
            final Category category
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.basePrice = basePrice;
        this.creation = creation;
        this.active = active;
        this.provider = provider;
        this.category = category;
    }

    public static Service from(
            final UUID id,
            final String title,
            final String description,
            final BigDecimal basePrice,
            final boolean active,
            final Provider provider,
            final Category category
    ) {
        return new Service(id, title, description, basePrice, Instant.now(), active, provider, category);
    }

    public static Service of(final Service service) {
        return Service.from(
                service.getId(),
                service.getTitle(),
                service.getDescription(),
                service.getBasePrice(),
                service.isActive(),
                service.getProvider(),
                service.getCategory()
        );
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(final BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public Instant getCreation() {
        return creation;
    }

    public void setCreation(final Instant creation) {
        this.creation = creation;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(final boolean active) {
        this.active = active;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
