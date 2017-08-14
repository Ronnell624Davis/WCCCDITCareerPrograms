package com.wcccd.wcccditcareerprograms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.net.Uri;


public class ApplicationDeveloperCert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_developer_cert);

        Button appDevBtn = (Button) findViewById(R.id.appDevButton);
        appDevBtn.setOnClickListener(new OnClickListener() {

            // I did a test on the url using different web addresses and works fine but,
            // for wcccd pdf file, the web app crashes. It does'nt try to download or view it.
            // use this address sample to replace the wcccd pdf web address
            // and it will work: "https://www.google.com/" after finishing testing replace back
            // the original address: "http://www.wcccd.edu/academic/pdfs/CIS_App_Developer.pdf"
            @Override
            public void onClick(View v){

                String url = "http://www.wcccd.edu/academic/pdfs/CIS_App_Developer.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }

}
