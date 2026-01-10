package com.example.project.Entity.Anime;


import com.example.project.Entity.character.Characters;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="recommendations")
public class Recommendations {

    @Id
    @Column(name="mal_id", insertable = false, updatable = false)
    private Long MalId;

    @Column(name="recommendation_mal_Id")
    private Long RMalId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mal_id", nullable = false)
    @JsonBackReference
    private Details details;

    public Long getMalId() {
        return MalId;
    }

    public void setMalId(Long malId) {
        MalId = malId;
    }

    public Long getRMalId() {
        return RMalId;
    }

    public void setRMalId(Long RMalId) {
        this.RMalId = RMalId;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }
}
