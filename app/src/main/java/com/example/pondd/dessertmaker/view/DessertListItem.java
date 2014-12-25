package com.example.pondd.dessertmaker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.pondd.dessertmaker.R;

/**
 * Created by nuuneoi on 11/16/2014.
 */
public class DessertListItem extends RelativeLayout {

    private ImageView imageView;
    private TextView topText;
    private TextView bottomText;

    public DessertListItem(Context context) {
        super(context);
        initInflate();
        initInstances();
    }

    public DessertListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        initInflate();
        initInstances();
        initWithAttrs(attrs);
    }

    public DessertListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initInflate();
        initInstances();
        initWithAttrs(attrs);
    }

    private void initInflate() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.dessert_list_item, this);

    }

    private void initInstances() {
        imageView = (ImageView) findViewById(R.id.imageView);
        topText = (TextView) findViewById(R.id.topText);
        bottomText = (TextView) findViewById(R.id.bottomText);
    }

    private void initWithAttrs(AttributeSet attrs) {

    }
}