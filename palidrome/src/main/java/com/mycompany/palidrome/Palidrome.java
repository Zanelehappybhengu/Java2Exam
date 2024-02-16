/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palidrome;

/**
 *
 * @author Dell-User
 */
public class Palidrome {

    public static void main(String[] args) {
        int number = 12321; // Change this number to test different cases
        
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    // Function to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reverse = 0;

        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }

        return originalNumber == reverse;
    
    }
}
