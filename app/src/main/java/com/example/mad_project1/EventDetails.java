package com.example.mad_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EventDetails extends AppCompatActivity {
    ImageView iv;
    TextView h1,sf1,sf2,des1, des;
    String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);
        Intent intent = getIntent();
        String head1 = intent.getStringExtra("first_head");
        String sone1 = intent.getStringExtra("first_sone");
        String stwo1 = intent.getStringExtra("first_stwo");

        Bundle bundle = this.getIntent().getExtras();
        int pic = bundle.getInt("image");
        iv = findViewById(R.id.img1);
        iv.setImageResource(pic);

        h1 = findViewById(R.id.tx1);
        sf1 = findViewById(R.id.tx2);
        sf2 = findViewById(R.id.tx3);

        h1.setText(head1);
        sf1.setText(sone1);
        sf2.setText(stwo1);

        if (head1.contentEquals("Light")){
             description = "5000/= PER HOUR";

        }

        if (head1.contentEquals("Coffee")){
            description = "10000/= PER HOUR";

        }
        if (head1.contentEquals("Peo")){
            description = "10000/= PER HOUR";



        }
        if(head1.contentEquals("Calm")){
            description = "8000/= PER HOUR";



        }



        des = findViewById(R.id.tx4);
        des.setText(description);

    }
}
