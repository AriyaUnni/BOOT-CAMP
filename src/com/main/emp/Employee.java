package com.main.emp;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        int choice;
        String empname;
        ArrayList<String> empList=new ArrayList<String>();

        while (true) {
            System.out.println("select an option");
            System.out.println("1.Add employee");
            System.out.println("2.View employee");

            System.out.println("3.Exit");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();


            switch (choice)
            {

                case 1:
                    System.out.println("Add employee name");
                    empname=sc.next();
                    empList.add(empname);
                    break;
                case 2:
                    if(empList.size()==0) {
                        System.out.println("No employees added");
                    }
                    else {
                        System.out.println(empList);
                    }
                    break;



                case 3:
                    System.exit(0);


            }
        }


    }
}
