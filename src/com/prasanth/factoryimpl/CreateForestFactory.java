package com.prasanth.factoryimpl;

import com.prasanth.concreteforest.CreateForest;
import com.prasanth.factory.AbstractFactory;
import com.prasanth.forest.Forest;

/*
 * Create Forest Factory Creates animals and trees with user specified values
 */
public class CreateForestFactory extends AbstractFactory {

    @Override
    public Forest withElements(int animals, int trees) {
        return new CreateForest(animals, trees);
    }

}
