package com.example.student4.ycnsh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Gameplay_Activity extends AppCompatActivity {

    private ImageButton hittingButton;
    private ImageButton rightButton;
    private ImageButton leftButton;
    private ImageButton startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gameplay_);
        hittingButton = (ImageButton) findViewById(R.id.hitButton);
        rightButton = (ImageButton) findViewById(R.id.moveRightButton);
        leftButton = (ImageButton) findViewById(R.id.moveLeftButton);
        startButton = (ImageButton) findViewById(R.id.startGameButton);

    }
    //находим кнопки
    public void onStartButtonClick(View view){
    startButton.setVisibility(View.INVISIBLE);
        hittingButton.setVisibility(View.VISIBLE);
        leftButton.setVisibility(View.VISIBLE);
        rightButton.setVisibility(View.VISIBLE);
    }
    public void onLeftButtonClick(View view){
        //анимация движения игрока влево, идущие направо противники ускоряются, налево - замедляются
        Toast.makeText(this, "left", Toast.LENGTH_SHORT).show();
    }
    public void onRightButtonClick(View view){
        //анимация движения игрока вправоБ идущие направо противники замедляются, налево - ускоряются
        Toast.makeText(this, "right", Toast.LENGTH_SHORT).show();
    }
    public void onHitButtonClick(View view){
        //анимацитя удара, ближайшие противники со стороны, в которую выполняется удар - погибают
        Toast.makeText(this, "hit", Toast.LENGTH_SHORT).show();
    }

}
