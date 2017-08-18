package com.prasanth.factory;

import com.prasanth.forest.Forest;

/*
 * Abstract Factory to create the Forest instances
 */
public abstract class AbstractFactory {

    // Returns a Forest Object
    public abstract Forest withElements(int animals, int trees);

}

