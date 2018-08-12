package com.example.skszuq001.assingment1;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class mainMenu extends AppCompatActivity {

    Button btnC, btnB ;

    GridLayout mainGrid;
    int k;

   //db
    DataBaseHelper_Class mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnB=(Button)findViewById(R.id.btnBack);
        btnC=(Button)findViewById(R.id.btnCalc);

        mainGrid =(GridLayout)findViewById(R.id.main_Grid);

        setSingleEvent(mainGrid);



        //database
      //  mydb =new DataBaseHelper_Class(this);


    }

    private void setSingleEvent(GridLayout mainGrid) {

        for(int i = 0; i<mainGrid.getChildCount(); i++){

            CardView c_view= (CardView)mainGrid.getChildAt(i);

            final int finalI = i;
             final int j=i;
            c_view.setOnClickListener(new View.OnClickListener() {
                @Override

                //write code to go to another screen here and display information in that screen;
                public void onClick(View view) {
                           //onClick
                    //replace Toast with start new activity code

                    //Toast.makeText(mainMenu.this, "Clicked "+ finalI, Toast.LENGTH_SHORT).show();
                    //public void sendMessage View view)
                   // {
                       //Intent intent = new Intent(mainMenu.this, display_screen.class);
                       //startActivity(intent);

                    //code to display infromation depending on index selected



                    if(j==0){
                        Intent intent = new Intent(mainMenu.this, MainActivity.class);
                        startActivity(intent);
                        /*

                        Cursor r =mydb.getAll();

                        if(r.getCount()==0){
                            //show message

                            showMessage("Error ", "No data Found");

                            return;

                        }

                        StringBuffer buffer=new StringBuffer();

                        while (r.moveToNext()){
                            buffer.append("ID :"+ r.getString(0));
                            buffer.append("Date :"+ r.getString(1));
                            buffer.append("Category :"+ r.getString(2));
                            buffer.append("Litres :"+ r.getString(3));

                        }

                        //show all data
                        showMessage("Data", buffer.toString());










                      */






                        }else if(j==1){
                           mydb.getCooking();

                       }else if(j==2){
                           mydb.getDishes();


                       }else if(j==3){
                           mydb.getDrinking();


                       }else if(j==4){
                           mydb.getHygiene();


                       }else if(j==5){
                           mydb.getLaundry();


                       }else if(j==6){
                           mydb.getShower();


                       }else if(j==7){
                           mydb.getToilet();

                       }







                    // }

                }
            });


        }


    }



    public void showMessage(String title, String message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();

    }




    //back button
    public void sendMessage(View view)
    {
        //Intent intent = new Intent(mainMenu.this, homeScreen.class);
        //startActivity(intent);

        if(view.getId()==R.id.btnBack){

            Intent intent = new Intent(mainMenu.this, homeScreen.class);
            startActivity(intent);

       }else if(view.getId()==R.id.btnCalc){

            Intent intent = new Intent(mainMenu.this, capture_data.class);
            startActivity(intent);

            }



    }

    //calculate button to go to screen for entering data



}
