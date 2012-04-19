package com.pruebas.slockerboss.lanzaactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Logged extends Activity {
	Intent i;
	String s;
	TextView tv;
	private Button botonFinalizar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.logged);

		tv = (TextView) findViewById(R.id.TextViewPrueba);

		botonFinalizar = (Button) findViewById(R.id.BotonFinalizar);
		botonFinalizar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finalizarActividad(Logged.this);

			}
		});
	}

	protected void finalizarActividad(Logged logged) {
		this.finish();

	}

}
