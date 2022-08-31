package com.example.Postgres.Test.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipe_ingredients")
public class RecipeIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "raw_ingredient_id", nullable = false)
    private RawIngredient rawIngredient;

    @Column(name = "quantity")
    private double quantity;
    @Column(name = "units")
    private String units;

    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JsonIgnoreProperties({"recipes"})
    @JoinTable(
            name = "recipes_ingredients",
            joinColumns = {@JoinColumn(name = "recipe_ingredient_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "recipe_id", nullable = false, updatable = false)}
    )
    private List<Recipe> recipes;

    public RecipeIngredient(RawIngredient rawIngredient, double quantity, String units) {
        this.rawIngredient = rawIngredient;
        this.quantity = quantity;
        this.units = units;
        this.recipes = new ArrayList<Recipe>();
    }


    public RecipeIngredient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RawIngredient getRawIngredient() {
        return rawIngredient;
    }

    public void setRawIngredient(RawIngredient rawIngredient) {
        this.rawIngredient = rawIngredient;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
    
}
