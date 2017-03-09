package com.example.vishal.myfun_app;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private Button mButton;
private ImageView mImageView;
private Boolean show = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView) findViewById(R.id.image);
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(show){
                mImageView.setVisibility(View.VISIBLE);
                show= false;
                mButton.setText("HIDE");
            }
             else{
                mImageView.setVisibility(View.INVISIBLE);
                show= true;
                mButton.setText("SHOW");

            }
            }
        });
    }
}

