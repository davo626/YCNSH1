package com.example.student4.ycnsh;

/**
 * Created by student4 on 31.03.17.
 */
public class Converter {

    /////

    static int width, height;
    static double ratio = 16.0/9.0;
    static int marginx = 0, marginy = 0;//черные поля

    public static void init(int width, int height){
        Converter.width = width;
        Converter.height = height;
        if((double)width/height>ratio){
            marginx=(width-height*16/9)/2;
        }else{
            marginy=(height-width*9/16)/2;
        }

    }

    public static float xToP(double x){
        Man.x = x;
        Man.xp=(x+8)/16*width;
        return Man.xp;
    }
    public static float yToP(double y){
        Man.y=y;
        Man.yp=-height*(y-4.5)/9;
        return Man.yp;}
    public static double pToX(float xp) {
        Man.xp=xp;
        Man.x=(xp/width*16)-8;
        return Man.x;
    }
    public static double pToY(float yp) {
        Man.yp=yp;
        Man.y=-9*yp/height+4.5;
        return Man.y;}
    //
    public static float xvToP(double vx){
        Man.vx = vx;
        Man.vxp=(vx+8)/16*width;
        return Man.vxp;
    }
    public static float yvToP(double vy){
        Man.vy=vy;
        Man.vyp=-height*(vy-4.5)/9;
        return Man.vyp;}
    public static double pToXv(float vxp) {
        Man.vxp=vxp;
        Man.vx=(vxp/width*16)-8;
        return Man.vx;
    }
    public static double pToYv(float vyp) {
        Man.vyp=vyp;
        Man.vy=-9*vyp/height+4.5;
        return Man.vy;}
}
