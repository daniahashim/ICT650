package com.example.homepage;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class about extends AppCompatActivity {

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradient));
        }
        Element adsElement = new Element();
        String desc= "Real Time Hazard Updates"+"\n Display the real time updates on hazards on the roads";
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.icon1)
                .setDescription(desc)
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("Connect with us")
                .addEmail("syafiqahsyazwani60@gmail.com")
                .addWebsite("https://github.com/daniahashim/ICT650")
                .addGroup("GROUP MEMBER LIST \nGROUP: CS2515A"
                +"\nSYAFIQAH SYAZWANI BT PEER MOHAMED (2020898304)"
                +"\nNURUL NAZEERAH BT ZULKORNAIN (2020862276"
                +"\nNUR ATIQAH WAHIDAH BT SULAIMAN (2020483286)"
                +"\nNUR DANIA HASHIM BINTI AZMAN (2020853818)" )
                .addItem(createCopyright())
                .create();

        setContentView(aboutPage);
    }
    private Element createCopyright()
    {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d by NADS", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        // copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(about.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}
