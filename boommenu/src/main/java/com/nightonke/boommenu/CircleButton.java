package com.nightonke.boommenu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Weiping on 2016/3/19.
 */
public class CircleButton extends FrameLayout {

    private Context mContext;

    private ImageButton imageButton;
    private TextView textView;

    private int radius = (int)Util.getInstance().dp2px(80) / 2;

    public CircleButton(Context context) {
        this(context, null);
    }

    public CircleButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        mContext = context;

        LayoutInflater.from(mContext).inflate(R.layout.circle_button, this, true);
        imageButton = (ImageButton)findViewById(R.id.image);
        textView = (TextView)findViewById(R.id.text);
    }

    public void setDrawable(Drawable drawable) {
        if (imageButton != null) imageButton.setImageDrawable(drawable);
    }

    public void setText(String text) {
        if (textView != null) textView.setText(text);
    }

    @SuppressWarnings("deprecation")
    public void setColor(int color) {
        Util.getInstance().setCircleButtonStateListDrawable(
                imageButton, radius, color, Util.getInstance().getLighterColor(color));
    }
}
