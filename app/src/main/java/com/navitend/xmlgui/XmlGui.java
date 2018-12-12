/*
 * XmlGui application.
 * Written by Frank Ableson for IBM Developerworks
 * December 2018
 * Use the code as you wish -- no warranty of fitness, etc, etc.
 */

package com.navitend.xmlgui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class XmlGui extends AppCompatActivity {
    final String tag = XmlGui.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml_gui);

        Button btnRunForm = (Button) this.findViewById(R.id.btnRunForm);
        btnRunForm.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                EditText formNumber = (EditText) findViewById(R.id.formNumber);
                Log.i(tag,"Attempting to process Form # [" + formNumber.getText().toString() + "]");
                Intent newFormInfo = new Intent(XmlGui.this,RunForm.class);
                newFormInfo.putExtra("formNumber", formNumber.getText().toString());
                startActivity(newFormInfo);
            }
        });
    }



}
