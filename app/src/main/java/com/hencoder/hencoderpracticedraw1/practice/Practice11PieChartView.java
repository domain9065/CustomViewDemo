package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {


    Paint paint=new Paint();
    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {//
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图  aa

        paint.setColor(Color.BLUE); //domain
        paint.setStyle(Paint.Style.FILL);   //  domain11
        canvas.drawArc(200,200,600,600,20,10,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(200,200,600,600,35,10,true,paint);

        canvas.drawArc(200,200,600,600,50,30,true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(200,200,600,600,85,100,true,paint);

        paint.setColor(Color.RED);
        canvas.drawArc(200,200,580,580,200,110,true,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(200,200,600,600,320,40,true,paint);

    }
}
