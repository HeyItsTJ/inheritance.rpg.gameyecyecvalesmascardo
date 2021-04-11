package com.example.inheritancerpggameyecyecvalesmascardo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


public class MonsterDisplay extends AppCompatActivity {

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

        ConstraintLayout background = (ConstraintLayout) findViewById(R.id.layout);
        background.setBackgroundResource(R.drawable.background);

        String monclassstrng = getIntent().getStringExtra("Outlaw");

        TextView callName = findViewById(R.id.heroName);
        TextView callClass = findViewById(R.id.heroClass);
        TextView callID = findViewById(R.id.heroID);
        TextView callLevel = findViewById(R.id.heroLvlnum2);

        final TextView callHP1 = findViewById(R.id.currhp);
        final TextView callMP1 = findViewById(R.id.currmp);

        final TextView callStr = findViewById(R.id.strength);
        final TextView callAgi = findViewById(R.id.agility);
        final TextView callInt = findViewById(R.id.intelligence);

        final TextView callPhysicalAtk = findViewById(R.id.physAtk);
        final TextView callMagicAtk = findViewById(R.id.mgAtk);
        final TextView callPhysicalDef = findViewById(R.id.physDef2);
        final TextView callMagicDef = findViewById(R.id.mgDef);

        final Monsters bandido = new Monsters("Bandido","Julio Cruz",20200000,10);
        final Monsters pirata = new Monsters("Pirata","Pedro Mariano",20200000,20);
        final Monsters pistolero = new Monsters("Pistolero","Ramon Valladolid",20200000,35);
        final Monsters traidor = new Monsters("Traidor", "Poncho Pilato",20200000,50);
        final Monsters assassino = new Monsters("Assassino","El Sombra",20200000,70);

        if(monclassstrng.equals("Bandido")) {
            fusileroimage.setVisibility(View.GONE);
            tercioimage.setVisibility(View.GONE);
            jineteimage.setVisibility(View.GONE);
            inquisidorimage.setVisibility(View.GONE);
            bandidoimage.setVisibility(View.VISIBLE);
            pirataimage.setVisibility(View.GONE);
            pistoleroimage.setVisibility(View.GONE);
            traidorimage.setVisibility(View.GONE);
            assassinoimage.setVisibility(View.GONE);

            callClass.setText(bandido.getMonClass());
            callName.setText(bandido.getMonName());
            callID.setText(String.valueOf(bandido.getMonID()));
            callLevel.setText(String.valueOf(bandido.getMonLevel()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            bandido.setMonLevel(i);
            callLevel.setText(String.valueOf(bandido.getMonLevel()));

            bandido.monStat(20, 40, 10);
            callStr.setText(String.valueOf((Math.round(bandido.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(bandido.computeAgility())));
            callInt.setText(String.valueOf(Math.round(bandido.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(bandido.computeHP())));
            callMP1.setText(String.valueOf(Math.round(bandido.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(bandido.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(bandido.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(bandido.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(bandido.computeMagicDef())));
        }

        else if(monclassstrng.equals("Pirata")) {
            fusileroimage.setVisibility(View.GONE);
            tercioimage.setVisibility(View.GONE);
            jineteimage.setVisibility(View.GONE);
            inquisidorimage.setVisibility(View.GONE);
            bandidoimage.setVisibility(View.GONE);
            pirataimage.setVisibility(View.VISIBLE);
            pistoleroimage.setVisibility(View.GONE);
            traidorimage.setVisibility(View.GONE);
            assassinoimage.setVisibility(View.GONE);


            callClass.setText(pirata.getMonClass());
            callName.setText(pirata.getMonName());
            callID.setText(String.valueOf(pirata.getMonID()));
            callLevel.setText(String.valueOf(pirata.getMonLevel()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            pirata.setMonLevel(i);
            callLevel.setText(String.valueOf(pirata.getMonLevel()));

            pirata.monStat(35, 20, 15);
            callStr.setText(String.valueOf((Math.round(pirata.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(pirata.computeAgility())));
            callInt.setText(String.valueOf(Math.round(pirata.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(pirata.computeHP())));
            callMP1.setText(String.valueOf(Math.round(pirata.computeMP())));
            callPhysicalAtk.setText(String.valueOf(Math.round(pirata.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(pirata.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(pirata.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(pirata.computeMagicDef())));
        }
        else if(monclassstrng.equals("Pistolero")) {
            fusileroimage.setVisibility(View.GONE);
            tercioimage.setVisibility(View.GONE);
            jineteimage.setVisibility(View.GONE);
            inquisidorimage.setVisibility(View.GONE);
            bandidoimage.setVisibility(View.GONE);
            pirataimage.setVisibility(View.GONE);
            pistoleroimage.setVisibility(View.VISIBLE);
            traidorimage.setVisibility(View.GONE);
            assassinoimage.setVisibility(View.GONE);

            callClass.setText(pistolero.getMonClass());
            callName.setText(pistolero.getMonName());
            callID.setText(String.valueOf(pistolero.getMonID()));
            callLevel.setText(String.valueOf(pistolero.getMonLevel()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            pistolero.setMonLevel(i);
            callLevel.setText(String.valueOf(pistolero.getMonLevel()));

            pistolero.monStat(25, 25, 20);
            callStr.setText(String.valueOf((Math.round(pistolero.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(pistolero.computeAgility())));
            callInt.setText(String.valueOf(Math.round(pistolero.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(pistolero.computeHP())));
            callMP1.setText(String.valueOf(Math.round(pistolero.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(pistolero.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(pistolero.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(pistolero.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(pistolero.computeMagicDef())));
        }

        else if(monclassstrng.equals("Traidor")) {
            fusileroimage.setVisibility(View.GONE);
            tercioimage.setVisibility(View.GONE);
            jineteimage.setVisibility(View.GONE);
            inquisidorimage.setVisibility(View.GONE);
            bandidoimage.setVisibility(View.GONE);
            pirataimage.setVisibility(View.GONE);
            pistoleroimage.setVisibility(View.GONE);
            traidorimage.setVisibility(View.VISIBLE);
            assassinoimage.setVisibility(View.GONE);

            callClass.setText(traidor.getMonClass());
            callName.setText(traidor.getMonName());
            callID.setText(String.valueOf(traidor.getMonID()));
            callLevel.setText(String.valueOf(traidor.getMonLevel()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            traidor.setMonLevel(i);
            callLevel.setText(String.valueOf(traidor.getMonLevel()));

            traidor.monStat(30, 20, 40);
            callStr.setText(String.valueOf((Math.round(traidor.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(traidor.computeAgility())));
            callInt.setText(String.valueOf(Math.round(traidor.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(traidor.computeHP())));
            callMP1.setText(String.valueOf(Math.round(traidor.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(traidor.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(traidor.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(traidor.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(traidor.computeMagicDef())));
        }

        else if(monclassstrng.equals("Assassino")) {
            fusileroimage.setVisibility(View.GONE);
            tercioimage.setVisibility(View.GONE);
            jineteimage.setVisibility(View.GONE);
            inquisidorimage.setVisibility(View.GONE);
            bandidoimage.setVisibility(View.GONE);
            pirataimage.setVisibility(View.GONE);
            pistoleroimage.setVisibility(View.GONE);
            traidorimage.setVisibility(View.GONE);
            assassinoimage.setVisibility(View.VISIBLE);

            callClass.setText(assassino.getMonClass());
            callName.setText(assassino.getMonName());
            callID.setText(String.valueOf(assassino.getMonID()));
            callLevel.setText(String.valueOf(assassino.getMonLevel()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            assassino.setMonLevel(i);
            callLevel.setText(String.valueOf(assassino.getMonLevel()));

            assassino.monStat(20, 45, 30);
            callStr.setText(String.valueOf((Math.round(assassino.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(assassino.computeAgility())));
            callInt.setText(String.valueOf(Math.round(assassino.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(assassino.computeHP())));
            callMP1.setText(String.valueOf(Math.round(assassino.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(assassino.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(assassino.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(assassino.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(assassino.computeMagicDef())));
        }
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MonsterDisplay.this, MainActivity.class);
        startActivity(intent);
    }
}
