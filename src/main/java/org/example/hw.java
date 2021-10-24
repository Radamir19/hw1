package org.example;

public class hw {

    public static void main(String[] args) {
        //compareNumbers();
        //printColor();
        //CheckSumSign();
        //printThreeWords();
    }public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }public static void CheckSumSign(){
        int a =10;
        int b = -11;
        int c = a + b;
        if(c >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }public static void printColor(){
        int value = -10;
        if(value <= 0){
            System.out.println("Красный");
        }else if(value >=0 && value <= 100){
            System.out.println("Желтый");
        }else if(value > 100){
            System.out.println("Зелёный");
        }
    }public static void compareNumbers(){
        int integareVar = 10;
        int intVar = 5;
        if(integareVar >= intVar){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }




}
