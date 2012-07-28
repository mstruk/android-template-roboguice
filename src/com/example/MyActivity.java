package com.example;

import android.os.Bundle;
import android.widget.TextView;
import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

public class MyActivity extends RoboActivity
{
   @InjectView(R.id.text1)
   TextView textView;

   /**
    * Called when the activity is first created.
    */
   @Override
   public void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
      textView.setText("Hello!");
   }
}
