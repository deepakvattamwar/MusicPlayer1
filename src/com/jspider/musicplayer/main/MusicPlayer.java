package com.jspider.musicplayer.main;

//import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.musicplayer.entity.Song;
import com.jspider.musicplayer.operation.SongOperation;

public class MusicPlayer {
	
	Scanner scanner=new Scanner(System.in);
	private int choice,choice1,choice2,choice3,choice4;
	private static SongOperation songOperation;
	
	
	
	public MusicPlayer() {
		songOperation=new SongOperation();
	}

	
	
	public static void main(String[] args) {
		MusicPlayer musicPlayer=new MusicPlayer();
		musicPlayer.musicplayerMenu();
//		songOperation=new SongOperation();
	}
	
	public void musicplayerMenu() {
				
		while(true) {
			System.out.println("======Music Player=======\n");
			System.out.println("1 . Play Song");
			System.out.println("2 . Add/Remove Song");
			System.out.println("3. Edit Song");
			System.out.println("4. Exit");
			
			System.out.println("Enter your Choice: ");
			 choice=scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("1 . Play  All Song");
				System.out.println("2 . Play Random Song");
				System.out.println("3.  Choose to play Song");
				System.out.println("4.  Go Back");
				
				System.out.println("Select a option");
				 choice1=scanner.nextInt();
					switch(choice1) {
					case 1:
						songOperation.playAllSongs();
					
					break;
					case 2:
						songOperation.playRandomSong();
					break;
					case 3:
						songOperation. chooseToPlaySong(1);
					break;
					case 4:
						musicplayerMenu();
					break;
					
					default:
						System.out.println("Invalid input try agian");
						musicplayerMenu();
					}
				
				break;
				
			case 2:
				System.out.println("1 . Add Song");
				System.out.println("2 . Remove Song");
				System.out.println("4.  Go Back");
				
				System.out.println("Select a option");
					choice2=scanner.nextInt();
					scanner.nextLine();
					switch(choice2) {
					case 1:
						 System.out.println("Enter song title:");
                         String title = scanner.nextLine();
                         System.out.println("Enter artist name:");
                         String artist = scanner.nextLine();
                         System.out.println("Enter song duration:");
                         double duration = scanner.nextDouble();

                         Song song = new Song(title, artist, duration);
                         songOperation.addSong(song);
					
					break;
					case 2:
						songOperation.removeSong();
					
					break;
					case 3:
						musicplayerMenu();
					break;
					case 4:
						System.out.println("Invalid input pls try again");
						musicplayerMenu();
					}
				
				break;
			case 3:
				System.out.println("1. Select Song to edit");
				
				System.out.println("Select a option");
				 choice3=scanner.nextInt();
				
				switch (choice3) {
				case 1:
					songOperation.showAllSongs();
					System.out.println("Selct a song number");
					choice4=scanner.nextInt();
						switch(choice4) {
						case 1:
							songOperation.editSong(choice2);
						}
					
					break;

				default:
					System.out.println("Invalid input pls try again");
					musicplayerMenu();
					break;
				}
				
				break;
			case 4:
				System.out.println("Thank you");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid input pls try agian");
				musicplayerMenu();
				break;
			}
		}
		
	}
}
