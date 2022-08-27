package com.example.Postgres.Test.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_of_ratings")
    private int numberOfRatings;

    @Column(name = "rating")
    private double rating;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    @JsonIgnoreProperties({"rating"})
    private Recipe recipe;

    public Reviews(int numberOfRatings, double rating, Recipe recipe) {
        this.numberOfRatings = numberOfRatings;
        this.rating = rating;
        this.recipe = recipe;
    }

    public Reviews() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public double getRatingAverage() {
      int ratingAverage = (int) Math.round(getRating() / getNumberOfRatings());
      return ratingAverage;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
