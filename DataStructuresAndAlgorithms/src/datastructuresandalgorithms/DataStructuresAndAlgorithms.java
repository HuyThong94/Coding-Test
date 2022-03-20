/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithms;

import java.util.Scanner;

/**
 *
 * @author Luong Huy Thong
 */
public class DataStructuresAndAlgorithms {
    public void splitString(){
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        input = sc.nextLine();;
        // Split String
        String [] inputs = input.split(" ");
        //Find the longest word
        int index = 0;
        int lengthMax = 0;
        for(int i = 0; i < inputs.length; i++){
            int length = inputs[i].length();
            if(length > lengthMax){
                lengthMax = length;
                index = i;
            }
        }
        System.out.println("chuoi nhap vao: " + input);
        System.out.println("Ky tu dai nhat: " + inputs[index] + ", tai vi tri: " + (index + 1) 
                + ", co do dai : " + lengthMax);
    }
    public static void main(String[] args) {
        DataStructuresAndAlgorithms d = new DataStructuresAndAlgorithms();
        d.splitString();
    }
    
}
