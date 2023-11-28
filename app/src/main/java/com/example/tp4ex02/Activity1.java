package com.example.tp4ex02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    Button btn1,btn2,btn3;
    EditText ed1;

    Button white,pink,purple;
    ConstraintLayout layout;

    TextView text;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        btn1=findViewById(R.id.btn_1);
        btn2=findViewById(R.id.btn_2);
        btn3=findViewById(R.id.btn_3);
        ed1=findViewById(R.id.ed_number);

        white=findViewById(R.id.white);
        pink=findViewById(R.id.pink);
        purple=findViewById(R.id.purple);
        layout=findViewById(R.id.layout);

        white.setOnClickListener(v -> layout.setBackgroundColor(Color.WHITE));
        pink.setOnClickListener(v -> layout.setBackgroundColor(0x6A98315F));
        purple.setOnClickListener(v -> layout.setBackgroundColor(0xB2602180));


        text=findViewById(R.id.text);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(null);
                text.setText(
                        "?*0=?" +
                        "\n?*1=?" +
                        "\n?*2=?" +
                        "\n?*3=?" +
                        "\n?*4=?" +
                        "\n?*5=?" +
                        "\n?*6=?" +
                        "\n?*7=?" +
                        "\n?*8=?" +
                        "\n?*9=?");
                if (ed1.getText().toString().isEmpty()){
                    Toast.makeText(Activity1.this, "vide", Toast.LENGTH_SHORT).show();
                }


           }

        });



        btn3.setOnClickListener(v -> {
            finish();
        });
    }
}
