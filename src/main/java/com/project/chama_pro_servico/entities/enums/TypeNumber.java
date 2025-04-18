package com.project.chama_pro_servico.entities.enums;

public enum TypeNumber {

    MOBILE("mobile"),
    LANDLINE("landline");

    final String type;

    TypeNumber(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
