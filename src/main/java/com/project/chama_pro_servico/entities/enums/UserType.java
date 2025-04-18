package com.project.chama_pro_servico.entities.enums;

public enum UserType {

    PROVIDER("provider"),
    CONTRACTOR("contractor");

    final String type;


    UserType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
