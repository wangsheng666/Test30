package com.example.a123.test30;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 123 on 2016/9/7.
 */
public class CustomView extends View {


    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //设置画布背景色
        canvas.drawColor(Color.WHITE);

        Paint paint=new Paint();

        ////绘制矩形，内部不填充
        //抗锯齿
        paint.setAntiAlias(true);

        //画笔颜色
        paint.setColor(Color.RED);

        //设置填充类型
        paint.setStyle(Paint.Style.STROKE);

        //设置画笔宽度
        paint.setStrokeWidth(5);

        //绘制普通矩形
        canvas.drawRect(10, 10, 100, 100, paint);

        //绘制三角形，内部填充
        Path path=new Path();
        path.moveTo(10, 120);
        path.lineTo(200, 120);
        path.lineTo(100, 200);
        path.close();
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);

        //绘制文本
        paint.setTextSize(12);
        paint.setColor(Color.BLUE);
        paint.setStrikeThruText(true);
        canvas.drawText("hello world", 10, 200, paint);

        Path pathText=new Path();
        pathText.addCircle(200,300,80, Path.Direction.CCW);

        canvas.drawTextOnPath("abcdefghigklmnopqrstuvwxyz.abcdefghigklmnopqrstuvwxyz.",pathText,0,10,paint);
    }
}