package com.example.student4.ycnsh;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by student4 on 30.03.17.
 */
public class GameView extends View {
    BGColor bg = new BGColor();
    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Converter.init(w, h);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawARGB(200, bg.r, bg.g, bg.b);
        bg.nextColor();

            invalidate();

    }
    static class BGColor{
        int r=100;
        int g=250;
        int b=80;
        boolean rcheck=false;
        boolean gcheck=false;
        boolean bcheck=false;

        public void nextColor(){
            //r
            if (r==30){
                rcheck=true;
            }else{if(r==120){
                rcheck=false;
            }}

            if(rcheck==true) {
                r = (r + 1);
            }else{r= (r-1);}
            //g
            if (g==80){
                gcheck=true;
            }else{if(g==225){
                gcheck=false;
            }}

            if(gcheck==true) {
                g = (g + 1);
            }else{g= (g-1);}
            //b
            if (b==80){
                bcheck=true;
            }else{if(b==235){
                bcheck=false;
            }}

            if(bcheck==true) {
                b = (b + 1);
            }else{b= (b-1);}
        }
    }
}
