package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    private  ArrayList<String> groceryList=new ArrayList<>();
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        GroceryList groceryList=new GroceryList();
        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice:");

            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryItem();
                    break;
                case 2:
                    groceryList.addItem();
                    break;
                case 3:
                    groceryList.modifyItem();
                    break;
                case 4:
                    groceryList.removeItem();
                    break;
                case 5:
                    groceryList.searchItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0- to print choice options");
        System.out.println("\t 1- to print the list grocery items.");
        System.out.println("\t 2- to add an item to the list.");
        System.out.println("\t 3- to modify an item in the list." );
        System.out.println("\t 4- to remove an item from the list.");
        System.out.println("\t 5- to search an item in the list.");
        System.out.println("\t 6- to quit the application");

    }
    public  void addItem(){
        System.out.println("Please enter the grocery item: ");
        addGroceryItem(scanner.nextLine());
    }
    public void   modifyItem(){
        System.out.println("Enter item number: ");
        int itemNo=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem=scanner.nextLine();
        modifyGroceryItem(itemNo-1,newItem);
    }
    public void removeItem(){
        System.out.println("Enter item number:");
        int itemNo=scanner.nextInt();
        scanner.nextLine();
        removeGroceryItem(itemNo);
    }
    public  void searchItem(){
        System.out.println("Item to search for: ");
        String searchItem=scanner.nextLine();
        if(findItem(searchItem)!=null){
            System.out.println("Found "+searchItem+" in your grocery list.");
        }
        else
            System.out.println(searchItem+" is not in the grocery list.");
    }
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryItem(){
        System.out.println("You have "+groceryList.size()+" items in your grocery list");
        for(int i=0;i<groceryList.size();i++)
            System.out.println((i+1)+"."+groceryList.get(i));
    }
    public void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+position+1+" has been modified.");
    }
    public void removeGroceryItem(int position){
        String theItem=groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String searchItem){
        boolean exist=groceryList.contains(searchItem);
        int position=groceryList.indexOf(searchItem);
        if(position>=0){
            return groceryList.get(position);
        }
        return null;
    }

}
