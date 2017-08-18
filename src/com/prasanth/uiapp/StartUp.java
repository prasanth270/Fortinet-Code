package com.prasanth.uiapp;

import com.prasanth.factory.AbstractFactory;
import com.prasanth.factoryimpl.FactoryProducer;
import com.prasanth.forest.Forest;

import java.util.Random;
import java.util.Scanner;

/*
 * Start Your Application Here
 */
public class StartUp {

    private static AbstractFactory abstractFactory;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for 10 animals and 5 trees, 2 for random number of animals\n");

        int input = scanner.nextInt();

        if (input == 1) {
            abstractFactory = FactoryProducer.getFactory("forest");

            Forest forest = abstractFactory.withElements(10, 5);
            forest.createAnimals();
            forest.createTrees("bush");

        } else if (input == 2) {

            abstractFactory = FactoryProducer.getFactory("random");
            Random random = new Random();
            int animals  = random.nextInt((20 - 0) + 1) + 0;
            int trees  = random.nextInt((10 - 0) + 1) + 0;

            Forest forest = abstractFactory.withElements(animals, trees);
            forest.createAnimals();
            forest.createTrees("bush");

        } else {

            System.out.println("These options are not the scope!");
        }

    }
}
