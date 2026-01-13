/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author Pasindu
 */
public class TowerOfHanoi {
 
    // Recursive function
    public static void hanoi(int n, char fromRod, char toRod, char auxRod) {

        // Base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            return;
        }

        // Move n-1 disks to auxiliary rod
        hanoi(n - 1, fromRod, auxRod, toRod);

        // Move largest disk
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);

        // Move n-1 disks to destination rod
        hanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        hanoi(n, 'A', 'C', 'B');
    }
}
   

