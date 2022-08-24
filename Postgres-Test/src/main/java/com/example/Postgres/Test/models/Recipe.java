package com.example.Postgres.Test.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "approved")
    private Boolean approved;

    @Column(name = "type")
    private String type;

    @Column(name = "rating")
    private double rating;

    @Column(name = "image")
    private String image;

    @Column(name = "difficulty")
    private String difficulty;

    @Column(name = "prep_time")
    private int prepTime;

    @JsonIgnoreProperties({"rawIngredients"})
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "recipes_ingredients",
            joinColumns = {@JoinColumn(name = "recipe_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="recipe_ingredient_id", nullable = false, updatable = false)}
    )
    private List<RecipeIngredient> ingredients;

    @OneToMany(mappedBy = "recipe", fetch = FetchType.LAZY)
    private List<Instructions> instructions;

    @Column(name = "video")
    private String video;

    public Recipe(String name, String author, Boolean approved, String type, double rating, String image, String difficulty, int prepTime, String video) {
        this.name = name;
        this.author = author;
        this.approved = approved;
        this.type = type;
        this.rating = rating;
        this.image = image;
        this.difficulty = difficulty;
        this.prepTime = prepTime;
        this.ingredients = new ArrayList<RecipeIngredient>();
        this.instructions = new ArrayList<Instructions>();
        this.video = video;
    }

    public Recipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public List<RecipeIngredient> getIngredients() {
        return ingredients;
    }

    public List<Instructions> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instructions> instructions) {
        this.instructions = instructions;
    }

    public void setIngredients(List<RecipeIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void addIngredients(RecipeIngredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }
}
