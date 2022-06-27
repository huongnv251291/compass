package com.ktwapps.digitalcompass.Widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageView;

import java.util.Date;

/* loaded from: classes.dex */
public class CompassView extends AppCompatImageView {

    /* renamed from: i */
    public float f23393i;

    /* renamed from: j */
    long f23394j;

    /* renamed from: k */
    long f23395k;

    /* renamed from: l */
    float f23396l;

    /* renamed from: m */
    float f23397m;

    /* renamed from: n */
    float f23398n;

    /* renamed from: o */
    boolean f23399o = false;

    /* renamed from: p */
    float f23400p = 0.001f;

    /* renamed from: q */
    float f23401q = 3.75f;

    /* renamed from: r */
    float f23402r = 1000.0f;

    public CompassView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    protected boolean m1497c(long j) {
        float f = ((float) (j - this.f23394j)) / 1000.0f;
        float f2 = 0.25f;
        if (f > 0.25f) {
            this.f23394j = Math.round(250.0f) + j;
            f = 0.25f;
        }
        float f3 = ((float) (this.f23394j - this.f23395k)) / 1000.0f;
        if (f3 <= 0.25f) {
            f2 = f3;
        }
        float f4 = (this.f23400p / f) / f2;
        float f5 = this.f23401q / f;
        float sin = this.f23402r * ((float) ((Math.sin(Math.toRadians(this.f23397m)) * Math.cos(Math.toRadians(this.f23393i))) - (Math.sin(Math.toRadians(this.f23393i)) * Math.cos(Math.toRadians(this.f23397m)))));
        float f6 = this.f23393i;
        float f7 = (((((2.0f * f6) - this.f23396l) * f4) + (f6 * f5)) + sin) / (f4 + f5);
        if (!Float.isNaN(f7)) {
            this.f23396l = this.f23393i;
            this.f23393i = f7;
            this.f23395k = this.f23394j;
            this.f23394j = j;
            if (Math.abs(this.f23398n - f7) < 0.1f) {
                return false;
            }
            this.f23398n = this.f23393i;
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m1496d(float f, boolean z) {
        if (z) {
            if (Math.abs(this.f23397m - f) > 0.1f) {
                this.f23397m = f;
                invalidate();
            }
            this.f23399o = true;
            return;
        }
        this.f23393i = f;
        this.f23396l = f;
        this.f23397m = f;
        this.f23398n = f;
        invalidate();
        this.f23399o = false;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f23399o) {
            if (m1497c(new Date().getTime())) {
                setRotation(this.f23393i);
            }
        } else {
            setRotation(this.f23393i);
        }
        super.onDraw(canvas);
        if (this.f23399o) {
            invalidate();
        }
    }
}