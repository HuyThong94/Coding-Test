/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruby;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luong Huy Thong
 */
public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        BookOnTape bookOnTape = new BookOnTape();
        Furniture furniture = new Furniture();
        Scanner sc = new Scanner(System.in);
        RRSList rrsList = new RRSList();
        int choose = 0;
        do {
			System.out.println("MENU ---------- ");
			System.out.println("Select function: ");
			System.out.println(
			  "1.	Enter info.\n"
			+ "2.	List export.\n"
			+ "3.	Search by serial number.\n"
			+ "0.   Exit");
			choose = sc.nextInt();
			sc.nextLine();
			
			switch(choose) {
                            case 1: 
                                do{
                                    System.out.println("Select function: ");
                                    System.out.println(
                                      "1.	Enter Video.\n"
                                    + "2.	Enter Book On Tape.\n"
                                    + "3.	Enter Furniture.\n"
                                    + "0.       Exit");
                                    switch(choose)  {
                                        case 1:
                                            video.inputVideo();
                                            Video vd = new Video();
                                            rrsList.addVideo(vd);
                                        break;
                                        case 2:
                                            bookOnTape.inputBookOnTape();
                                            BookOnTape bot = new BookOnTape();
                                            rrsList.addBookOnTape(bot);
                                        break;
                                        case  3:
                                            furniture.inputFurniture();
                                            Furniture fu = new Furniture();
                                            rrsList.addFurniture(fu);
                                            break;
                                    }
                                }while(choose != 0);
                                break;
                            case 2:
				rrsList.printInfo();
				break;
                            case 3:
				System.out.println("Enter Serial: "); 
                                String serial = sc.nextLine();
				System.out.println("Search Results: ");
				rrsList.searchInfo(serial);
                                break;
                        }
        
        }while(choose != 0);   
    }
}
