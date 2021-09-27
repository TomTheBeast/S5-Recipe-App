package com.tomgarber.services;


import com.tomgarber.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}