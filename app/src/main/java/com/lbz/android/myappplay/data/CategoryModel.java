package com.lbz.android.myappplay.data;


import com.lbz.android.myappplay.bean.PageBean;
import com.lbz.android.myappplay.data.http.ApiService;
import com.lbz.android.myappplay.presenter.contract.CategoryContract;

import rx.Observable;

/**
 * Created by elitemc on 2017/7/12.
 */
public class CategoryModel implements CategoryContract.ICategoryModel {


    private ApiService mApiService;

    public CategoryModel(ApiService apiService) {
        this.mApiService = apiService;
    }

    @Override
    public Observable<PageBean> getCategory() {
        return mApiService.getCategory();
    }
}
