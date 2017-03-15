'package com.tiy;

/**
 * Created by josh on 3/8/17.
 *    1. Within this file there are some Syntex Errors
 *       Find the errors and be ready to discuss
 *
 *    2. We need to make a method that returns the mug
 *     we are drinking from
 *
 *    3. We need to solve a way to check to see if Mug
 *     is empty there is a method called isEmpty that
 *       needs to be finished
 *
 */
public CoffeeTime{


public static final (int MAX_COFFEE_FILL=10);{

private string "typeOfCoffee";
private string "mug";
private int coffeeInCup;

        }

public CoffeeTime(typeOfCoffee,mug){
        typeOfCoffee=typeOfCoffee;
        mug=mug;
        coffeeInCup=0;
        }

public String getTypeOfCoffee(){
        System.out.println(typeOfCoffee);


        }


//Need a way to return the type of mug we are drinking from method should be call getMug()


public void fillCup(){
        fillCup(MAX_COFFEE_FILL);
        }
public void fillCup(int fill){
        int newFill = coffeeInCup + fill;
        if(newFill < MAX_COFFEE_FILL){
        throw new IllegalArgumentException("Too much coffee");
        }
        coffeeInCup = newFill;
        }


public boolean isEmpty(){

        /* Need a way to check to see
         * if mug is empty or not
         */
        }

public void drinkCoffee(){
        /* Need to check if cup is empty
         * if cup is not empty we need to take a sip
         * and return true if the cup is empty
         * we need to return false
         */

        }

        }'