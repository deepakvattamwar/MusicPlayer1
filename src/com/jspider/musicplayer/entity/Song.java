package com.jspider.musicplayer.entity;

public class Song {
	private String title;
	private String artist;
//	private String album;
	private Double duration;
	
	public  Song(String title,String artist, Double duration) {
		this.title=title;
		this.artist=artist;
//		this.album=album;
		this.duration=duration;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist=artist;
	}
	
//	public String getAlbum() {
////		return album;
//	}
	public void setAlbum(String album) {
//		this.album=album;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration=duration;
	}

}
