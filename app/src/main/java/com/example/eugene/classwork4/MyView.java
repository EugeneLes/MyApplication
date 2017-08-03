package com.example.eugene.classwork4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

import com.example.eugene.myapplication.R;

/**
 * Created by Eugene on 31.07.2017.
 */

public class MyView extends View {

    private Paint myPaint = new Paint();
    RectF acrRectF = new RectF();
    int cx;// = getWidth()/2;
    int cy;// = getHeight()/2;

    public MyView(Context context) {
        super(context);
        initialize();
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initialize();
    }

    private void initialize(){
        myPaint.setAntiAlias(true);
        int color = ContextCompat.getColor(getContext(), R.color.colorAccent);
        myPaint.setColor(color);
        myPaint.setStyle(Paint.Style.STROKE);
        myPaint.setStrokeWidth(1);
        Resources r = getResources();
        float strokeWidthInPx = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2,r.getDisplayMetrics());

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        //if the Size was changed
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        int radius = Math.min(getWidth(),getHeight())/2;
        canvas.drawCircle(cx,cy,radius, myPaint);

        int startX = 0;
        int startY = 0;
        int stopX = getWidth();
        int stopY = getHeight();
        canvas.drawLine(startX,startY,stopX,stopY,myPaint);

        acrRectF.left = 0;
        acrRectF.top = 0;
        acrRectF.right = getWidth();
        acrRectF.bottom = getHeight();
        myPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(acrRectF,0,90,true,myPaint);

        canvas.drawRect(500,50,100,100,myPaint); //need to use separate Paint for changing style
        //canvas.rotate(30,midX,midY); //for homework1

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction()==MotionEvent.ACTION_MOVE){ //_UP, _MOVE
            cx = (int)event.getX();
            cy = (int)event.getY();
            invalidate();//enforces reDrawing
        } else if(event.getAction()==MotionEvent.ACTION_DOWN) {
        } else if(event.getAction()==MotionEvent.ACTION_UP) {
        }
            return true;//super.onTouchEvent(event);
    }
}
