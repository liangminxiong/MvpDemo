package com.project.lmx.mvpmedo.model.home;

import android.support.annotation.NonNull;

import com.project.lmx.sdk.base.BaseModel;
import com.project.lmx.mvpmedo.contract.home.HomeMainContract;

/**
 * Created by Administrator on 2017/9/11.
 * <p>
 * 主页model
 */

public class HomeMainModel extends BaseModel implements HomeMainContract.IHomeMainModel {

    @NonNull
    public static HomeMainModel newInstance() {
        return new HomeMainModel();
    }

    @Override
    public String[] getTabs() {
        return new String[]{"知乎日报", "热点新闻", "微信精选"};
    }
}
