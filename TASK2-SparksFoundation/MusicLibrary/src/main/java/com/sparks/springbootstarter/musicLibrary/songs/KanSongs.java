package com.sparks.springbootstarter.musicLibrary.songs;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KanSongs {

	@Id
	private String id;
	private String movie;
	private String singer;
	
	
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
public KanSongs() {
		
	}
	
	public KanSongs(String id, String movie, String singer) {
		super();
		this.id = id;
		this.movie = movie;
		this.singer = singer;
	}
}
