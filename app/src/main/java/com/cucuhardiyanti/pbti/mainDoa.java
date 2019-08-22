package com.cucuhardiyanti.pbti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mainDoa extends AppCompatActivity {
    //private Button doaAnginRibut;
    //private Button doaAnjingMenggonggong;
    //private Button doaAyamBerkokok;
    //private Button doaBanguntidur;
    // private Button doaBukaPuasa;
    //private Button doaDalamPerjalanan;
    //private Button doaHalilintar;

    private TextView doaMasukRumah, doaKeluarRumah, doaTertimpaMusibah,
            doaTerhindarDariSyirik, doaMerasaTakut, doaMerasaSakit, doaMemintaKebaikan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_doa);

        //doaAnginRibut = (Button)findViewById(R.id.btn_doa_angin_ribut);
        //doaAnjingMenggonggong = (Button)findViewById(R.id.btn_doa_anjing_mengonggong);
        //doaAyamBerkokok = (Button)findViewById(R.id.btn_doa_ayam_berkokok);
        //doaBanguntidur = (Button)findViewById(R.id.btn_doa_bangun_tidur);
        //doaBukaPuasa = (Button)findViewById(R.id.btn_doa_buka_puasa);
        //doaDalamPerjalanan = (Button)findViewById(R.id.btn_doa_dalam_perjalanan);
        //doaHalilintar = (Button)findViewById(R.id.btn_doa_halilintar);

        doaMasukRumah = (TextView)findViewById(R.id.doaMasukRumah);
        doaKeluarRumah= (TextView)findViewById(R.id.doaKeluarRumah);
        doaTertimpaMusibah = (TextView)findViewById(R.id.doaTertimpaMusibah);
        doaTerhindarDariSyirik = (TextView)findViewById(R.id.doaTerhindarDariSyirik);
        doaMerasaTakut = (TextView)findViewById(R.id.doaMerasaTakut);
        doaMerasaSakit = (TextView)findViewById(R.id.doaMerasaSakit);
        doaMemintaKebaikan = (TextView)findViewById(R.id.doaMemintaKebaikan);

        //doaAnginRibut.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaAnginRibut.class);
        //startActivity(cucu);
        //}
        //});

        //doaAnjingMenggonggong.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaAnjingMenggonggong.class);
        //startActivity(cucu);
        //}
        //});

        //doaAyamBerkokok.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaAyamBerkokok.class);
        //startActivity(cucu);
        //}
        //});

        //doaBanguntidur.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaBangunTidur.class);
        //startActivity(cucu);
        //}
        //});

        //doaBukaPuasa.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaBukaPuasa.class);
        //startActivity(cucu);
        //}
        //});

        //doaDalamPerjalanan.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaDalamPerjalanan.class);
        //startActivity(cucu);
        //}
        //});

        //doaHalilintar.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //Intent cucu = new Intent(mainDoa.this, DoaHalilintar.class);
        //startActivity(cucu);
        //}
        //});

        doaMasukRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaMasukRumah.class);
                startActivity(intent);
            }
        });

        doaKeluarRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaKeluarRumah.class);
                startActivity(intent);
            }
        });

        doaTertimpaMusibah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaTertimpaMusibah.class);
                startActivity(intent);
            }
        });

        doaTerhindarDariSyirik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaTerhindarDariSyirik.class);
                startActivity(intent);
            }
        });

        doaMerasaTakut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaMerasaTakut.class);
                startActivity(intent);
            }
        });

        doaMerasaSakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaMerasaSakit.class);
                startActivity(intent);
            }
        });

        doaMemintaKebaikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainDoa.this, DoaMemintaKebaikan.class);
                startActivity(intent);
            }
        });

    }
}
