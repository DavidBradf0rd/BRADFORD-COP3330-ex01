/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */

package org.example;

import java.util.Scanner; //Scanner Imported

public class SayingHello
{
    public static void main( String[] args )
    {


        System.out.print( "What is your name? " ); //asks user for name
        Scanner input = new Scanner(System.in); //imports scanner
        String name = input.nextLine(); //scans users response
        System.out.print("Hello, "+name+ ", nice to meet you!"); //prints reply with scanned input



    }
}
