package com.wcccd.wcccditcareerprograms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CisInformationSystemsAas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cis_information_systems_aas);

        Button infoSysBtn = (Button) findViewById(R.id.infoSysButton);
        infoSysBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                String url = "http://www.wcccd.edu/academic/pdfs/CIS_AAS_PS_7-2016_FINAL.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
