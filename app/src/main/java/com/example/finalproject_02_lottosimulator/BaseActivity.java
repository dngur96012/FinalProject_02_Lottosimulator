package com.example.finalproject_02_lottosimulator;

import android.content.Context;

public abstract class BaseActivity {
    public BaseActivity mContext = this;


    public abstract void  setupEvents();
    public abstract void  setValues();
}
