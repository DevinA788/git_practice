/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hellojavaworld;

/**
 *
 * @author dalbishi
 */
public class TestArrays {
    public static void main (String [] args) {
        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2; 
        String[] islands = new String[4]; 
        islands[0] = "Bermuda"; 
        islands[1] = "Fiji"; 
        islands[2] = "Cosumel"; 
        islands[3] = "Azores";
        int y = 0; 
        int ref;
        while (y < 4) {
            ref = index [y]; 
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1; 
        }
    }
}
