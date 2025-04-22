package com.project.chama_pro_servico.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "tb_evaluation")
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private int rating;

    @Column(nullable = false)
    private String comment;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE", nullable = false)
    private Instant evaluationDate;

    public Evaluation() { }

    private Evaluation(
            final UUID id,
            final int rating,
            final String comment,
            final Instant evaluationDate
    ) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
        this.evaluationDate = evaluationDate;
    }

    public static Evaluation from(
            final UUID id,
            final int rating,
            final String comment,
            final Instant evaluationDate
    ) {
        return new Evaluation(id, rating, comment, evaluationDate);
    }

    public static Evaluation of(final Evaluation evaluation) {
        return Evaluation.from(
                evaluation.getId(),
                evaluation.getRating(),
                evaluation.getComment(),
                evaluation.getEvaluationDate()
        );
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(final int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public Instant getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(final Instant evaluationDate) {
        this.evaluationDate = evaluationDate;
    }
}
