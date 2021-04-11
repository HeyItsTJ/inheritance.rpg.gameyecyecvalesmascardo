package com.example.inheritancerpggameyecyecvalesmascardo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SupportDisplay extends AppCompatActivity {

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

        String hroclassstrng = getIntent().getStringExtra("Support");
        String supportstrng = getIntent().getStringExtra("Inquisidor");
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

        final Hero support = new Hero("Support (Inquisidor)", "Apolinario de Galicia", 20200000, 1);

        if(supportstrng.equals("Inquisidor")) {
            fusileroimage.setVisibility(View.GONE);
            tercioimage.setVisibility(View.GONE);
            jineteimage.setVisibility(View.GONE);
            inquisidorimage.setVisibility(View.VISIBLE);
            bandidoimage.setVisibility(View.GONE);
            pirataimage.setVisibility(View.GONE);
            pistoleroimage.setVisibility(View.GONE);
            traidorimage.setVisibility(View.GONE);
            assassinoimage.setVisibility(View.GONE);

            callClass.setText(support.getHeroClass());
            callName.setText(support.getHeroName());
            callID.setText(String.valueOf(support.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            support.setHeroLevel(i);
            callLevel.setText(String.valueOf(support.getHeroLevel()));

            support.heroStat(10, 20, 35);
            callStr.setText(String.valueOf((Math.round(support.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(support.computeAgility())));
            callInt.setText(String.valueOf(Math.round(support.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(support.computeHP())));
            callMP1.setText(String.valueOf(Math.round(support.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(support.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(support.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(support.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(support.computeMagicDef())));
        }

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SupportDisplay.this, MainActivity.class);
        startActivity(intent);
    }
}
