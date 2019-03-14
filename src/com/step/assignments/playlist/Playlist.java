package com.step.assignments.playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Playlist {
    private static ArrayList<Album> albums;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Song> songs;

        Album album1 = new Album("1989");
        album1.addSong(new Song("blank space",5.14));
        album1.addSong(new Song("Welcome to Newyork",4.05));
        album1.addSong(new Song("Style",3.51));
        album1.addSong(new Song("Wildest Dreams",3.21));
        boolean exit = false;
        while(!exit) {
            int option = scanner.nextInt();
            switch(option){
                case 0 :    exit=true;
                            break;
                case 1 :
                            break;

            }
        }

    }


    public static void playSong(){

    }
}
