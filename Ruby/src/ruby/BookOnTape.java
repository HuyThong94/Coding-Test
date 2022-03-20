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
public class BookOnTape extends Thing {
    String serial;
    String nameBookOnTape;
    int yearRelease;
    String category;

    public BookOnTape() {
    }

    public BookOnTape(String serial, String nameBookOnTape, int yearRelease, String category) {
        this.serial = serial;
        this.nameBookOnTape = nameBookOnTape;
        this.yearRelease = yearRelease;
        this.category = category;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNameBookOnTape() {
        return nameBookOnTape;
    }

    public void setNameBookOnTape(String nameBookOnTape) {
        this.nameBookOnTape = nameBookOnTape;
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
    
    void inputBookOnTape(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 book on tape moi!");
        System.out.println("-----------------");
        System.out.println("Enter Name book on tape: ");
        nameBookOnTape = sc.nextLine();
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
