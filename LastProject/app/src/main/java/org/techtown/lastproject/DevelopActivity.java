package org.techtown.lastproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DevelopActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developcommend);

        Button developecomplateButtom = (Button) findViewById(R.id.developcompleteButton);

        developecomplateButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DevelopeResultActvity.class);
                startActivity(intent);
            }
        });
    }


}

