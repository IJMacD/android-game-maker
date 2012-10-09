package com.ijmacd.agm;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

	final String TAG_SPRITE = "sprite";
	final String TAG_SOUND = "sound";
	final String TAG_BACKGROUND = "background";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void openFile(View view){
    	XMLParser parser = new XMLParser();
    	final String xml = getResources().getString(R.raw.pacman);
    	Document doc = parser.getDomElement(xml); // getting DOM element
    	
    	// Load Sprites
    	NodeList l = doc.getElementsByTagName("sound");
    	int len = l.getLength();
    	for(int i = 0; i < len; i++){
    		Element e = (Element) l.item(i);
    		final String id = e.getAttribute("id");
    		final String resource = e.getAttribute("resource");
    		final boolean transparent = e.getAttribute("transparent").equals("true");
    		final int originLeft = Integer.parseInt(e.getAttribute("originLeft"));
    		final int originTop = Integer.parseInt(e.getAttribute("originTop"));
    		final Vector2 origin = new Vector2(originLeft, originTop);
    		final AGMSprite s = new AGMSprite(id);
    		s.bitmap = loadResource(resource);
    		s.size = getBitmapSize(s.bitmap);
    		s.origin = origin;
    		s.transparent = transparent;
    	}
    	
    	// Load Sounds
    	l = doc.getElementsByTagName("sound");
    	len = l.getLength();
    	for(int i = 0; i < len; i++){
    		Element e = (Element) l.item(i);
    		e
    	}
    }
}
