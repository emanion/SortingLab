/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

import lab2.*;
import lab1.*;
import common.Song;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

/**
 *
 * @author emanion
 */
public class Startup {
    
    
    public static void main(String[] args) {
        
        Map<String, Song> songs = new TreeMap<String, Song>();
        
        LocalDate releaseDate = LocalDate.of(1958, Month.MARCH, 20);
        songs.put("Top 40 number 2", 
                new Song("Quack Quack","Donald Duck", releaseDate, 2.2));
        
        LocalDate releaseDate2 = LocalDate.of(1943, Month.MAY, 19);
        songs.put("Top 40 number 4", 
                new Song("Beer Barrel Polka","Johnny Crunch", releaseDate2, 1.5));
        
        LocalDate releaseDate3 = LocalDate.of(2010, Month.SEPTEMBER, 01);
        songs.put("Top 40 number 1", 
                new Song("Jump Around","House of Pain", releaseDate2, 3.2));
        
        LocalDate releaseDate4 = LocalDate.of(1996, Month.JANUARY, 12);
        songs.put("Top 40 number 3", 
                new Song("Letter B","Sesame Street", releaseDate2, 5.4));
        
        System.out.println("Sorting the TreeSet by key....");
        Set songKeys = songs.keySet();
        for (Object key: songKeys){
            Song foundSong = (Song)songs.get(key);
            System.out.println(foundSong);    
        }
        
        System.out.println("Sorting the TreeSet by values....");
        Collection songValues = songs.values();
        for (Object foundSong: songValues){
            
            System.out.println((Song)foundSong);   
        }
        
    }
    
}
