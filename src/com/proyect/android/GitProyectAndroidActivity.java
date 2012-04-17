package com.proyect.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GitProyectAndroidActivity extends Activity {
	
	TextView texto;
	LinearLayout layout;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        //setContentView(R.layout.main_con_relative);
        //setContentView(R.layout.main_con_estilos);
        setContentView(R.layout.main_con_boton);
        texto = (TextView)findViewById(R.id.etiqueta);
        layout = (LinearLayout)findViewById(R.id.layoutprincipal);
    }
    
    public void click(View view){
    	Log.e("CLICK_BOTON", "Esta aplicaci—n se autodestrir‡ en 5 segundos :) ");
    	texto.setText("Esta aplicaci—n se autodestrir‡...");
    	layout.setBackgroundColor(getResources().getColor(R.color.rojo));
    	
    }
    
}