package com.example.elvis.elvisafrifa5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class Pots extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pots);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        ImageView mustache = findViewById(R.id.mustache);
        ImageView ears = findViewById(R.id.ears);
        ImageView shoes = findViewById(R.id.shoes);
        ImageView eyes = findViewById(R.id.eyes);
        ImageView glasses = findViewById(R.id.glasses);
        ImageView arms = findViewById(R.id.arms);
        ImageView hat = findViewById(R.id.hat);
        ImageView eyebrows = findViewById(R.id.eyebrows);
        ImageView nose = findViewById(R.id.nose);
        ImageView mouth = findViewById(R.id.mouth);
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.mustache1:
                if (checked)
                    mustache.setVisibility(View.VISIBLE);
                else
                    mustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.ears1:
                if (checked)
                    ears.setVisibility(View.VISIBLE);
                else
                    ears.setVisibility(View.INVISIBLE);
                break;
            case R.id.shoes1:
                if (checked)
                    shoes.setVisibility(View.VISIBLE);
                else
                    shoes.setVisibility(View.INVISIBLE);
                break;
            case R.id.eyes1:
                if (checked)
                    eyes.setVisibility(View.VISIBLE);
                else
                    eyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.glasses1:
                if (checked)
                    glasses.setVisibility(View.VISIBLE);
                else
                    glasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.arms1:
                if (checked)
                    arms.setVisibility(View.VISIBLE);
                else
                    arms.setVisibility(View.INVISIBLE);
                break;
            case R.id.hat1:
                if (checked)
                    hat.setVisibility(View.VISIBLE);
                else
                    hat.setVisibility(View.INVISIBLE);
                break;
            case R.id.eyebrows1:
                if (checked)
                    eyebrows.setVisibility(View.VISIBLE);
                else
                    eyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.nose1:
                if (checked)
                    nose.setVisibility(View.VISIBLE);
                else
                    nose.setVisibility(View.INVISIBLE);
                break;
            case R.id.mouth1:
                if (checked)
                    mouth.setVisibility(View.VISIBLE);
                else
                    mouth.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public void onSaveInstanceState (Bundle outState) {
        ImageView mustache = findViewById(R.id.mustache);
        ImageView ears = findViewById(R.id.ears);
        ImageView shoes = findViewById(R.id.shoes);
        ImageView eyes = findViewById(R.id.eyes);
        ImageView glasses = findViewById(R.id.glasses);
        ImageView arms = findViewById(R.id.arms);
        ImageView hat = findViewById(R.id.hat);
        ImageView eyebrows = findViewById(R.id.eyebrows);
        ImageView nose = findViewById(R.id.nose);
        ImageView mouth = findViewById(R.id.mouth);
        super.onSaveInstanceState(outState);

        Integer mustache1 = mustache.getVisibility();
        outState.putInt("mustache", mustache1);

        Integer ears1 = ears.getVisibility();
        outState.putInt("ears", ears1);

        Integer shoes1 = shoes.getVisibility();
        outState.putInt("shoes", shoes1);

        Integer eyes1 = eyes.getVisibility();
        outState.putInt("eyes", eyes1);

        Integer glasses1 = glasses.getVisibility();
        outState.putInt("glasses", glasses1);

        Integer arms1 = arms.getVisibility();
        outState.putInt("arms", arms1);

        Integer hat1 = hat.getVisibility();
        outState.putInt("hat", hat1);

        Integer eyebrows1 = eyebrows.getVisibility();
        outState.putInt("eyebrows", eyebrows1);

        Integer nose1 = nose.getVisibility();
        outState.putInt("nose", nose1);

        Integer mouth1 = mouth.getVisibility();
        outState.putInt("mouth", mouth1);
    }
    public void onRestoreInstanceState (Bundle InState) {
        ImageView mustache = findViewById(R.id.mustache);
        ImageView ears = findViewById(R.id.ears);
        ImageView shoes = findViewById(R.id.shoes);
        ImageView eyes = findViewById(R.id.eyes);
        ImageView glasses = findViewById(R.id.glasses);
        ImageView arms = findViewById(R.id.arms);
        ImageView hat = findViewById(R.id.hat);
        ImageView eyebrows = findViewById(R.id.eyebrows);
        ImageView nose = findViewById(R.id.nose);
        ImageView mouth = findViewById(R.id.mouth);
        super.onSaveInstanceState(InState);

        Integer mustacheRestored =InState.getInt("mustache");
        mustache.setVisibility(mustacheRestored);

        Integer earsRestored =InState.getInt("ears");
        ears.setVisibility(earsRestored);

        Integer shoesRestored =InState.getInt("shoes");
        shoes.setVisibility(shoesRestored);

        Integer eyesRestored =InState.getInt("eyes");
        eyes.setVisibility(eyesRestored);

        Integer glassesRestored =InState.getInt("glasses");
        glasses.setVisibility(glassesRestored);

        Integer armsRestored =InState.getInt("arms");
        arms.setVisibility(armsRestored);

        Integer hatRestored =InState.getInt("hat");
        hat.setVisibility(hatRestored);

        Integer eyebrowsRestored =InState.getInt("eyebrows");
        eyebrows.setVisibility(eyebrowsRestored);

        Integer noseRestored =InState.getInt("nose");
        nose.setVisibility(noseRestored);

        Integer mouthRestored =InState.getInt("mouth");
        mouth.setVisibility(mouthRestored);



    }
}
