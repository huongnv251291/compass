package com.ktwapps.digitalcompass;

import android.content.Context;

import org.duystudio.compass.R;

import java.text.DecimalFormat;

public class C3623l {
    /* renamed from: a */
    public static float m1425a(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    public static String m1424b(Context context, double d, double d2) {
        int round = (int) Math.round(d2 * 3600.0d);
        int i = round / 3600;
        int abs = Math.abs(round % 3600);
        int i2 = abs / 60;
        int i3 = abs % 60;
        String string = context.getResources().getString(i >= 0 ? R.string.n : R.string.s);
        int round2 = (int) Math.round(d * 3600.0d);
        int i4 = round2 / 3600;
        int abs2 = Math.abs(round2 % 3600);
        int i5 = abs2 / 60;
        int i6 = abs2 % 60;
        String string2 = context.getResources().getString(i4 >= 0 ? R.string.e : R.string.w);
        return Math.abs(i) + "°" + i2 + "'" + i3 + "\" " + string + "   " + Math.abs(i4) + "°" + i5 + "'" + i6 + "\" " + string2;
    }

    /* renamed from: c */
    public static String m1423c(Context context, double d) {
        int round = (int) Math.round(d * 3600.0d);
        int i = round / 3600;
        int abs = Math.abs(round % 3600);
        int i2 = abs / 60;
        int i3 = abs % 60;
        String string = context.getResources().getString(i >= 0 ? R.string.n : R.string.s);
        return Math.abs(i) + "°" + i2 + "'" + i3 + "\" " + string;
    }

    /* renamed from: d */
    public static String m1422d(Context context, double d) {
        int round = (int) Math.round(d * 3600.0d);
        int i = round / 3600;
        int abs = Math.abs(round % 3600);
        int i2 = abs / 60;
        int i3 = abs % 60;
        String string = context.getResources().getString(i >= 0 ? R.string.e : R.string.w);
        return Math.abs(i) + "°" + i2 + "'" + i3 + "\" " + string;
    }

    /* renamed from: e */
    public static String m1421e(Context context, float f) {
        String string = context.getResources().getString(R.string.nw);
        if (f >= 350.0f || f <= 10.0f) {
            return context.getResources().getString(R.string.n);
        }
        if (f < 350.0f && f > 280.0f) {
            return context.getResources().getString(R.string.nw);
        }
        if (f <= 280.0f && f > 260.0f) {
            return context.getResources().getString(R.string.w);
        }
        if (f <= 260.0f && f > 190.0f) {
            return context.getResources().getString(R.string.sw);
        }
        if (f <= 190.0f && f > 170.0f) {
            return context.getResources().getString(R.string.s);
        }
        if (f <= 170.0f && f > 100.0f) {
            return context.getResources().getString(R.string.se);
        }
        if (f <= 100.0f && f > 80.0f) {
            return context.getResources().getString(R.string.e);
        }
        return (f > 80.0f || f <= 10.0f) ? string : context.getResources().getString(R.string.ne);
    }

    /* renamed from: f */
    public static String m1420f(int i, double d) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        if (i == 1) {
            return decimalFormat.format(d * 2.2369d);
        }
        return decimalFormat.format(d * 3.6d);
    }
}