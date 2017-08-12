package com.wcccd.wcccditcareerprograms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

public class ProgramListActivity extends AppCompatActivity {

    //declare ListView names of CIS programs listed vertically, string stores the value of names
    ListView listView;

    //declare variable String to store or assign the value of names of CIS programs
    String[] values= new String[]{"CIS: Application Developer CERT","CIS: CyberSecurity CERT","CIS: Computer Support Specialist CERT","CIS: Database Administrator CERT","CIS: Network Administrator CERT","CIS: Website Developer CERT","CIS: Video Game Design & Animation CERT","CIS: Computer Information Systems AAS","CIS: Cybersecurity AAS"};

    @Override
    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.list);

       ArrayAdapter<String> adapter=new ArrayAdapter<String>(ProgramListActivity.this,android.R.layout.simple_list_item_1,values);

       //Assign adapter to ListView
        listView.setAdapter(adapter);

        //ListView Item Click Listener
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               if (position == 0){
                   Intent myIntent = new Intent(view.getContext(), ApplicationDeveloperCert.class);
                   startActivityForResult(myIntent, 0);
               }

               if (position == 2){
                   Intent myIntent = new Intent(view.getContext(), CisComputerSupportSpecialist.class);
                   startActivityForResult(myIntent, 0);
               }

               // Just uncomment out these codes below once you have created the activities similar
               // to these plugin program classes
               // The code above is a test example that I have done with the "ApplicationDeveloperCert".class in which
               // it is matching the activity that I've created in the project tray called ApplicationDeveloperCert
               // For example, "CyberSecurityCert".class in the intent should be matching the
               // activity class or Main activity class.
               // That way, it makes a intent call to your activity that you have created for it to work.

               /** if (position == 1){
                   Intent myIntent = new Intent(view.getContext(), CyberSecurityCert.class);
                   startActivityForResult(myIntent, 0);
               }

               if (position == 2){
                   Intent myIntent = new Intent(view.getContext(), ComputerSupportSpecialistCert.class);
                   startActivityForResult(myIntent, 0);
               }

               if (position == 3){
                   Intent myIntent = new Intent(view.getContext(), DatabaseAdministratorCert.class);
                   startActivityForResult(myIntent, 0);
               }

               if (position == 4){
                   Intent myIntent = new Intent(view.getContext(), NetworkAdministratorCert.class);
                   startActivityForResult(myIntent, 0);
               }

               if (position == 5){
                   Intent myIntent = new Intent(view.getContext(), WebsiteDeveloperCert.class);
                   startActivityForResult(myIntent, 0);
               }

               if (position == 6){
                   Intent myIntent = new Intent(view.getContext(), VideoGameDesignAndAnimationCert.class);
                   startActivityForResult(myIntent, 0);
               }

               if (position == 7){
                   Intent myIntent = new Intent(view.getContext(), ComputerInformationSystemsAAS.class);
                   startActivityForResult(myIntent, 0);
               }

               if (position == 8){
                   Intent myIntent = new Intent(view.getContext(), CybersecurityAAS.class);
                   startActivityForResult(myIntent, 0);
               }**/

           }


         });

       }
}
