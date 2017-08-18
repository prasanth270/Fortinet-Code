package com.prasanth.concreteforest;

import com.prasanth.forest.Forest;

/*
 * Create a Random Forest with System generated random values
 */
public class RandomForest implements Forest {

    int numOfAnimals;
    int numOfTrees;

    /*
     * Default Constructor
     */
    public RandomForest(int animals, int trees){
        this.numOfAnimals = animals;
        this.numOfTrees = trees;
    }

    @Override
    public void createAnimals() {
        System.out.println("Random:: Creating " + numOfAnimals + " animals in the Forest!");
    }

    @Override
    public void createTrees(String treeType) {
        System.out.println("Random:: Creating " + numOfTrees + " Trees in the Forest of type " + treeType +"!");
    }

}
