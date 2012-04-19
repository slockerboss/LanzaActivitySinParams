package com.pruebas.slockerboss.lanzaactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AboutMe extends Activity {

	private Button botonFinalizar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.aboutme);
		
		botonFinalizar = (Button) findViewById(R.id.BotonFinalizar);
		botonFinalizar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finalizarActividad(AboutMe.this);
			}
		});
	}

	protected void finalizarActividad(AboutMe aboutMe) {
		this.finish(); 
		
	}
	
	

}
