package com.prasanth.concreteforest;

import com.prasanth.forest.Forest;

/*
 * Create a Forest with User Specified Values
 */
public class CreateForest implements Forest {

    int numOfAnimals;
    int numOfTrees;

    /*
     * Default Constructor
     */
    public CreateForest(int animals, int trees){
        this.numOfAnimals = animals;
        this.numOfTrees = trees;
    }

    @Override
    public void createAnimals() {
        System.out.println("Creating " + numOfAnimals + " animals in the Forest!");
    }

    @Override
    public void createTrees(String treeType) {
        System.out.println("Creating " + numOfTrees + " Trees in the Forest of type " + treeType +"!");
    }
}
