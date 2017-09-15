package com.lbz.android.myappplay.presenter.contract;

import com.lbz.android.myappplay.bean.Associational;
import com.lbz.android.myappplay.bean.PageBean;
import com.lbz.android.myappplay.ui.BaseView;

import java.util.List;

import rx.Observable;

/**
 * Created by elitemc on 2017/9/14.
 */

public interface SearchAppContract {

    interface ISearchAppModel {

        Observable<Associational> getAssociational(String keyword);

        Observable<PageBean> getAppListByKeyword(String keyword,int page);

        Observable<List<String>> getHistoryWordList();

    }

    interface SearchAppView extends BaseView{

        void showAssociationalList(List<String> associationalList);

        void showNoDataView(String msg);

        void showAppList(PageBean pageBean);

        void onLoadMoreComplete();

        void showHistoryList(List<String> history);

        void showAssociationalFragment();

        void showSearchHistoryFragment();

    }

}