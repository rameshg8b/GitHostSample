package com.example.githostsample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	// Test comment 2
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public void test()
    {
    int x;
    }
    
    public void add()
    {
    int y;
    }
    
}
