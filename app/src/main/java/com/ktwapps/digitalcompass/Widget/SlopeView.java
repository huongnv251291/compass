package com.ktwapps.digitalcompass.Widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.ktwapps.digitalcompass.C3623l;

import org.duystudio.compass.R;

/* loaded from: classes.dex */
public class SlopeView extends View {

    /* renamed from: i */
    Context f23406i;

    /* renamed from: g */
    public float f23404g = 0.0f;

    /* renamed from: h */
    public float f23405h = 0.0f;

    /* renamed from: f */
    private Paint f23403f = new Paint();

    public SlopeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23406i = context;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float width = (getWidth() / 2.0f) + this.f23404g;
        float height = (getHeight() / 2.0f) + this.f23405h;
        this.f23403f.setColor(getResources().getColor(R.color.white_transparent));
        canvas.drawCircle(width, height, (int) C3623l.m1425a(this.f23406i, 8.0f), this.f23403f);
        this.f23403f.setColor(getResources().getColor(R.color.white));
        canvas.drawCircle(width, height, (int) C3623l.m1425a(this.f23406i, 1.5f), this.f23403f);
    }
}