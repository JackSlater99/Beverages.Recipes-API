package com.example.beveragesrecipes.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "raw_ingredients")
public class RawIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name = "alcoholic")
    private Boolean alcoholic;
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "rawIngredient", fetch = FetchType.LAZY)
    private List<RecipeIngredient> recipeIngredient;

    public RawIngredient(String name, String image, Boolean alcoholic, String description) {
        this.name = name;
        this.image = image;
        this.alcoholic = alcoholic;
        this.description = description;
    }

    public RawIngredient() {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(Boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
