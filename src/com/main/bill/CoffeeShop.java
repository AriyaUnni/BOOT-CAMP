package com.main.bill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CoffeeShop {

    static int total = 0;
    String customername;


    int tea, sweetPorotta, cake, juice, iceCream;

    public CoffeeShop(int tea, int sweetPorotta, int cake, int juice, int iceCream) {
        this.tea = tea;
        this.sweetPorotta = sweetPorotta;
        this.cake = cake;
        this.juice = juice;
        this.iceCream = iceCream;
    }

    public int getTea() {
        return tea;
    }

    public int getSweetPorotta() {
        return sweetPorotta;
    }

    public int getCake() {
        return cake;
    }

    public int getJuice() {
        return juice;
    }

    public int getIceCream() {
        return iceCream;
    }

    public static void main(String[] args) {


        CoffeeShop food = new CoffeeShop(10, 15, 20, 10, 25);
        CoffeeShop takeaway = new CoffeeShop(15, 20, 25, 15, 30);
        //    CoffeeShop view = new CoffeeShop(25,60,80,90,40);

        HashMap<String, String> map = new HashMap<String, String>();
        ArrayList<String> transactionList = new ArrayList<>();
        int y;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter the choice");

            System.out.println("1. food");
            System.out.println("2.take away");
            System.out.println("3.exit");
            y = sc.nextInt();


            switch (y) {

                case 1:
                    System.out.println("enter the choice");
                    System.out.println("1.Tea " + food.getTea());
                    System.out.println("2.juice " + food.getJuice());
                    System.out.println("3.cake " + food.getCake());
                    System.out.println("4.Sweet Porotta " + food.getSweetPorotta());
                    System.out.println("5.ice cream " + food.getIceCream());
                    System.out.println("6.BILL");
                    System.out.println("7.Clear BILL");
                    System.out.println("8.exit");
                    System.out.println("select your food item");
                    int m = sc.nextInt();

                    switch (m) {
                        case 1:
                            System.out.println("how many quantity");
                            int l = sc.nextInt();
                            total = (food.tea * l) + total;
                            break;
                        case 2:
                            System.out.println("how many quantity");
                            int p = sc.nextInt();
                            total = (food.juice * p) + total;
                            break;
                        case 3:
                            System.out.println("how many quantity");
                            int q = sc.nextInt();
                            total = (food.cake * q) + total;
                            break;
                        case 4:
                            System.out.println("how many quantity");
                            int w = sc.nextInt();
                            total = (food.sweetPorotta * w) + total;
                            break;
                        case 5:
                            System.out.println("how many quantity");
                            int e = sc.nextInt();
                            total = (food.iceCream * e) + total;
                            break;
                        case 6:

                            System.out.println("Total Bill :" + total);
                            break;
                        case 7:
                            System.out.println("enter your name");
                            String customername = sc.next();
                            map.put("customer name", customername);
                            map.put("Amount", String.valueOf(total));

                            transactionList.add(String.valueOf(map));
                            map.put("mode", "dyining");
                            transactionList.add(String.valueOf(map));
                            System.out.println("Total is" + total);
                            break;
                        case 8:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("invalid input");


                    }

                case 2:

                    System.out.println("1.Tea " + takeaway.getTea());
                    System.out.println("2.juice " + takeaway.getJuice());
                    System.out.println("3.cake " + takeaway.getCake());
                    System.out.println("4.Sweet Porotta " + takeaway.getSweetPorotta());
                    System.out.println("5.ice cream " + takeaway.getIceCream());
                    System.out.println("6.BILL");
                    System.out.println("7.Clear BILL");
                    System.out.println("8.exit");

                    int n = sc.nextInt();

                    switch (n) {
                        case 1:
                            System.out.println("how many quantity");
                            int l = sc.nextInt();
                            total = (food.tea * l) + total;
                            break;
                        case 2:
                            System.out.println("how many quantity");
                            int p = sc.nextInt();
                            total = (food.juice * p) + total;
                            break;
                        case 3:
                            System.out.println("how many quantity");
                            int q = sc.nextInt();
                            total = (food.cake * q) + total;
                            break;
                        case 4:
                            System.out.println("how many quantity");
                            int w = sc.nextInt();
                            total = (food.sweetPorotta * w) + total;
                            break;
                        case 5:
                            System.out.println("how many quantity");
                            int e = sc.nextInt();
                            total = (food.iceCream * e) + total;
                            break;
                        case 6:

                            System.out.println("Total Bill :" + total);
                            break;
                        case 7:

                            System.out.println("enter your name");
                            String customername = sc.next();
                            map.put("customer name", customername);
                            map.put("Amount", String.valueOf(total));

                            transactionList.add(String.valueOf(map));
                            map.put("mode", "dyining");
                            transactionList.add(String.valueOf(map));
                            System.out.println("Total is" + total);
                            System.out.println(map);


                            break;
                        case 8:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("invalid input");

                    }

                case 3:

                    System.out.println(transactionList);

            }
        }
    }
}
