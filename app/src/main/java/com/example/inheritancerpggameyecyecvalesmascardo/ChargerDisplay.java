package com.example.inheritancerpggameyecyecvalesmascardo;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class ChargerDisplay extends AppCompatActivity {

    ImageView fusileroimage, tercioimage, jineteimage, inquisidorimage;
    ImageView bandidoimage, pistoleroimage, pirataimage, traidorimage,assassinoimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herodisplay);

        fusileroimage=findViewById(R.id.fusileroimage);
        tercioimage=findViewById(R.id.tercioimage);
        jineteimage=findViewById(R.id.jineteimage);
        inquisidorimage=findViewById(R.id.inquisidorimage);
        bandidoimage = findViewById(R.id.bandidoimage);
        pistoleroimage = findViewById(R.id.pistoleroimage);
        pirataimage = findViewById(R.id.pirataimage);
        traidorimage = findViewById(R.id.traidorimage);
        assassinoimage = findViewById(R.id.assassinoimage);

        String hroclassstrng = getIntent().getStringExtra("Charger");
        String tankstrng = getIntent().getStringExtra("Jinete");
        String heroLvl = getIntent().getStringExtra("level");

        TextView callName = findViewById(R.id.heroName);
        TextView callClass = findViewById(R.id.heroClass);
        TextView callID = findViewById(R.id.heroID);
        TextView callLevel = findViewById(R.id.heroLvlnum2);
        callLevel.setText(heroLvl);

        final TextView callHP1 = findViewById(R.id.currhp);
        final TextView callMP1 = findViewById(R.id.currmp);

        final TextView callStr = findViewById(R.id.strength);
        final TextView callAgi = findViewById(R.id.agility);
        final TextView callInt = findViewById(R.id.intelligence);

        final TextView callPhysicalAtk = findViewById(R.id.physAtk);
        final TextView callMagicAtk = findViewById(R.id.mgAtk);
        final TextView callPhysicalDef = findViewById(R.id.physDef2);
        final TextView callMagicDef = findViewById(R.id.mgDef);

        final Hero charger = new Hero("Charger (Jinete)", "Ignacio de Toledo", 20200000, 1);


        if (tankstrng.equals("Jinete")) {
            fusileroimage.setVisibility(View.GONE);
            tercioimage.setVisibility(View.GONE);
            jineteimage.setVisibility(View.VISIBLE);
            inquisidorimage.setVisibility(View.GONE);
            bandidoimage.setVisibility(View.GONE);
            pirataimage.setVisibility(View.GONE);
            pistoleroimage.setVisibility(View.GONE);
            traidorimage.setVisibility(View.GONE);
            assassinoimage.setVisibility(View.GONE);

            callClass.setText(charger.getHeroClass());
            callName.setText(charger.getHeroName());
            callID.setText(String.valueOf(charger.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            charger.setHeroLevel(i);
            callLevel.setText(String.valueOf(charger.getHeroLevel()));

            charger.heroStat(35, 25, 10);
            callStr.setText(String.valueOf((Math.round(charger.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(charger.computeAgility())));
            callInt.setText(String.valueOf(Math.round(charger.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(charger.computeHP())));
            callMP1.setText(String.valueOf(Math.round(charger.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(charger.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(charger.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(charger.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(charger.computeMagicDef())));
        }

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ChargerDisplay.this, MainActivity.class);
        startActivity(intent);
    }
}
