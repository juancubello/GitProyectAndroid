package com.proyect.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class GitProyectAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        //setContentView(R.layout.main_con_relative);
        //setContentView(R.layout.main_con_estilos);
        setContentView(R.layout.main_con_boton);
    }
    
    public void click(View view){
    	Log.e("CLICK_BOTON", "Esta aplicación se autodestrirá en 5 segundos :) ");
    }
}