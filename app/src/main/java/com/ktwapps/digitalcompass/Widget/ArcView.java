package com.ktwapps.digitalcompass.Widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class ArcView extends View {

    /* renamed from: f */
    Paint f23384f = new Paint();

    /* renamed from: g */
    Paint f23385g = new Paint();

    /* renamed from: h */
    RectF f23386h;

    /* renamed from: i */
    public float f23387i;

    /* renamed from: j */
    public float f23388j;

    public ArcView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23384f.setColor(Color.parseColor("#EB2027"));
        this.f23385g.setColor(Color.parseColor("#000000"));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        float f = width / 650.0f;
        float f2 = 422.0f * f;
        float f3 = (width - f2) / 2.0f;
        float f4 = f2 + f3;
        if (this.f23386h == null) {
            this.f23386h = new RectF(f3, f3, f4, f4);
        }
        float f5 = this.f23388j - this.f23387i;
        if (f5 < -180.0f) {
            f5 += 360.0f;
        } else if (f5 > 180.0f) {
            f5 -= 360.0f;
        }
        canvas.drawArc(this.f23386h, -90.0f, f5, true, this.f23384f);
        canvas.drawCircle(width / 2.0f, height / 2.0f, (f * 290.0f) / 2.0f, this.f23385g);
    }

    public void setTrueNorth(boolean z) {
        this.f23384f.setColor(Color.parseColor(z ? "#2D89EB" : "#EB2027"));
        invalidate();
    }
}