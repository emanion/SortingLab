/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

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
        
//        Map<String, Song> songs = new HashMap<String, Song>();
//        
//        LocalDate releaseDate = LocalDate.of(1958, Month.MARCH, 20);
//        songs.put("Quack Quack", 
//                new Song("Quack Quack","Donald Duck", releaseDate, 2.2));
//        
//        LocalDate releaseDate2 = LocalDate.of(1943, Month.MAY, 19);
//        songs.put("Beer Barrel Polka", 
//                new Song("Beer Barrel Polka","Johnny Crunch", releaseDate2, 1.5));
//        
//        LocalDate releaseDate3 = LocalDate.of(2010, Month.SEPTEMBER, 01);
//        songs.put("Jump Around", 
//                new Song("Jump Around","House of Pain", releaseDate2, 3.2));
//        
//        LocalDate releaseDate4 = LocalDate.of(1996, Month.JANUARY, 12);
//        songs.put("Letter B", 
//                new Song("Letter B","Sesame Street", releaseDate2, 5.4));
//        
//        Set songKeys = songs.keySet();
//        for (Object key: songKeys){
//            Song foundSong = (Song)songs.get(key);
//            System.out.println(foundSong);
            
            
            
            
            
            
            
        
        
        Map<String, Song> songs = new LinkedHashMap<String, Song>();
        
        LocalDate releaseDate = LocalDate.of(1958, Month.MARCH, 20);
        songs.put("Quack Quack", 
                new Song("Quack Quack","Donald Duck", releaseDate, 2.2));
        
        LocalDate releaseDate2 = LocalDate.of(1943, Month.MAY, 19);
        songs.put("Beer Barrel Polka", 
                new Song("Beer Barrel Polka","Johnny Crunch", releaseDate2, 1.5));
        
        LocalDate releaseDate3 = LocalDate.of(2010, Month.SEPTEMBER, 01);
        songs.put("Jump Around", 
                new Song("Jump Around","House of Pain", releaseDate2, 3.2));
        
        LocalDate releaseDate4 = LocalDate.of(1996, Month.JANUARY, 12);
        songs.put("Letter B", 
                new Song("Letter B","Sesame Street", releaseDate2, 5.4));
        
        Set songKeys = songs.keySet();
        for (Object key: songKeys){
            Song foundSong = (Song)songs.get(key);
            System.out.println(foundSong);    
            
            
        }
        
    }
    
}
