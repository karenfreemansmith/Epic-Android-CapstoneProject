package com.karenfreemansmith.flashcards.adapters;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Shader;

import com.squareup.picasso.Transformation;

/**
 * Created by Karen Freeman-Smith on 1/5/2017.
 */

public class CircleImage implements Transformation {
  boolean mCircleSeparator = false;

  public CircleImage() {
  }

  public CircleImage(boolean circleSeparator) {
    mCircleSeparator = circleSeparator;
  }

  @Override
  public Bitmap transform(Bitmap source) {
    int size = Math.min(source.getWidth(), source.getHeight());

    int x = (source.getWidth() - size) /2;
    int y = (source.getHeight() - size) /2;

    Bitmap squaredBitmap =Bitmap.createBitmap(source, x, y, size, size);

    if(squaredBitmap != source) {
      source.recycle();
    }

    Bitmap bitmap = Bitmap.createBitmap(size, size, source.getConfig());

    Canvas canvas = new Canvas(bitmap);
    BitmapShader shader = new BitmapShader(squaredBitmap, BitmapShader.TileMode.CLAMP, BitmapShader.TileMode.CLAMP);
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG | Paint.FILTER_BITMAP_FLAG);
    paint.setShader(shader);

    float r = size/2f;
    canvas.drawCircle(r,r,r-1,paint);

    Paint paintBorder = new Paint();
    paintBorder.setStyle(Style.STROKE);
    paintBorder.setColor(Color.argb(84,0,0,0));
    paintBorder.setAntiAlias(true);
    paintBorder.setStrokeWidth(1);
    canvas.drawCircle(r,r,r-1, paintBorder);

    if(mCircleSeparator) {
      Paint paintBorderSeparator = new Paint();
      paintBorderSeparator.setStyle(Style.STROKE);
      paintBorderSeparator.setColor(Color.parseColor("#ffffff"));
      paintBorderSeparator.setAntiAlias(true);
      paintBorderSeparator.setStrokeWidth(4);
      canvas.drawCircle(r,r,r+1,paintBorderSeparator);
    }

    squaredBitmap.recycle();
    return bitmap;
  }

  @Override
  public String key() {
    return "circle";
  }
}
