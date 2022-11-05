package com.example.android_gestures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {


    private GestureDetector mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDetector=new GestureDetector(this,this);

    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        if (this.mDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    String TAG="log:";
    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Log.d(TAG, "onDown:按下");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        Log.d(TAG, "onShowPress:手指按下一段时间,不过还没到长按");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        Log.d(TAG, "onSingleTapUp:手指离开屏幕的一瞬间");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Log.d(TAG, "onScroll:在触摸屏上滑动");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        Log.d(TAG, "onLongPress:长按并且没有松开");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        Log.d(TAG, "onFling:迅速滑动，并松开，x从"+motionEvent.getX()+"到"+motionEvent1.getX());
        return false;
    }
}