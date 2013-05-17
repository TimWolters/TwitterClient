package main;


import java.util.ArrayList;

import model.Tweet;
import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TweetAdapter extends ArrayAdapter<Tweet> {

	private LayoutInflater tweetInflater;
	private TextView tweetUsername;
	private TextView tweetMessage;
	private TextView tweetMessageDate;
	private ImageView tweetUserImg;
	
	private ArrayList<Tweet> tweets;
	
	public TweetAdapter(Context context, int textViewResourceId, ArrayList<Tweet> tweets){
		super(context, textViewResourceId);
		
		tweetInflater = LayoutInflater.from(context);
		this.tweets = tweets;
	}

	public View getView(int p, View v, ViewGroup parent){
		if(v == null){
			if (v == null){
				v = tweetInflater.inflate(R.layout.twitter_listview_item, null);
			}
			Tweet tweet = tweets.get(p);

			if (tweet != null){

				tweetUsername = (TextView) v.findViewById(R.id.user_name_textview);
				tweetMessage = (TextView) v.findViewById(R.id.user_message_textview);
				tweetMessageDate = (TextView) v.findViewById(R.id.user_date_textview);
				tweetUserImg = (ImageView) v.findViewById(R.id.user_profile_img);

				tweetUsername.setText(tweet.getUsername());
				tweetMessageDate.setText(tweet.getDate());
				tweetMessage.setText(tweet.getMessage());
				
				/** TO-DO User image
				
				tweetUserImg.setImageDrawable(drawable);
				
				*/
				
				
				

	
			}
		

		}
		return v;

	}
}
