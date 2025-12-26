package com.example.kashemking;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class BoardView extends View {

    Paint paint = new Paint();

    public BoardView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int size = Math.min(getWidth(), getHeight());
        int half = size / 2;

        paint.setColor(Color.RED);
        canvas.drawRect(0, 0, half, half, paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(half, 0, size, half, paint);

        paint.setColor(Color.BLUE);
        canvas.drawRect(0, half, half, size, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawRect(half, half, size, size, paint);
    }
}
