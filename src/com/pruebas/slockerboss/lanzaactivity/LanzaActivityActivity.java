package com.pruebas.slockerboss.lanzaactivity;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LanzaActivityActivity extends Activity {

	private Button botonAboutme, botonCompruebaPass, botonIntentImplicito;
	protected Intent intento;
	private TextView textViewBadPass;
	private EditText editTextPass;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);

		botonAboutme = (Button) findViewById(R.id.BotonLanzarActividad);
		botonAboutme.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(LanzaActivityActivity.this, AboutMe.class);
				startActivity(i);
			}
		});

		botonIntentImplicito = (Button) findViewById(R.id.BotonLanzarActividad2);
		botonIntentImplicito.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://www.slockerboss.nixiweb.com"));
				startActivity(intent);
				
			}
		});
		

		textViewBadPass = (TextView) findViewById(R.id.TextViewBadPass);
		editTextPass = (EditText) findViewById(R.id.EditTextPass);

		botonCompruebaPass = (Button) findViewById(R.id.BotonPass);
		botonCompruebaPass.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (passwordOk()) {
					textViewBadPass.append("Buena PASS\n");
					Intent i = new Intent(LanzaActivityActivity.this,
							Logged.class);
					i.putExtra("Value1", "This value one for ActivityTwo ");
					i.putExtra("Value2", "This value two ActivityTwo");
					startActivity(i);
				} else
					textViewBadPass.append("Mala PASS\n");

			}
		});
	}

	protected boolean passwordOk() {
		String goodPass = "a";
		String pass = editTextPass.getText().toString();
		if (pass.equals(goodPass)) {
			return true;
		} else {
			return false;
		}

	}
}