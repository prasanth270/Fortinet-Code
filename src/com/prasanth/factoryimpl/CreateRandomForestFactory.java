package com.prasanth.factoryimpl;

import com.prasanth.concreteforest.CreateForest;
import com.prasanth.concreteforest.RandomForest;
import com.prasanth.factory.AbstractFactory;
import com.prasanth.forest.Forest;

/*
 * Random Forest Factory Creates animals and trees with system generated random values
 */
public class CreateRandomForestFactory extends AbstractFactory {

    @Override
    public Forest withElements(int animals, int trees) {
        return new RandomForest(animals, trees);
    }

}
