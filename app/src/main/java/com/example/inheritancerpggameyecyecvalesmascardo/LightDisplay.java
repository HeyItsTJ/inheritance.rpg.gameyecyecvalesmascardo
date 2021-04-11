package com.example.inheritancerpggameyecyecvalesmascardo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class LightDisplay extends AppCompatActivity {

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

        String hroclassstrng = getIntent().getStringExtra("Mage");
        String magestrng = getIntent().getStringExtra("Fusilero");
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

        final Hero lightgunner = new Hero("Light Gunner (Fusilero)", "Leonardo Gomez", 20200000, 1);

        if(magestrng.equals("Fusilero")) {
            fusileroimage.setVisibility(View.VISIBLE);
            tercioimage.setVisibility(View.GONE);
            jineteimage.setVisibility(View.GONE);
            inquisidorimage.setVisibility(View.GONE);
            bandidoimage.setVisibility(View.GONE);
            pirataimage.setVisibility(View.GONE);
            pistoleroimage.setVisibility(View.GONE);
            traidorimage.setVisibility(View.GONE);
            assassinoimage.setVisibility(View.GONE);

            callClass.setText(lightgunner.getHeroClass());
            callName.setText(lightgunner.getHeroName());
            callID.setText(String.valueOf(lightgunner.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            lightgunner.setHeroLevel(i);
            callLevel.setText(String.valueOf(lightgunner.getHeroLevel()));

            lightgunner.heroStat(20, 30, 10);
            callStr.setText(String.valueOf((Math.round(lightgunner.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(lightgunner.computeAgility())));
            callInt.setText(String.valueOf(Math.round(lightgunner.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(lightgunner.computeHP())));
            callMP1.setText(String.valueOf(Math.round(lightgunner.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(lightgunner.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(lightgunner.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(lightgunner.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(lightgunner.computeMagicDef())));
        }

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(LightDisplay.this, MainActivity.class);
        startActivity(intent);
    }
}

