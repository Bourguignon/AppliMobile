package com.example.kevin.tp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.example.kevin.tp.R.string.Adresse;
import static com.example.kevin.tp.R.string.Commentaire;
import static com.example.kevin.tp.R.string.Date;
import static com.example.kevin.tp.R.string.Email;
import static com.example.kevin.tp.R.string.M;
import static com.example.kevin.tp.R.string.Nom;
import static com.example.kevin.tp.R.string.Prenom;

public class Authentification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);
    }

    protected void OnClick(View V){

        Intent i = new Intent(Authentification.this,Menu.class);
        RadioButton Civ = (RadioButton) findViewById(R.id.M_);
        EditText nom = (EditText) findViewById(R.id.Nom);
        EditText prenom = (EditText)findViewById(R.id.Prenom);
        EditText date = (EditText)findViewById(R.id.Date) ;
        EditText email = (EditText)findViewById(R.id.Email) ;
        EditText adresse = (EditText)findViewById(R.id.Adresse) ;
        EditText commentaire = (EditText)findViewById(R.id.Commentaire) ;

        if(Civ.isChecked()){
            i.putExtra("Civ","M.");
        }else{
            i.putExtra("Civ","Mme");
        }

        i.putExtra("Nom",nom.getText().toString());
        i.putExtra("Prenom",prenom.getText().toString());
        i.putExtra("Date",date.getText().toString());
        i.putExtra("Email",email.getText().toString());
        i.putExtra("Adresse",adresse.getText().toString());
        i.putExtra("Commentaire",commentaire.getText().toString());

        startActivity(i);
    }
}
