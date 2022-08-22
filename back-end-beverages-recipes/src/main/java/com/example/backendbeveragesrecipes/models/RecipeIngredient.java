package com.example.backendbeveragesrecipes.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "recipe_ingredients")
public class RecipeIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "recipeIngredient", fetch = FetchType.LAZY)
    @Column(name = "ingredient")
    private RawIngredient recipeIngredient;
    @Column(name = "quantity")
    private double quantity;
    @Column(name = "units")
    private String units;

    @JsonBackReference
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "recipe_ingredients",
            joinColumns = {@JoinColumn(
                    name = "ingredient_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "recipe_id",
                    nullable = false,
                    updatable = false
            )}
    )
    private List<Recipe> recipes;

    public RecipeIngredient(RawIngredient recipeIngredient, double quantity, String units) {
        this.recipeIngredient = recipeIngredient;
        this.quantity = quantity;
        this.units = units;
    }


    public RecipeIngredient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RawIngredient getRecipeIngredient() {
        return recipeIngredient;
    }

    public void setRecipeIngredient(RawIngredient recipeIngredient) {
        this.recipeIngredient = recipeIngredient;
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
