package com.example.project.Entity.Anime;
import com.example.project.Entity.character.Characters;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
    @Table(name = "stats")
    public class Stats {

        @Id
        @Column(name = "mal_id", insertable = false, updatable = false)
        private Long malId;

        @Column(name = "watching")
        private Integer watching;


        private Integer completed;

        @Column(name = "on_hold")
        private Integer onHold;

        private Integer dropped;

        @Column(name = "plan_to_watch")
        private Integer planToWatch;

        private Integer total;

        @Column(name = "score_1_votes")
        private Integer score1Votes;

        @Column(name = "score_1_percentage")
        private Double score1Percentage;

        @Column(name = "score_2_votes")
        private Integer score2Votes;

        @Column(name = "score_2_percentage")
        private Double score2Percentage;

        @Column(name = "score_3_votes")
        private Integer score3Votes;

        @Column(name = "score_3_percentage")
        private Double score3Percentage;

        @Column(name = "score_4_votes")
        private Integer score4Votes;

        @Column(name = "score_4_percentage")
        private Double score4Percentage;

        @Column(name = "score_5_votes")
        private Integer score5Votes;

        @Column(name = "score_5_percentage")
        private Double score5Percentage;

        @Column(name = "score_6_votes")
        private Integer score6Votes;

        @Column(name = "score_6_percentage")
        private Double score6Percentage;

        @Column(name = "score_7_votes")
        private Integer score7Votes;

        @Column(name = "score_7_percentage")
        private Double score7Percentage;

        @Column(name = "score_8_votes")
        private Integer score8Votes;

        @Column(name = "score_8_percentage")
        private Double score8Percentage;

        @Column(name = "score_9_votes")
        private Integer score9Votes;

        @Column(name = "score_9_percentage")
        private Double score9Percentage;

        @Column(name = "score_10_votes")
        private Integer score10Votes;

        @Column(name = "score_10_percentage")
        private Double score10Percentage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mal_id", nullable = false)
    @JsonBackReference
    private Details details;

        public Long getMalId() {
            return malId;
        }

        public void setMalId(Long malId) {
            this.malId = malId;
        }

        public Integer getWatching() {
            return watching;
        }

        public void setWatching(Integer watching) {
            this.watching = watching;
        }

        public Integer getCompleted() {
            return completed;
        }

        public void setCompleted(Integer completed) {
            this.completed = completed;
        }

        public Integer getOnHold() {
            return onHold;
        }

        public void setOnHold(Integer onHold) {
            this.onHold = onHold;
        }

        public Integer getDropped() {
            return dropped;
        }

        public void setDropped(Integer dropped) {
            this.dropped = dropped;
        }

        public Integer getPlanToWatch() {
            return planToWatch;
        }

        public void setPlanToWatch(Integer planToWatch) {
            this.planToWatch = planToWatch;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getScore1Votes() {
            return score1Votes;
        }

        public void setScore1Votes(Integer score1Votes) {
            this.score1Votes = score1Votes;
        }

        public Double getScore1Percentage() {
            return score1Percentage;
        }

        public void setScore1Percentage(Double score1Percentage) {
            this.score1Percentage = score1Percentage;
        }

        public Integer getScore2Votes() {
            return score2Votes;
        }

        public void setScore2Votes(Integer score2Votes) {
            this.score2Votes = score2Votes;
        }

        public Double getScore2Percentage() {
            return score2Percentage;
        }

        public void setScore2Percentage(Double score2Percentage) {
            this.score2Percentage = score2Percentage;
        }

        public Integer getScore3Votes() {
            return score3Votes;
        }

        public void setScore3Votes(Integer score3Votes) {
            this.score3Votes = score3Votes;
        }

        public Double getScore3Percentage() {
            return score3Percentage;
        }

        public void setScore3Percentage(Double score3Percentage) {
            this.score3Percentage = score3Percentage;
        }

        public Integer getScore4Votes() {
            return score4Votes;
        }

        public void setScore4Votes(Integer score4Votes) {
            this.score4Votes = score4Votes;
        }

        public Double getScore4Percentage() {
            return score4Percentage;
        }

        public void setScore4Percentage(Double score4Percentage) {
            this.score4Percentage = score4Percentage;
        }

        public Integer getScore5Votes() {
            return score5Votes;
        }

        public void setScore5Votes(Integer score5Votes) {
            this.score5Votes = score5Votes;
        }

        public Double getScore5Percentage() {
            return score5Percentage;
        }

        public void setScore5Percentage(Double score5Percentage) {
            this.score5Percentage = score5Percentage;
        }

        public Integer getScore6Votes() {
            return score6Votes;
        }

        public void setScore6Votes(Integer score6Votes) {
            this.score6Votes = score6Votes;
        }

        public Double getScore6Percentage() {
            return score6Percentage;
        }

        public void setScore6Percentage(Double score6Percentage) {
            this.score6Percentage = score6Percentage;
        }

        public Integer getScore7Votes() {
            return score7Votes;
        }

        public void setScore7Votes(Integer score7Votes) {
            this.score7Votes = score7Votes;
        }

        public Double getScore7Percentage() {
            return score7Percentage;
        }

        public void setScore7Percentage(Double score7Percentage) {
            this.score7Percentage = score7Percentage;
        }

        public Integer getScore8Votes() {
            return score8Votes;
        }

        public void setScore8Votes(Integer score8Votes) {
            this.score8Votes = score8Votes;
        }

        public Double getScore8Percentage() {
            return score8Percentage;
        }

        public void setScore8Percentage(Double score8Percentage) {
            this.score8Percentage = score8Percentage;
        }

        public Integer getScore9Votes() {
            return score9Votes;
        }

        public void setScore9Votes(Integer score9Votes) {
            this.score9Votes = score9Votes;
        }

        public Double getScore9Percentage() {
            return score9Percentage;
        }

        public void setScore9Percentage(Double score9Percentage) {
            this.score9Percentage = score9Percentage;
        }

        public Integer getScore10Votes() {
            return score10Votes;
        }

        public void setScore10Votes(Integer score10Votes) {
            this.score10Votes = score10Votes;
        }

        public Double getScore10Percentage() {
            return score10Percentage;
        }

        public void setScore10Percentage(Double score10Percentage) {
            this.score10Percentage = score10Percentage;
        }
    }
