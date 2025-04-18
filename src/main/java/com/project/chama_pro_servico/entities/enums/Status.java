package com.project.chama_pro_servico.entities.enums;

public enum Status {
    RECEIVED("received"),
    COMPLETED("completed"),
    CANCELLED("cancelled");

    final String type;

    Status(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

