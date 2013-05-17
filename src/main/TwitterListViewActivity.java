package main;

import java.util.ArrayList;

import model.Tweet;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class TwitterListViewActivity extends Activity {
	private ListView twitterListView;
	private TweetAdapter tweetAdapter;
	private ArrayList <Tweet> tweets;
	private Context context;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter_listview);
        twitterListView = (ListView) this.findViewById(R.id.twitter_listview);
    
    
    
    
        tweetAdapter = new TweetAdapter(this, R.layout.twitter_listview_item, tweets);
		twitterListView.setAdapter(tweetAdapter);
    
    
    
    
        twitterListView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

			}
		});
    
    
    
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_twitter_list_view, menu);
        return true;
    }
    
    private void loadTweets(String requestUrl){
    		
            
           
    	 
    }
    
    
    
}
