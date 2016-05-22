package com.example.newto.korsarze;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BattleEndActivity extends AppCompatActivity {
    TextView UserStat1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_end);

        UserStat1=(TextView)findViewById(R.id.summaryText);



        Intent intent =getIntent();

        String Login;
        //String Login = intent.getStringExtra("login");
        SharedPreferences sharedPref =getSharedPreferences("NAME", Context.MODE_PRIVATE);
        Login=sharedPref.getString("NAME","");

        String statystykiwygr;
        String statystykiprzegr;
        statystykiwygr=sharedPref.getString("winsstring","");
        statystykiprzegr=sharedPref.getString("winsstring","");
        if(Login==""){
            UserStat1.setText("Zaloguj się!!! ");}
        else
            UserStat1.setText("Twoje statystyki piracie:\nStatystyki przgrane"+statystykiprzegr+"\nStatystyki wygrane"+statystykiwygr+".");
    }

    public void OnClickEnd(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void OnClickReplay(View view)
    {
        Intent intent = new Intent(this,PrepareActivity.class);
        startActivity(intent);
    }
}
