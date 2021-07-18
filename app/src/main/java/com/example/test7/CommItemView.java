package com.example.test7;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CommItemView extends LinearLayout {

    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;

    public CommItemView(Context context) {
        super(context);

        init(context);
    }

    public CommItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.comment_item_view, this, true);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);

    }

    public void setName(String name) {
        textView.setText(name);
    }

    public void setTime(String Time) {
        textView2.setText(Time);
    }

    public void setComment(String Comment) {
        textView3.setText(Comment);
    }

    public void setCommlike(String commlike) {
        textView4.setText(commlike);
    }

    public void setBar(String bar) {
        textView5.setText(bar);
    }

    public void setreport(String report) {
        textView6.setText(report);
    }
}
