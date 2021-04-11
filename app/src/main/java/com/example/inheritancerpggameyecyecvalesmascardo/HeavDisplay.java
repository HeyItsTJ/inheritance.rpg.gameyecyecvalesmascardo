package com.example.inheritancerpggameyecyecvalesmascardo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class HeavDisplay extends AppCompatActivity {

    ImageView fusileroimage, tercioimage, jineteimage, inquisidorimage;
    ImageView bandidoimage, pistoleroimage, pirataimage, traidorimage, assassinoimage;

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

        String hroclassstrng = getIntent().getStringExtra("Heavy Infantry");
        String roguestrng = getIntent().getStringExtra("Tercio");
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

        final Hero heavygunner = new Hero("Heavy Gunner (Tercio)", "Fernando de Viscaya", 20200000, 1);


        if(roguestrng.equals("Tercio")) {
            fusileroimage.setVisibility(View.GONE);
            tercioimage.setVisibility(View.VISIBLE);
            jineteimage.setVisibility(View.GONE);
            inquisidorimage.setVisibility(View.GONE);
            bandidoimage.setVisibility(View.GONE);
            pirataimage.setVisibility(View.GONE);
            pistoleroimage.setVisibility(View.GONE);
            traidorimage.setVisibility(View.GONE);
            assassinoimage.setVisibility(View.GONE);

            callClass.setText(heavygunner.getHeroClass());
            callName.setText(heavygunner.getHeroName());
            callID.setText(String.valueOf(heavygunner.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            heavygunner.setHeroLevel(i);
            callLevel.setText(String.valueOf(heavygunner.getHeroLevel()));

            heavygunner.heroStat(30, 20, 10);
            callStr.setText(String.valueOf((Math.round(heavygunner.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(heavygunner.computeAgility())));
            callInt.setText(String.valueOf(Math.round(heavygunner.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(heavygunner.computeHP())));
            callMP1.setText(String.valueOf(Math.round(heavygunner.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(heavygunner.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(heavygunner.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(heavygunner.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(heavygunner.computeMagicDef())));
        }


    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(HeavDisplay.this, MainActivity.class);
        startActivity(intent);
    }
}


