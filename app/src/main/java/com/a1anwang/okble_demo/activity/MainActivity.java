package com.a1anwang.okble_demo.activity;

import android.view.View;

import com.a1anwang.okble_demo.R;
import com.a1anwang.okble_demo.base.BaseActivity;

/**
 * Created by a1anwang.com on 2018/5/31.
 */

public class MainActivity extends BaseActivity{
    @Override
    public boolean isFullScreen() {
        return false;
    }

    @Override
    public void setContentLayout() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void beforeInitView() {

    }

    @Override
    public void initView() {
        findViewById(R.id.btn_scan).setOnClickListener(this);
        findViewById(R.id.btn_peripheral).setOnClickListener(this);
        findViewById(R.id.btn_scan_beacon).setOnClickListener(this);
        findViewById(R.id.btn_be_beacon).setOnClickListener(this);

    }

    @Override
    public void afterInitView() {

    }

    @Override
    public void onClickEvent(View v) {
        switch (v.getId()){
            case R.id.btn_scan:
                    startActivity(ScanActivity.class);
                break;
            case R.id.btn_peripheral:
                    startActivity(AdvertiseActivity.class);
                break;
            case R.id.btn_scan_beacon:
                startActivity(ScanBeaconActivity.class);
                break;
            case R.id.btn_be_beacon:
                startActivity(BeIBeaconActivity.class);
                break;
        }
    }
}
