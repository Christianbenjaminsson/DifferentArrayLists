package com.example.differentarraylists;

import java.util.ArrayList;

public class DifferentArraylists {

    public static void main(String[] args) {


        public static void processArrayList () {
            ArrayList<String> newArray = new ArrayList<String>();
            newArray.addAll(groceryList.getGroceryList());

            ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

            String[] myArray = new String[groceryList.getGroceryList().size()];
            myArray = groceryList.getGroceryList().toArray(myArray);
        }
    }
}
