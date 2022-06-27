package com.ktwapps.digitalcompass.Widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class CompassDirectionView extends CompassView {

    /* renamed from: s */
    Paint f23389s;

    /* renamed from: t */
    Rect f23390t;

    /* renamed from: u */
    Rect f23391u;

    /* renamed from: v */
    String f23392v;

    public CompassDirectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1498e();
    }

    /* renamed from: e */
    private void m1498e() {
        this.f23390t = new Rect();
        this.f23391u = new Rect();
        Paint paint = new Paint();
        this.f23389s = paint;
        paint.setColor(-65536);
        this.f23392v = "0°";
    }

    @Override // com.ktwapps.digitalcompass.Widget.CompassView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f23389s.setTextSize((getHeight() / 650.0f) * 30.0f);
        Paint paint = this.f23389s;
        String str = this.f23392v;
        paint.getTextBounds(str, 0, str.length(), this.f23390t);
        this.f23389s.getTextBounds("°", 0, 1, this.f23391u);
        canvas.drawText(this.f23392v, (getWidth() / 2.0f) - (((this.f23390t.width() - this.f23391u.width()) - 2.0f) / 2.0f), this.f23390t.height(), this.f23389s);
    }

    public void setAzumith(String str) {
        if (str == null || str.length() == 0) {
            this.f23392v = "0°";
        }
        this.f23392v = str;
        invalidate();
    }

    public void setTrueNorth(boolean z) {
        this.f23389s.setColor(Color.parseColor(z ? "#2D89EB" : "#EB2027"));
        invalidate();
    }
}