package com.example.puza.usefulfeatures.customDialogueBox;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.puza.usefulfeatures.R;

public class CustomDialogueBoxActivity extends AppCompatActivity {

    Button showDialogBT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialogue_box);

        showDialogBT = findViewById(R.id.showDialogBT);

        showDialogBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    public void openDialog() {

//        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
//
//        // Set Custom Title
//        TextView title = new TextView(this);
//        // Title Properties
//        title.setText("Custom Dialog Box");
//        title.setPadding(10, 10, 10, 10);   // Set Position
//        title.setGravity(Gravity.CENTER);
//        title.setTextColor(Color.BLACK);
//        title.setTextSize(20);
//        alertDialog.setCustomTitle(title);
//
//        // Set Message
//        TextView msg = new TextView(this);
//        // Message Properties
//        msg.setText("I am a Custom Dialog Box. \n Please Customize me.");
//        msg.setGravity(Gravity.CENTER_HORIZONTAL);
//        msg.setTextColor(Color.BLACK);
//        alertDialog.setView(msg);

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(CustomDialogueBoxActivity.this);
        alertDialog.setTitle("New Address");
//        alertDialog.setMessage("Enter Password");

        final EditText input = new EditText(CustomDialogueBoxActivity.this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        input.setLayoutParams(lp);
        alertDialog.setView(input); // uncomment this line

        alertDialog.setNegativeButton("ADD NEW ADDRESS",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.cancel();
                    }
                });

        // Set Button
        // you can more buttons
//        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL,"ADD NEW ADDRESS", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int which) {
//                // Perform Action on Button
//            }
//        });

//        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE,"CANCEL", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int which) {
//                // Perform Action on Button
//            }
//        });

        new Dialog(getApplicationContext());
        alertDialog.show();

//        // Set Properties for OK Button
//        final Button okBT = alertDialog.getButton(AlertDialog.BUTTON_NEUTRAL);
//        LinearLayout.LayoutParams neutralBtnLP = (LinearLayout.LayoutParams) okBT.getLayoutParams();
//        neutralBtnLP.gravity = Gravity.FILL_HORIZONTAL;
//        okBT.setPadding(50, 10, 10, 10);   // Set Position
//        okBT.setTextColor(Color.BLUE);
//        okBT.setLayoutParams(neutralBtnLP);
//
//        final Button cancelBT = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);
//        LinearLayout.LayoutParams negBtnLP = (LinearLayout.LayoutParams) okBT.getLayoutParams();
//        negBtnLP.gravity = Gravity.FILL_HORIZONTAL;
//        cancelBT.setTextColor(Color.RED);
//        cancelBT.setLayoutParams(negBtnLP);
    }
}