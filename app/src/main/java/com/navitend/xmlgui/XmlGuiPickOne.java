/*
 * XmlGui application.
 * Written by Frank Ableson for IBM Developerworks
 * December 2018
 * Use the code as you wish -- no warranty of fitness, etc, etc.
 */
package com.navitend.xmlgui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class XmlGuiPickOne extends LinearLayout {
    String tag = XmlGuiPickOne.class.getName();
    TextView label;
    ArrayAdapter<String> aa;
    Spinner spinner;

    public XmlGuiPickOne(Context context,String labelText,String options) {
        super(context);
        label = new TextView(context);
        label.setText(labelText);
        spinner = new Spinner(context);
        String []opts = options.split("\\|");
        aa = new ArrayAdapter<String>( context, android.R.layout.simple_spinner_item,opts);
        spinner.setAdapter(aa);
        this.addView(label);
        this.addView(spinner);
    }

    public XmlGuiPickOne(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }


    public String getValue()
    {
        return (String) spinner.getSelectedItem().toString();
    }


}
