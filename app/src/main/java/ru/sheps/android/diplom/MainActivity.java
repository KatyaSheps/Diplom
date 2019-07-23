package ru.sheps.android.diplom;

import android.app.Service;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity //implements View.OnFocusChangeListener, View.OnKeyListener //
 {
     private static final String TAG = "LoginActivity";
     EditText enter_mpin;
     ImageView i1, i2, i3, i4;
//    private EditText mPinFirstDigitEditText;
//    private EditText mPinSecondDigitEditText;
//    private EditText mPinThirdDigitEditText;
//    private EditText mPinForthDigitEditText;
//    private EditText mPinHiddenEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1 = (ImageView) findViewById(R.id.imageview_circle1);
        i2 = (ImageView) findViewById(R.id.imageview_circle2);
        i3 = (ImageView) findViewById(R.id.imageview_circle3);
        i4 = (ImageView) findViewById(R.id.imageview_circle4);

        enter_mpin = (EditText) findViewById(R.id.editText_enter_mpin);
        enter_mpin.requestFocus();
        enter_mpin.setInputType(InputType.TYPE_CLASS_NUMBER);
        enter_mpin.setFocusableInTouchMode(true);

        enter_mpin.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d(TAG, "onKey: screen key pressed");
                i1.setImageResource(R.drawable.circle2);
            }
        });
    }


//        init();
//        setPINListeners();
    }


//    private void setPINListeners() {
//        mPinFirstDigitEditText.setOnFocusChangeListener(this);
//        mPinSecondDigitEditText.setOnFocusChangeListener(this);
//        mPinThirdDigitEditText.setOnFocusChangeListener(this);
//        mPinForthDigitEditText.setOnFocusChangeListener(this);
//
//        mPinFirstDigitEditText.setOnKeyListener(this);
//        mPinSecondDigitEditText.setOnKeyListener(this);
//        mPinThirdDigitEditText.setOnKeyListener(this);
//        mPinForthDigitEditText.setOnKeyListener(this);
//        mPinHiddenEditText.setOnKeyListener(this);
//    }
//
//    private void init() {
//        mPinFirstDigitEditText = (EditText) findViewById(R.id.pin_first_edittext);
//        mPinSecondDigitEditText = (EditText) findViewById(R.id.pin_second_edittext);
//        mPinThirdDigitEditText = (EditText) findViewById(R.id.pin_third_edittext);
//        mPinForthDigitEditText = (EditText) findViewById(R.id.pin_forth_edittext);
//        mPinHiddenEditText = (EditText) findViewById(R.id.pin_hidden_edittext);
//    }
//
//    @Override
//    public void onFocusChange(View v, boolean hasFocus) {
//        final int id = v.getId();
//        switch (id) {
//            case R.id.pin_first_edittext:
//                if (hasFocus) {
//                    setFocus(mPinHiddenEditText);
//                    showSoftKeyboard(mPinHiddenEditText);
//                }
//                break;
//
//            case R.id.pin_second_edittext:
//                if (hasFocus) {
//                    setFocus(mPinHiddenEditText);
//                    showSoftKeyboard(mPinHiddenEditText);
//                }
//                break;
//
//            case R.id.pin_third_edittext:
//                if (hasFocus) {
//                    setFocus(mPinHiddenEditText);
//                    showSoftKeyboard(mPinHiddenEditText);
//                }
//                break;
//
//            case R.id.pin_forth_edittext:
//                if (hasFocus) {
//                    setFocus(mPinHiddenEditText);
//                    showSoftKeyboard(mPinHiddenEditText);
//                }
//                break;
//            default:
//                break;
//        }
//    }
//
//    public void showSoftKeyboard(EditText editText) {
//        if (editText == null)
//            return;
//
//        InputMethodManager imm = (InputMethodManager) getSystemService(Service.INPUT_METHOD_SERVICE);
//        imm.showSoftInput(editText, 0);
//    }
//
//    public static void setFocus(EditText editText) {
//        if (editText == null)
//            return;
//
//        editText.setFocusable(true);
//        editText.setFocusableInTouchMode(true);
//        editText.requestFocus();
//    }
//
//    @Override
//    public boolean onKey(View v, int keyCode, KeyEvent event) {
//        if (event.getAction() == KeyEvent.ACTION_DOWN) {
//            final int id = v.getId();
//            switch (id) {
//                case R.id.pin_hidden_edittext:
//                    if (keyCode == KeyEvent.KEYCODE_DEL) {
//                        if (mPinHiddenEditText.getText().length() == 4)
//                            mPinForthDigitEditText.setText("");
//                        else if (mPinHiddenEditText.getText().length() == 3)
//                            mPinThirdDigitEditText.setText("");
//                        else if (mPinHiddenEditText.getText().length() == 2)
//                            mPinSecondDigitEditText.setText("");
//                        else if (mPinHiddenEditText.getText().length() == 1)
//                            mPinFirstDigitEditText.setText("");
//
//                        if (mPinHiddenEditText.length() > 0)
//                            mPinHiddenEditText.setText(mPinHiddenEditText.getText().subSequence(0, mPinHiddenEditText.length() - 1));
//
//                        return true;
//                    }
//
//                    break;
//
//                default:
//                    return false;
//            }
//        }
//
//        return false;
//    }
//
//    @SuppressWarnings("deprecation")
//    public void setViewBackground(View view, Drawable background) {
//        if (view == null || background == null)
//            return;
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//            view.setBackground(background);
//        } else {
//            view.setBackgroundDrawable(background);
//        }
//    }

//    public class MainLayout extends LinearLayout {
//
//        public MainLayout(Context context, AttributeSet attributeSet) {
//            super(context, attributeSet);
//            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            inflater.inflate(R.layout.activity_main, this);
//        }
//
//        @Override
//        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//            final int proposedHeight = MeasureSpec.getSize(heightMeasureSpec);
//            final int actualHeight = getHeight();
//
//            Log.d("TAG", "proposed: " + proposedHeight + ", actual: " + actualHeight);
//
//            if (actualHeight >= proposedHeight) {
//                // Keyboard is shown
//                if (mPinHiddenEditText.length() == 0)
//                    setFocusedPinBackground(mPinFirstDigitEditText);
//                else
//                    setDefaultPinBackground(mPinFirstDigitEditText);
//            }
//
//            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        }
//    }

//    private void setDefaultPinBackground(EditText editText) {
//        setViewBackground(editText, getResources().getDrawable(R.drawable.textfield_default_holo_light));
//    }
// }


