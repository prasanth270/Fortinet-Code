package com.prasanth.factoryimpl;

import com.prasanth.factory.AbstractFactory;

/*
 * Factory Provider for Abstract Factory Interface
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {

        if( choice.equalsIgnoreCase("Forest")) {

            return new CreateForestFactory();
        } else if (choice.equalsIgnoreCase("Random")) {

            return new CreateRandomForestFactory();
        } else {

            return null;
        }
    }
}
