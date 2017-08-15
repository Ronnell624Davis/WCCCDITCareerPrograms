package com.wcccd.wcccditcareerprograms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CisWebsiteDeveloperCert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cis_website_developer_cert);

        Button webSiteDevBtn = (Button) findViewById(R.id.websiteDevButton);
        webSiteDevBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                String url = "http://www.wcccd.edu/academic/pdfs/CIS_Website_Developer%20FINALB.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
