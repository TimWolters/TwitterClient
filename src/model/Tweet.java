package model;

import org.json.JSONObject;

public class Tweet {
	private String username;
	private String message;
	private String date;
	private String imgUrl;

	
	/**
	 *  Constructor
	 */
	
	public Tweet(JSONObject jTweet){
		
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	
	
}
