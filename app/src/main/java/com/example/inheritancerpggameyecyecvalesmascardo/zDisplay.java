package com.example.inheritancerpggameyecyecvalesmascardo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class zDisplay extends AppCompatActivity {

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

        String hroclassstrng = getIntent().getStringExtra("Archer");
        String marksstring = getIntent().getStringExtra("Ranger");
        String marksstring2 = getIntent().getStringExtra("Archer");
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

        final Hero ranger = new Hero("Marksman (Ranger)", "Myrcelle", 20200000, 1);
        final Hero archer = new Hero("Marksman (Archer)", "Myrcelle", 20200000, 1);



        if(marksstring.equals("Tercio")) {
            fusileroimage.setVisibility(View.GONE);
            tercioimage.setVisibility(View.VISIBLE);
            jineteimage.setVisibility(View.GONE);
            inquisidorimage.setVisibility(View.GONE);
            bandidoimage.setVisibility(View.GONE);
            pirataimage.setVisibility(View.GONE);
            pistoleroimage.setVisibility(View.GONE);
            traidorimage.setVisibility(View.GONE);
            assassinoimage.setVisibility(View.GONE);

            callClass.setText(archer.getHeroClass());
            callName.setText(archer.getHeroName());
            callID.setText(String.valueOf(archer.getHeroID()));

            int i = Integer.parseInt(String.valueOf(callLevel.getText()));
            archer.setHeroLevel(i);
            callLevel.setText(String.valueOf(archer.getHeroLevel()));

            archer.heroStat(20, 20, 15);
            callStr.setText(String.valueOf((Math.round(archer.computeStrength()))));
            callAgi.setText(String.valueOf(Math.round(archer.computeAgility())));
            callInt.setText(String.valueOf(Math.round(archer.computeIntelligence())));

            callHP1.setText(String.valueOf(Math.round(archer.computeHP())));
            callMP1.setText(String.valueOf(Math.round(archer.computeMP())));

            callPhysicalAtk.setText(String.valueOf(Math.round(archer.computePhysicalDmg())));
            callMagicAtk.setText(String.valueOf(Math.round(archer.computeMagicDmg())));
            callPhysicalDef.setText(String.valueOf(Math.round(archer.computePhysicalDef())));
            callMagicDef.setText(String.valueOf(Math.round(archer.computeMagicDef())));
        }




    }
    @Override
    public void onBackPressed() {
        finish();
    }
}
