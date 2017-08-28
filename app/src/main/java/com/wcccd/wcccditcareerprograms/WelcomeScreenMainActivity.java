package com.wcccd.wcccditcareerprograms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//Nothing to do here for the welcome screen, its all set
public class WelcomeScreenMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen_main);
    }
// Called when the user taps the view programs button
    public void tapToViewPrograms(View view){
        Intent intent = new Intent(this, ProgramListActivity.class);
        startActivity(intent);
    }

    // Called when the user taps the contact us button
    public void contactButton(View view){
        Intent intent = new Intent(this, ContactUsActivity.class);
        startActivity(intent);
    }

}
