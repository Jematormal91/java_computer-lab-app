/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs_55.computerlab;

import java.util.Scanner;

/**
 *
 * @author Jeanelle Torres 11/01/2021
 */
public class ComputerLab {
    
    private String userID;
    private int labNumber;
    private int computerStation;

    public static void main(String[] args){
        int[] labArr = new int[]{1,2,3,4};
        String[] arr_1 = new String[]{"empty","empty","empty","empty","empty"};
        String[] arr_2 = new String[]{"empty","empty","empty","empty","empty","empty"};
        String[] arr_3 = new String[]{"empty","empty","empty","empty"};
        String[] arr_4 = new String[]{"empty","empty","empty"};
        
        System.out.println("LAB STATUS\nLab # Computer Stations");
        
        System.out.print(labArr[0]);
        System.out.println(" 1:"+arr_1[0]+" 2:"+arr_1[1]+" 3:"+arr_1[2]+" 4:"+arr_1[3]+" 5:"+arr_1[4]);
        
        System.out.print(labArr[1]);
        System.out.println(" 1:"+arr_2[0]+" 2:"+arr_2[1]+" 3:"+arr_2[2]+" 4:"+arr_2[3]+" 5:"+arr_2[4]+" 6:"+arr_2[5]);
        
        System.out.print(labArr[2]);
        System.out.println(" 1:"+arr_3[0]+" 2:"+arr_3[1]+" 3:"+arr_3[2]+" 4:"+arr_3[3]);
        
        System.out.print(labArr[3]);
        System.out.println(" 1:"+arr_4[0]+" 2:"+arr_4[1]+" 3:"+arr_4[2]);
        
        int menuChoice = 1;

        while (menuChoice != 0){
            
            showMainMenu();
            ComputerLab lab = new ComputerLab();
            Scanner input = new Scanner (System.in);
            
            System.out.println("");
            menuChoice = input.nextInt();
            
            if (menuChoice == 1){
                System.out.println("Enter the 5 digit ID number of the user logging in:");
                String userID = input.next();
                lab.setUserID(userID);
                
                System.out.println("Enter the lab number the user is logging in from (1-4):");
                int labNumber = input.nextInt();
                lab.setLabNumber(labNumber);
                
                System.out.println("Enter computer sation number the user is logging in to (1-6):");
                int computerStation = input.nextInt();
                lab.setComputerStation(computerStation);
                
                if (labNumber == labArr[0]){
                    if(arr_1[computerStation-1].equals("empty")){
                        arr_1[computerStation-1] = userID;
                    }
                    else {
                        System.out.println("Computer station taken. Check table and choose another.\n");
                        System.out.println("LAB STATUS\nLab # Computer Stations");
        
                        System.out.print(labArr[0]);
                        System.out.println(" 1:"+arr_1[0]+" 2:"+arr_1[1]+" 3:"+arr_1[2]+" 4:"+arr_1[3]+" 5:"+arr_1[4]);

                        System.out.print(labArr[1]);
                        System.out.println(" 1:"+arr_2[0]+" 2:"+arr_2[1]+" 3:"+arr_2[2]+" 4:"+arr_2[3]+" 5:"+arr_2[4]+" 6:"+arr_2[5]);

                        System.out.print(labArr[2]);
                        System.out.println(" 1:"+arr_3[0]+" 2:"+arr_3[1]+" 3:"+arr_3[2]+" 4:"+arr_3[3]);

                        System.out.print(labArr[3]);
                        System.out.println(" 1:"+arr_4[0]+" 2:"+arr_4[1]+" 3:"+arr_4[2]);
                        continue;
                    }
                }
                else if (labNumber == labArr[1]){
                    if(arr_2[computerStation-1].equals("empty")){
                        arr_2[computerStation-1] = userID;
                    }
                    else {
                        System.out.println("Computer station taken. Check table and choose another.\n");
                        System.out.println("LAB STATUS\nLab # Computer Stations");
        
                        System.out.print(labArr[0]);
                        System.out.println(" 1:"+arr_1[0]+" 2:"+arr_1[1]+" 3:"+arr_1[2]+" 4:"+arr_1[3]+" 5:"+arr_1[4]);

                        System.out.print(labArr[1]);
                        System.out.println(" 1:"+arr_2[0]+" 2:"+arr_2[1]+" 3:"+arr_2[2]+" 4:"+arr_2[3]+" 5:"+arr_2[4]+" 6:"+arr_2[5]);

                        System.out.print(labArr[2]);
                        System.out.println(" 1:"+arr_3[0]+" 2:"+arr_3[1]+" 3:"+arr_3[2]+" 4:"+arr_3[3]);

                        System.out.print(labArr[3]);
                        System.out.println(" 1:"+arr_4[0]+" 2:"+arr_4[1]+" 3:"+arr_4[2]);
                        continue;
                    }
                }
                else if (labNumber == labArr[2]){
                    if(arr_3[computerStation-1].equals("empty")){
                        arr_3[computerStation-1] = userID;
                    }
                    else {
                        System.out.println("Computer station taken. Check table and choose another.\n");
                        System.out.println("LAB STATUS\nLab # Computer Stations");
        
                        System.out.print(labArr[0]);
                        System.out.println(" 1:"+arr_1[0]+" 2:"+arr_1[1]+" 3:"+arr_1[2]+" 4:"+arr_1[3]+" 5:"+arr_1[4]);

                        System.out.print(labArr[1]);
                        System.out.println(" 1:"+arr_2[0]+" 2:"+arr_2[1]+" 3:"+arr_2[2]+" 4:"+arr_2[3]+" 5:"+arr_2[4]+" 6:"+arr_2[5]);

                        System.out.print(labArr[2]);
                        System.out.println(" 1:"+arr_3[0]+" 2:"+arr_3[1]+" 3:"+arr_3[2]+" 4:"+arr_3[3]);

                        System.out.print(labArr[3]);
                        System.out.println(" 1:"+arr_4[0]+" 2:"+arr_4[1]+" 3:"+arr_4[2]);
                        continue;
                    }
                }
                else if (labNumber == labArr[3]){
                    if(arr_4[computerStation-1].equals("empty")){
                        arr_4[computerStation-1] = userID;
                    }
                    else {
                        System.out.println("Computer station taken. Check table and choose another.\n");
                        System.out.println("LAB STATUS\nLab # Computer Stations");
        
                        System.out.print(labArr[0]);
                        System.out.println(" 1:"+arr_1[0]+" 2:"+arr_1[1]+" 3:"+arr_1[2]+" 4:"+arr_1[3]+" 5:"+arr_1[4]);

                        System.out.print(labArr[1]);
                        System.out.println(" 1:"+arr_2[0]+" 2:"+arr_2[1]+" 3:"+arr_2[2]+" 4:"+arr_2[3]+" 5:"+arr_2[4]+" 6:"+arr_2[5]);

                        System.out.print(labArr[2]);
                        System.out.println(" 1:"+arr_3[0]+" 2:"+arr_3[1]+" 3:"+arr_3[2]+" 4:"+arr_3[3]);

                        System.out.print(labArr[3]);
                        System.out.println(" 1:"+arr_4[0]+" 2:"+arr_4[1]+" 3:"+arr_4[2]);
                        continue;
                    }
                }
                System.out.println("LAB STATUS\nLab # Computer Stations");
        
                System.out.print(labArr[0]);
                System.out.println(" 1:"+arr_1[0]+" 2:"+arr_1[1]+" 3:"+arr_1[2]+" 4:"+arr_1[3]+" 5:"+arr_1[4]);

                System.out.print(labArr[1]);
                System.out.println(" 1:"+arr_2[0]+" 2:"+arr_2[1]+" 3:"+arr_2[2]+" 4:"+arr_2[3]+" 5:"+arr_2[4]+" 6:"+arr_2[5]);

                System.out.print(labArr[2]);
                System.out.println(" 1:"+arr_3[0]+" 2:"+arr_3[1]+" 3:"+arr_3[2]+" 4:"+arr_3[3]);

                System.out.print(labArr[3]);
                System.out.println(" 1:"+arr_4[0]+" 2:"+arr_4[1]+" 3:"+arr_4[2]);
        
            }
            else if (menuChoice == 2){
                System.out.println("Enter the 5 digit ID number of the user to find:");
                String userID = input.next();
                lab.setUserID(userID);
                for (int i=0; i < arr_1.length; i++){
                    if (arr_1[i].equals(userID)){
                    arr_1[i] = "empty";
                    }
                }
                for (int i=0; i < arr_2.length; i++){
                    if (arr_2[i].equals(userID)){
                       arr_2[i] = "empty";
                    }
                }
                for (int i=0; i < arr_3.length; i++){
                    if (arr_3[i].equals(userID)){
                        arr_3[i] = "empty";
                    }     
                }
                for (int i=0; i < arr_4.length; i++){
                    if (arr_4[i].equals(userID)){
                        arr_4[i] = "empty";
                    }     
                }
                System.out.println("User "+userID+" is logged off.");
                System.out.println("LAB STATUS\nLab # Computer Stations");
        
                System.out.print(labArr[0]);
                System.out.println(" 1:"+arr_1[0]+" 2:"+arr_1[1]+" 3:"+arr_1[2]+" 4:"+arr_1[3]+" 5:"+arr_1[4]);

                System.out.print(labArr[1]);
                System.out.println(" 1:"+arr_2[0]+" 2:"+arr_2[1]+" 3:"+arr_2[2]+" 4:"+arr_2[3]+" 5:"+arr_2[4]+" 6:"+arr_2[5]);

                System.out.print(labArr[2]);
                System.out.println(" 1:"+arr_3[0]+" 2:"+arr_3[1]+" 3:"+arr_3[2]+" 4:"+arr_3[3]);

                System.out.print(labArr[3]);
                System.out.println(" 1:"+arr_4[0]+" 2:"+arr_4[1]+" 3:"+arr_4[2]);
        
            }
            else if (menuChoice == 3){
                System.out.println("Enter the 5 digit ID number of the user to find:");
                String userID = input.next();
                lab.setUserID(userID);
                String result = "not found";
                for (int i=0; i < arr_1.length; i++){
                    if (arr_1[i].equals(userID)){
                    System.out.println("Found. Lab #1. Computer Station:"+(i+1));
                    result = "found";
                    }
                }
                for (int i=0; i < arr_2.length; i++){
                    if (arr_2[i].equals(userID)){
                    System.out.println("Found. Lab #2. Computer Station:"+(i+1));
                    result = "found";
                    }     
                }
                for (int i=0; i < arr_3.length; i++){
                    if (arr_3[i].equals(userID)){
                    System.out.println("Found. Lab #3. Computer Station:"+(i+1));
                    result = "found";
                    }     
                }
                for (int i=0; i < arr_4.length; i++){
                    if (arr_4[i].equals(userID)){
                    System.out.println("Found. Lab #4. Computer Station:"+(i+1));
                    result = "found";
                    }     
                }
                if (result.equals("not found")){
                    System.out.println("none");
                }
            }  
        }
    }
    public static void showMainMenu(){
        System.out.println("\nMAIN MENU");
        System.out.println("0) Quit");
        System.out.println("1) Simulate login");
        System.out.println("2) Simulate logoff");
        System.out.println("3) Search");
    }

    public void setUserID(String userID){
        this.userID = userID;
    }
    
    public void setLabNumber(int labNumber){
        this.labNumber = labNumber;
    }
    public void setComputerStation(int computerStation){
        this.computerStation = computerStation;
    }
    
    public String getUserID(){
        return userID;
    }
    
    public int getLabNumber(){
        return labNumber;
    }
    
    public int getComputerStation(){
        return computerStation;
    }
}
        
        