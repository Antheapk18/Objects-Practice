/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author anthe
 */
public class main {
    
    public static void main(String[] args) {
        Coordinate c = new Coordinate(3, 4, 5);
        
        System.out.println(c.getX());
        
        try {
            Scanner scan = new Scanner(new File("Players.txt")); //looks for file "Players" & scans
          
            Player [] playerList = new Player[32];//list of players, 32 long
            
            int position = 0;
            while (scan.hasNext()) { //while scanner has another line in the file to scan
                String line = scan.nextLine();
                System.out.println(line); //print each line
                
                //split line
              
                Scanner delim = new Scanner(line).useDelimiter(","); //split up line by its commas
                playerList[position] = new Player(delim.nextInt(), delim.next(), delim.next());
                position++;
          }
            System.out.println(playerList[2].getCountry());
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
    }
    
    

            
}
}
