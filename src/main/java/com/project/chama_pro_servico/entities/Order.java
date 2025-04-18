package com.project.chama_pro_servico.entities;

import com.project.chama_pro_servico.entities.enums.Status;

import java.time.LocalDateTime;
import java.util.UUID;

public class Order {

    private UUID id;
    private LocalDateTime solicitationDate;
    private LocalDateTime scheduledDate;
    private Status status;
    private String consideration;

    private Evaluation evaluation;
    private Service service;

    public Order() { }

    private Order(
            final UUID id,
            final LocalDateTime solicitationDate,
            final LocalDateTime scheduledDate,
            final Status status,
            final String consideration,
            final Evaluation evaluation,
            final Service service
    ) {
        this.id = id;
        this.solicitationDate = solicitationDate;
        this.scheduledDate = scheduledDate;
        this.status = status;
        this.consideration = consideration;
        this.evaluation = evaluation;
        this.service = service;
    }

    public static Order from(
            final UUID id,
            final LocalDateTime solicitationDate,
            final LocalDateTime scheduledDate,
            final Status status,
            final String consideration,
            final Evaluation evaluation,
            final Service service
    ) {
        return new Order(id, solicitationDate, scheduledDate, status, consideration, evaluation, service);
    }

    public static Order of(final Order order) {
        return Order.from(
                order.getId(),
                order.getSolicitationDate(),
                order.getScheduledDate(),
                order.getStatus(),
                order.getConsideration(),
                order.getEvaluation(),
                order.getService()
        );
    }

    public String getConsideration() {
        return consideration;
    }

    public void setConsideration(final String consideration) {
        this.consideration = consideration;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(final Status status) {
        this.status = status;
    }

    public LocalDateTime getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(final LocalDateTime scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public LocalDateTime getSolicitationDate() {
        return solicitationDate;
    }

    public void setSolicitationDate(final LocalDateTime solicitationDate) {
        this.solicitationDate = solicitationDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
