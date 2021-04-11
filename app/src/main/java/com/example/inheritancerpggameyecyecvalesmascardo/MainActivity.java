package com.example.inheritancerpggameyecyecvalesmascardo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;

    Spinner heavyGunnerspnr,lightGunnerspnr,chargerspnr,supportspnr;
    Spinner HeroClass, MonsterClass;
    String  heavyGunnerstrng, lightGunnerstrng,chargerstrng, supportstrng;
    String  hroclassstrng, monclassstrng;

    ImageView fusileroimage, tercioimage, jineteimage, inquisidorimage;
    ImageView bandidoimage, pistoleroimage, pirataimage, traidorimage, assassinoimage;
    Button button, button2, herobtn, monsterbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText heroLvl = findViewById(R.id.inputlvl);
        button=findViewById(R.id.button);
        herobtn=findViewById(R.id.herobtn);
        button2=findViewById(R.id.button);
        monsterbtn=findViewById(R.id.monsterbtn);

        lightGunnerspnr=findViewById(R.id.magesubclass);
        chargerspnr=findViewById(R.id.roguesubclass);
        supportspnr=findViewById(R.id.supportsubclass);
        heavyGunnerspnr=findViewById(R.id.tanksubclass);
        HeroClass=findViewById(R.id.heroClass);
        MonsterClass=findViewById(R.id.Monsterclass);

        fusileroimage=findViewById(R.id.fusileroimage);
        tercioimage=findViewById(R.id.tercioimage);
        jineteimage=findViewById(R.id.jineteimage);
        inquisidorimage=findViewById(R.id.inquisidorimage);
        bandidoimage = findViewById(R.id.bandidoimage);
        pistoleroimage = findViewById(R.id.pistoleroimage);
        pirataimage = findViewById(R.id.pirataimage);
        traidorimage = findViewById(R.id.traidorimage);
        assassinoimage = findViewById(R.id.assassinoimage);


        fusileroimage.setVisibility(View.GONE);
        tercioimage.setVisibility(View.GONE);
        jineteimage.setVisibility(View.GONE);
        inquisidorimage.setVisibility(View.GONE);
        bandidoimage.setVisibility(View.GONE);
        pirataimage.setVisibility(View.GONE);
        pistoleroimage.setVisibility(View.GONE);
        traidorimage.setVisibility(View.GONE);
        assassinoimage.setVisibility(View.GONE);

        HeroClass.setVisibility(View.GONE);
        MonsterClass.setVisibility(View.GONE);
        heavyGunnerspnr.setVisibility(View.GONE);
        supportspnr.setVisibility(View.GONE);
        lightGunnerspnr.setVisibility(View.GONE);
        chargerspnr.setVisibility(View.GONE);
        button.setVisibility(View.GONE);
        button2.setVisibility(View.GONE);
        heroLvl.setVisibility(View.GONE);

        herobtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        herobtn.setVisibility(View.GONE);
                        monsterbtn.setVisibility(View.GONE);
                        HeroClass.setVisibility(View.VISIBLE);
                        heavyGunnerspnr.setVisibility(View.VISIBLE);
                        supportspnr.setVisibility(View.VISIBLE);
                        lightGunnerspnr.setVisibility(View.VISIBLE);
                        chargerspnr.setVisibility(View.VISIBLE);
                    }
                }
        );

        monsterbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConstraintLayout background = (ConstraintLayout) findViewById(R.id.layout);
                        background.setBackgroundResource(R.drawable.background);
                        herobtn.setVisibility(View.GONE);
                        monsterbtn.setVisibility(View.GONE);
                        MonsterClass.setVisibility(View.VISIBLE);
                        heavyGunnerspnr.setVisibility(View.GONE);
                        supportspnr.setVisibility(View.GONE);
                        lightGunnerspnr.setVisibility(View.GONE);
                        chargerspnr.setVisibility(View.GONE);
                        button2.setVisibility(View.VISIBLE);
                        heroLvl.setVisibility(View.GONE);
                        bandidoimage.setVisibility(View.GONE);
                        pirataimage.setVisibility(View.GONE);
                        pistoleroimage.setVisibility(View.GONE);
                        traidorimage.setVisibility(View.GONE);
                        assassinoimage.setVisibility(View.GONE);
                    }
                }
        );

        HeroClass.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        TextView hint = (TextView) view;
                        hroclassstrng=HeroClass.getSelectedItem().toString();

                        if(position == 0){
                            hint.setTextColor(Color.parseColor("#4e463f"));
                            ((TextView) parent.getChildAt(0)).setTextSize(18);
                            heavyGunnerspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            lightGunnerspnr.setVisibility(View.GONE);
                            chargerspnr.setVisibility(View.VISIBLE);
                        }
                        else if (hroclassstrng.equals("Heavy Gunner")) {
                            lightGunnerspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            heavyGunnerspnr.setVisibility(View.VISIBLE);
                            chargerspnr.setVisibility(View.GONE);
                            fusileroimage.setVisibility(View.GONE);
                            tercioimage.setVisibility(View.VISIBLE);
                            jineteimage.setVisibility(View.GONE);
                            inquisidorimage.setVisibility(View.GONE);
                            button.setVisibility(View.VISIBLE);
                            heroLvl.setVisibility(View.VISIBLE);
                        }
                        else if (hroclassstrng.equals("Light Gunner")) {
                            lightGunnerspnr.setVisibility(View.VISIBLE);
                            supportspnr.setVisibility(View.GONE);
                            heavyGunnerspnr.setVisibility(View.GONE);
                            chargerspnr.setVisibility(View.GONE);
                            fusileroimage.setVisibility(View.VISIBLE);
                            tercioimage.setVisibility(View.GONE);
                            jineteimage.setVisibility(View.GONE);
                            inquisidorimage.setVisibility(View.GONE);
                            button.setVisibility(View.VISIBLE);
                            heroLvl.setVisibility(View.VISIBLE);
                        }
                        else if (hroclassstrng.equals("Charger")) {
                            lightGunnerspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.GONE);
                            heavyGunnerspnr.setVisibility(View.GONE);
                            chargerspnr.setVisibility(View.VISIBLE);
                            fusileroimage.setVisibility(View.GONE);
                            tercioimage.setVisibility(View.GONE);
                            jineteimage.setVisibility(View.VISIBLE);
                            inquisidorimage.setVisibility(View.GONE);
                            button.setVisibility(View.VISIBLE);
                            heroLvl.setVisibility(View.VISIBLE);
                        }
                        else if (hroclassstrng.equals("Support")) {
                            heavyGunnerspnr.setVisibility(View.GONE);
                            supportspnr.setVisibility(View.VISIBLE);
                            lightGunnerspnr.setVisibility(View.GONE);
                            chargerspnr.setVisibility(View.GONE);
                            fusileroimage.setVisibility(View.GONE);
                            tercioimage.setVisibility(View.GONE);
                            jineteimage.setVisibility(View.GONE);
                            inquisidorimage.setVisibility(View.VISIBLE);
                            button.setVisibility(View.VISIBLE);
                            heroLvl.setVisibility(View.VISIBLE);
                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );
        heavyGunnerspnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        heavyGunnerstrng=heavyGunnerspnr.getSelectedItem().toString();
                        TextView hint = (TextView) view;
                        if(position == 0) {
                            hint.setTextColor(Color.parseColor("#4e463f"));
                            ((TextView) parent.getChildAt(0)).setTextSize(18);
                        }
                        else if (heavyGunnerstrng.equals("Tercio")) {
                            fusileroimage.setVisibility(View.GONE);
                            tercioimage.setVisibility(View.VISIBLE);
                            jineteimage.setVisibility(View.GONE);
                            inquisidorimage.setVisibility(View.GONE);

                        }

                        button.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        int index = heavyGunnerspnr.getSelectedItemPosition();
                                        if((index==0 || heroLvl.getText().toString()==null || heroLvl.getText().toString().trim().equals(""))) {
                                            Toast.makeText(MainActivity.this,
                                                    "Please input all fields.",
                                                    Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            Intent i = new Intent(MainActivity.this, ChargerDisplay.class);
                                            i.putExtra("Tercio", heavyGunnerstrng);
                                            i.putExtra("level", heroLvl.getText().toString());
                                            startActivity(i);
                                        }
                                    }
                                }
                        );
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );


        lightGunnerspnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        lightGunnerstrng=lightGunnerspnr.getSelectedItem().toString();
                        TextView hint = (TextView) view;
                        if(position == 0) {
                            hint.setTextColor(Color.parseColor("#4e463f"));
                            ((TextView) parent.getChildAt(0)).setTextSize(18);
                        }
                        else if (lightGunnerspnr.equals("Fusiliero")) {
                            fusileroimage.setVisibility(View.VISIBLE);
                            tercioimage.setVisibility(View.GONE);
                            jineteimage.setVisibility(View.GONE);
                            inquisidorimage.setVisibility(View.GONE);
                        }

                        button.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        int index = lightGunnerspnr.getSelectedItemPosition();
                                        if((index==0 || heroLvl.getText().toString()==null || heroLvl.getText().toString().trim().equals(""))) {
                                            Toast.makeText(MainActivity.this,
                                                    "Please input all fields.",
                                                    Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            Intent i = new Intent(MainActivity.this, zDisplay.class);
                                            i.putExtra("Marksman", hroclassstrng);
                                            i.putExtra("Fusilero", lightGunnerstrng );
                                            i.putExtra("level", heroLvl.getText().toString());
                                            startActivity(i);
                                        }
                                    }
                                }
                        );

                    }


                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );
        chargerspnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        chargerstrng=chargerspnr.getSelectedItem().toString();
                        TextView hint = (TextView) view;
                        if(position == 0) {
                            hint.setTextColor(Color.parseColor("#4e463f"));
                            ((TextView) parent.getChildAt(0)).setTextSize(18);
                        }
                        else if (chargerstrng.equals("Jinete")) {
                            fusileroimage.setVisibility(View.GONE);
                            tercioimage.setVisibility(View.GONE);
                            jineteimage.setVisibility(View.VISIBLE);
                            inquisidorimage.setVisibility(View.GONE);
                        }

                        button.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        int index = chargerspnr.getSelectedItemPosition();
                                        if((index==0 || heroLvl.getText().toString()==null || heroLvl.getText().toString().trim().equals(""))) {
                                            Toast.makeText(MainActivity.this,
                                                    "Please input all fields.",
                                                    Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            Intent i = new Intent(MainActivity.this, LightDisplay.class);
                                            i.putExtra("Charger", hroclassstrng);
                                            i.putExtra("Jinete", chargerstrng);
                                            i.putExtra("level", heroLvl.getText().toString());
                                            startActivity(i);
                                        }
                                    }
                                }
                        );
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );
        supportspnr.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        supportstrng=supportspnr.getSelectedItem().toString();
                        TextView hint = (TextView) view;
                        if(position == 0) {
                            hint.setTextColor(Color.parseColor("#4e463f"));
                            ((TextView) parent.getChildAt(0)).setTextSize(18);
                        }

                        else if (supportstrng.equals("Inquisidor")) {
                            fusileroimage.setVisibility(View.GONE);
                            tercioimage.setVisibility(View.GONE);
                            jineteimage.setVisibility(View.GONE);
                            inquisidorimage.setVisibility(View.VISIBLE);
                        }

                        button.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        int index = supportspnr.getSelectedItemPosition();
                                        if((index==0 || heroLvl.getText().toString()==null || heroLvl.getText().toString().trim().equals(""))) {
                                            Toast.makeText(MainActivity.this,
                                                    "Please input all fields.",
                                                    Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            Intent i = new Intent(MainActivity.this, HeavDisplay.class);
                                            i.putExtra("Rogue", hroclassstrng);
                                            i.putExtra("Inquisidor", supportstrng);
                                            i.putExtra("level", heroLvl.getText().toString());
                                            startActivity(i);
                                        }
                                    }
                                }
                        );
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );

        MonsterClass.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        monclassstrng=MonsterClass.getSelectedItem().toString();
                        TextView hint = (TextView) view;
                        if(position == 0) {
                            hint.setTextColor(Color.parseColor("#4e463f"));
                            ((TextView) parent.getChildAt(0)).setTextSize(18);
                        }

                        else if  (monclassstrng.equals("Bandido")){
                            bandidoimage.setVisibility(View.VISIBLE);
                            pirataimage.setVisibility(View.GONE);
                            pistoleroimage.setVisibility(View.GONE);
                            traidorimage.setVisibility(View.GONE);
                            assassinoimage.setVisibility(View.GONE);
                        }
                        else if (monclassstrng.equals("Pirata")){
                            bandidoimage.setVisibility(View.GONE);
                            pirataimage.setVisibility(View.VISIBLE);
                            pistoleroimage.setVisibility(View.GONE);
                            traidorimage.setVisibility(View.GONE);
                            assassinoimage.setVisibility(View.GONE);
                        }
                        else if (monclassstrng.equals("Pistolero")){
                            bandidoimage.setVisibility(View.GONE);
                            pirataimage.setVisibility(View.GONE);
                            pistoleroimage.setVisibility(View.VISIBLE);
                            traidorimage.setVisibility(View.GONE);
                            assassinoimage.setVisibility(View.GONE);
                        }
                        else if (monclassstrng.equals("Traidor")){
                            bandidoimage.setVisibility(View.GONE);
                            pirataimage.setVisibility(View.GONE);
                            pistoleroimage.setVisibility(View.GONE);
                            traidorimage.setVisibility(View.VISIBLE);
                            assassinoimage.setVisibility(View.GONE);
                        }
                        else if (monclassstrng.equals("Assassino")){
                            bandidoimage.setVisibility(View.GONE);
                            pirataimage.setVisibility(View.GONE);
                            pistoleroimage.setVisibility(View.GONE);
                            traidorimage.setVisibility(View.GONE);
                            assassinoimage.setVisibility(View.VISIBLE);
                        }
                        else {
                        }

                        button2.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        int index = MonsterClass.getSelectedItemPosition();
                                        if((index==0)) {
                                            Toast.makeText(MainActivity.this,
                                                    "Please input all fields.",
                                                    Toast.LENGTH_LONG).show();
                                        }
                                        else {
                                            Intent intent = new Intent(MainActivity.this, MonsterDisplay.class);
                                            intent.putExtra("Outlaw",monclassstrng);
                                            startActivity(intent);
                                        }
                                    }
                                }
                        );
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                }
        );
    }
    @Override
    public void onBackPressed() {
        herobtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        herobtn.setVisibility(View.GONE);
                        monsterbtn.setVisibility(View.GONE);
                        HeroClass.setVisibility(View.VISIBLE);
                        heavyGunnerspnr.setVisibility(View.VISIBLE);
                        supportspnr.setVisibility(View.VISIBLE);
                        heavyGunnerspnr.setVisibility(View.VISIBLE);
                        chargerspnr.setVisibility(View.VISIBLE);
                        supportspnr.setVisibility(View.VISIBLE);
                    }
                }
        );

        monsterbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ConstraintLayout background = (ConstraintLayout) findViewById(R.id.layout);
                        background.setBackgroundResource(R.drawable.background);
                        herobtn.setVisibility(View.GONE);
                        monsterbtn.setVisibility(View.GONE);
                        MonsterClass.setVisibility(View.VISIBLE);
                        heavyGunnerspnr.setVisibility(View.GONE);
                        supportspnr.setVisibility(View.GONE);
                        lightGunnerspnr.setVisibility(View.GONE);
                        chargerspnr.setVisibility(View.GONE);
                        supportspnr.setVisibility(View.GONE);
                        button2.setVisibility(View.VISIBLE);
                        bandidoimage.setVisibility(View.GONE);
                        pirataimage.setVisibility(View.GONE);
                        pistoleroimage.setVisibility(View.GONE);
                        traidorimage.setVisibility(View.GONE);
                        assassinoimage.setVisibility(View.GONE);
                    }
                }
        );
    }
}