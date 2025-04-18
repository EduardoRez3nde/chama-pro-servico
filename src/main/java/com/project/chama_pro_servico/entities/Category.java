package com.project.chama_pro_servico.entities;

import java.util.UUID;

public class Category {

    private UUID id;
    private String name;
    private String description;

    public Category() { }

    private Category(final UUID id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static Category from(final UUID id, final String name, final String description) {
        return new Category(id, name, description);
    }

    public static Category of(final Category category) {
        return Category.from(category.getId(), category.getName(), category.getDescription());
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }
}
