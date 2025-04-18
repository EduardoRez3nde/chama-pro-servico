package com.project.chama_pro_servico.entities;

import com.project.chama_pro_servico.entities.enums.NotificationType;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class Notification {

    private UUID id;
    private String message;
    private NotificationType notificationType;
    private boolean isRead;
    private Instant sent;

    public Notification() { }

    private Notification(
            final UUID id,
            final String message,
            final NotificationType notificationType,
            final boolean isRead,
            final Instant sent
    ) {
        this.id = id;
        this.message = message;
        this.notificationType = notificationType;
        this.isRead = isRead;
        this.sent = sent;
    }

    public static Notification from(
            final UUID id,
            final String message,
            final NotificationType notificationType,
            final boolean isRead,
            final Instant sent
    ) {
        return new Notification(id, message, notificationType, isRead, sent);
    }

    public static Notification of(final Notification notification) {
        return Notification.from(
                notification.getId(),
                notification.getMessage(),
                notification.getNotificationType(),
                notification.isRead(),
                notification.getSent()
        );
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(final NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(final boolean read) {
        isRead = read;
    }

    public Instant getSent() {
        return sent;
    }

    public void setSent(final Instant sent) {
        this.sent = sent;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        final Notification that = (Notification) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
