package com.movieProject;

public class MovieCharacter {
	private int chracterId;
	private String chracterName;
	
	public MovieCharacter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieCharacter(int chracterId, String chracterName) {
		super();
		this.chracterId = chracterId;
		this.chracterName = chracterName;
		
	}
	public int getChracterId() {
		return chracterId;
	}
	public void setChracterId(int chracterId) {
		this.chracterId = chracterId;
	}
	public String getChracterName() {
		return chracterName;
	}
	public void setChracterName(String chracterName) {
		this.chracterName = chracterName;
	}
	
	@Override
	public String toString() {
		return "MovieCharacter [chracterId=" + chracterId + ", chracterName=" + chracterName + "]";
	}
	
	

}
