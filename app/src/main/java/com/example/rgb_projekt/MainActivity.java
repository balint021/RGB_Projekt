package com.example.rgb_projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Red;
    private TextView Green;
    private TextView Blue;

    private SeekBar RBar;
    private SeekBar GBar;
    private SeekBar BBar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public void init(){
        Red = findViewById(R.id.R);
        Green = findViewById(R.id.G);
        Blue = findViewById(R.id.B);

        RBar = findViewById(R.id.RBar);
        GBar = findViewById(R.id.GBar);
        BBar = findViewById(R.id.BBar);



        RBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        Red.setText(progress + "");
                        getWindow().getDecorView().setBackgroundColor(Color.rgb(RBar.getProgress(), GBar.getProgress(), BBar.getProgress()));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        GBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        Green.setText(progress + "");
                        getWindow().getDecorView().setBackgroundColor(Color.rgb(RBar.getProgress(), GBar.getProgress(), BBar.getProgress()));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        BBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        Blue.setText(progress + "");
                        getWindow().getDecorView().setBackgroundColor(Color.rgb(RBar.getProgress(), GBar.getProgress(), BBar.getProgress()));
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );


    }

}
