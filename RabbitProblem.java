/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author Pasindu
 */

import java.util.Scanner;

public class RabbitProblem {

    static int rabbits(int month) {
        if (month == 0 || month == 1)
            return month;
        return rabbits(month - 1) + rabbits(month - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        System.out.println("Number of rabbit pairs after " + months + " months: "
                + rabbits(months));
    }
}
  

