package com.tomgarber.services;


import com.tomgarber.commands.RecipeCommand;
import com.tomgarber.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand (RecipeCommand command);

    void deleteById(Long l);
}