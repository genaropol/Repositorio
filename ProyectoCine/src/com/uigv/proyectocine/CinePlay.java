package com.uigv.proyectocine;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class CinePlay extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_cine_play);
		Toast.makeText(this, "Sistema de ventas Cineplay", Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cine_play, menu);
		return true;
	}
	public void ingresar(View v){
		Intent k=new Intent(this,Menuclase.class);
		startActivity(k);
	}

}
