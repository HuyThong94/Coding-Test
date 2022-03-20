/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruby;

import java.util.Scanner;

/**
 *
 * @author Luong Huy Thong
 */
public class Furniture extends Thing {
    String serial;
    String nameFurniture;
    int yearRelease;
    String category;

    public Furniture() {
    }

    public Furniture(String Serial, String nameFurniture, int yearRelease, String category) {
        this.serial = Serial;
        this.nameFurniture = nameFurniture;
        this.yearRelease = yearRelease;
        this.category = category;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String Serial) {
        this.serial = serial;
    }

    public String getNameFurniture() {
        return nameFurniture;
    }

    public void setNameFurniture(String nameFurniture) {
        this.nameFurniture = nameFurniture;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    void inputFurniture(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 furniture moi!");
        System.out.println("-----------------");
        System.out.println("Enter Name furniture: ");
        nameFurniture = sc.nextLine();
        System.out.println("Enter Year Release: ");
        yearRelease = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Category: ");
        category = sc.nextLine();
    }    

    @Override
    String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
