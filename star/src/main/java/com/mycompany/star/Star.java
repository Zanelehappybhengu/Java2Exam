/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.star;

/**
 *
 * @author Dell-User
 */
public class Star {

    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern
        
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
