package com.example.skszuq001.assingment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class display_screen extends AppCompatActivity {

    Button btnCr, btnBc ;
    EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_screen);

        btnBc=(Button)findViewById(R.id.button);
        btnCr=(Button)findViewById(R.id.btn_clear);

        display=(EditText)findViewById(R.id.editText);
        //display.setText("successfully cleared");
    }

    public void sendMessage(View view)
    {
        //Intent intent = new Intent(mainMenu.this, homeScreen.class);
        //startActivity(intent);

        if(view.getId()==R.id.button){

            Intent intent = new Intent(display_screen.this, mainMenu.class);
            startActivity(intent);

        }else if(view.getId()==R.id.btn_clear){

            //Intent intent = new Intent(display_screen.this, display_screen.class);
            //startActivity(intent);

            display.setText("successfully cleared");
        }



    }
}
