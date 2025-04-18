package com.project.chama_pro_servico.entities.enums;

public enum NotificationType {

    INFO("info"),
    WARNING("warning"),
    ERROR("error"),
    SUCCESS("success");

    final String type;

    NotificationType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
