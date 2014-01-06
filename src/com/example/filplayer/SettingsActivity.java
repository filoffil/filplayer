package com.example.filplayer;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class SettingsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings, menu);
		return true;
	}
	public void tryConnect (View view){
		Toast.makeText(this, "can connect="+(canConnect()?"IP Connection Success!":"IP Connection Failed"), Toast.LENGTH_LONG).show();
	}
	public boolean canConnect(){
		return true;
		/*try {
			HttpURLConnection myServer = new HttpURLConnection(new URL(findViewById(R.id.ipbox).toString())) {
				
				@Override
				public void connect() throws IOException {
					// TODO Auto-generated method stub
					Inputstream in = new BufferedInputStream(in, size)
				}
				
				@Override
				public boolean usingProxy() {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public void disconnect() {
					// TODO Auto-generated method stub
					
				}
			};
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*URL url = null;
		try {
			url = new URL("http://www.android.com/");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   HttpURLConnection urlConnection = null;
		try {
			urlConnection = (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   try {
		     InputStream in = new BufferedInputStream(urlConnection.getInputStream());
		     return true;
		     //readStream(in);
		   } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    finally {
		     urlConnection.disconnect();
		   }
		 
		
		return false;*/
	}
}
