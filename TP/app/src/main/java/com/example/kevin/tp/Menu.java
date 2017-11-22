package com.example.kevin.tp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent i = getIntent();

        TextView nom = (TextView) findViewById(R.id.textView);
        TextView prenom = (TextView) findViewById(R.id.textView2);
        TextView date = (TextView) findViewById(R.id.textView3);
        TextView email = (TextView) findViewById(R.id.textView4);
        TextView adresse = (TextView) findViewById(R.id.textView5);
        TextView commentaire = (TextView) findViewById(R.id.textView6);
        TextView civ = (TextView) findViewById(R.id.textView7);



        nom.setText(i.getStringExtra("Nom"));
        prenom.setText(i.getStringExtra("Prenom"));
        date.setText(i.getStringExtra("Date"));
        email.setText(i.getStringExtra("Email"));
        adresse.setText(i.getStringExtra("Adresse"));
        commentaire.setText(i.getStringExtra("Commentaire"));
        civ.setText(i.getStringExtra("Civ"));

    }

    protected void Acceuil(View V){

        Intent i = new Intent(Menu.this,MainActivity.class);

        startActivity(i);

    }

    protected void Sport(View V){

        Intent i = new Intent(Menu.this,Sport.class);

        TextView nom = (TextView) findViewById(R.id.textView);
        TextView prenom = (TextView) findViewById(R.id.textView2);

        i.putExtra("Nom",nom.getText().toString());
        i.putExtra("Prenom",prenom.getText().toString());

        startActivity(i);
    }
}
