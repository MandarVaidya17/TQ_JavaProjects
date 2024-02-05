package com.containment;

public class Author {
	
	private String authorName;
	private int authorId;
	
	public Author() {
		
	}
	public Author(String authorName,int authorId) {
		this.authorName=authorName;
		this.authorId=authorId;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName=authorName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorId(int authorId) {
		this.authorId=authorId;
	}
	public int getAuthorId() {
		return authorId;
	}
	public String toString() {
		return "Author:"+authorName+" AuthorId:"+authorId;
	}
}
