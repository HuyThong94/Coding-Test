/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruby;

import java.util.ArrayList;

/**
 *
 * @author Luong Huy Thong
 */
public class RRSList {
    private ArrayList<Video> video1;
    private ArrayList<Furniture> furniture1;
    private ArrayList<BookOnTape> bookOnTap1;

    public RRSList() {
        this.video1 = new ArrayList<Video>();
        this.bookOnTap1 = new ArrayList<BookOnTape>();
        this.furniture1 = new ArrayList<Furniture>();
    }
    
    public RRSList(ArrayList<Video> video1, ArrayList<Furniture> furniture1, ArrayList<BookOnTape> bookOnTap1) {
        this.video1 = video1;
        this.furniture1 = furniture1;
        this.bookOnTap1 = bookOnTap1;
    }
    public void addVideo(Video vd){
        this.video1.add(vd);
    }
    public void addBookOnTape(BookOnTape bot){
        this.bookOnTap1.add(bot);
    }
    public void addFurniture(Furniture fu){
        this.furniture1.add(fu);
    }
    public void printInfo(){
        for(Video v : video1){
            System.out.println(v);
        }
        for(BookOnTape b : bookOnTap1){
            System.out.println(b);
        }
        for(Furniture f : furniture1){
            System.out.println(f);
        }
    }
    public void searchInfo(String ser){
        for(Video v : video1){
            if(v.getSerial().indexOf(ser) >= 0){
                System.out.println(v);
            }
        }
        for(BookOnTape b : bookOnTap1){
            if(b.getSerial().indexOf(ser) >= 0){
                System.out.println(b);
            }
        }
        for(Furniture f : furniture1){
            if(f.getSerial().indexOf(ser) >= 0){
                System.out.println(f);
            }
        }
    }
    
}
