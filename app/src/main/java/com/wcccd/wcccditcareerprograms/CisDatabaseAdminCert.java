package com.wcccd.wcccditcareerprograms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CisDatabaseAdminCert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cis_database_admin_cert);

        Button dataBaseAdminBtn = (Button) findViewById(R.id.dataBaseButton);
        dataBaseAdminBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                String url = "http://www.wcccd.edu/academic/pdfs/CIS_Database_Admin%20PS_7-2016_FINAL.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
