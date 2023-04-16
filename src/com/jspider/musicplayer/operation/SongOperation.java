package com.jspider.musicplayer.operation;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.jspider.musicplayer.entity.Song;

public class SongOperation {
	Scanner scanner=new Scanner(System.in);
	private ArrayList<Song> songList;
	public SongOperation() {
		this.songList=new ArrayList<>();
	}
	
	 public void addSong(Song song) {
	        if (song != null) {
	            songList.add(song);
	            System.out.println("Song added successfully.");
	        } else {
	            System.out.println("Invalid song object.");
	        }
	    }

	 public void removeSong() {
		    System.out.println("Enter index of song to remove:");
		    int index = scanner.nextInt();
		    scanner.nextLine(); // Consume the newline character left over from previous input

		    if (index >= 0 && index < songList.size()) {
		        Song removedSong = songList.remove(index);
		        System.out.println("Song removed: " + removedSong.getTitle());
		    } else {
		        System.out.println("Invalid index.");
		    }
		}
		
	
	public void editSong() {
		playAllSongs();
	}
	
	public ArrayList<Song> getAllSongs() {
		return songList;
		
	}
	public Song getRandomSong() {
		Random random=new Random();
		return songList.get(random.nextInt(songList.size()));
	}
	public void playAllSongs() {
        if (songList.isEmpty()) {
            System.out.println("songlist is empty.");
        } else {
            System.out.println("Playing all songs in the songlist:");
            for (int i = 0; i < songList.size(); i++) {
                Song song = songList.get(i);
                System.out.println("Now playing: " + song.getTitle() + " by " + song.getArtist() + " [" + song.getDuration() + "s]");
            }
        }
    }
	
	  public void playRandomSong() {
	        if (songList.isEmpty()) {
	            System.out.println("songlist is empty.");
	        } else {
	            Random random = new Random();
	            int index = random.nextInt(songList.size());
	            Song song = songList.get(index);
	            System.out.println("Now playing: " + song.getTitle() + " by " + song.getArtist() + " [" + song.getDuration() + "s]");
	        }
	    }
	public void chooseToPlaySong(int choice) {
        if (choice < 1 || choice > songList.size()) {
            System.out.println("Invalid song choice.");
        } else {
            Song song = songList.get(choice - 1);
            System.out.println("Now playing: " + song.getTitle() + " by " + song.getArtist() + " [" + song.getDuration() + "s]");
        }
    }
	 public void showAllSongs() {
	        if (songList.isEmpty()) {
	            System.out.println("SongList is empty.");
	        } else {
	            System.out.println("SongList:");
	            for (int i = 0; i < songList.size(); i++) {
	                Song song = songList.get(i);
	                System.out.println((i + 1) + ". " + song.getTitle() + " by " + song.getArtist() + " [" + song.getDuration() + "s]");
	            }
	        }
	    }

public void editSong(int index) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter new title:");
    String newTitle = scanner.nextLine();
    System.out.println("Enter new artist name:");
    String newArtist = scanner.nextLine();
    System.out.println("Enter new song duration:");
    Double newDuration = scanner.nextDouble();
    scanner.nextLine();

    Song song = songList.get(index);
    song.setTitle(newTitle);
    song.setArtist(newArtist);
    song.setDuration(newDuration);

    System.out.println("Song details updated successfully!");
}
}

	
	


