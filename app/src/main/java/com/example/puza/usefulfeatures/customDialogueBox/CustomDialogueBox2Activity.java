package com.example.puza.usefulfeatures.customDialogueBox;

import android.app.Activity;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puza.usefulfeatures.R;

import org.w3c.dom.Text;

public class CustomDialogueBox2Activity extends Activity {

    private Button buttonClick;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialogue_main);

        buttonClick = (Button) findViewById(R.id.buttonClick);

        // add listener to button
        buttonClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // Create custom dialog object
                final Dialog dialog = new Dialog(CustomDialogueBox2Activity.this);
                // Include dialog.xml file
                dialog.setContentView(R.layout.dialogue);
                // Set dialog title
                TextView textTitle = (TextView)dialog.findViewById(R.id.textTitle);
                dialog.setTitle("Custom Dialog");

                // set values for custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.textDialog);
                text.setText("Custom dialog Android example.");

                EditText editText = (EditText)dialog.findViewById(R.id.editText);

                ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
                image.setImageResource(R.drawable.ic_launcher_background);

                dialog.show();

                Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                // if decline button is clicked, close the custom dialog
                declineButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Close dialog
                        dialog.dismiss();
                    }
                });


            }

        });

    }

}