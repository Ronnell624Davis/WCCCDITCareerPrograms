package com.wcccd.wcccditcareerprograms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CisCyberSecurityAas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cis_cyber_security_aas);

        Button cyberSecurAasBtn = (Button) findViewById(R.id.cyberSecuButton);
        cyberSecurAasBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                String url = "http://www.wcccd.edu/academic/pdfs/CIS_Cybersecurity.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
