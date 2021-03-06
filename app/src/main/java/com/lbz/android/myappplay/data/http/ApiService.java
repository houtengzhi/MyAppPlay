package com.lbz.android.myappplay.data.http;

import com.lbz.android.myappplay.bean.AppDownloadInfo;
import com.lbz.android.myappplay.bean.Associational;
import com.lbz.android.myappplay.bean.BaseHttpResultBean;
import com.lbz.android.myappplay.bean.LoginBean;
import com.lbz.android.myappplay.bean.PageBean;
import com.lbz.android.myappplay.bean.requestbean.LoginRequestBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by lbz on 2017/7/12.
 */
public interface ApiService {


    String BASE_URL = "http://app.market.xiaomi.com/";

    String ICON_BASE_URL = "http://file.market.xiaomi.com/mfc/thumbnail/png/w150q80/";

    @GET("apm/toplist")
    Observable<PageBean> topList(@Query("page") int page);

    @POST("login")
    Observable<BaseHttpResultBean<LoginBean>> login(@Body LoginRequestBean requestBean);

    @GET("apm/category")
    Observable<PageBean> getCategory();

    @GET("apm/category/{category_id}")
    Observable<PageBean> getCategory(@Path("category_id") int category_id);

    @GET("apm/featured/")
    Observable<PageBean> getIndexAppData(@Query("page") int page);

    @GET("apm/topfeatured/top")
    Observable<PageBean> getIndexTopTheme();

    @GET("apm/topfeatured/top/{category_id}")
    Observable<PageBean> getIndexTopTheme(@Path("category_id") int category_id);

    @GET("/apm/featured/{category_id}")
    Observable<PageBean> getFeaturedAppsByCategory(@Path("category_id") int category_id, @Query("page") int page);

    @GET("/apm/toplist/category/{category_id}")
    Observable<PageBean> getTopListAppsByCategory(@Path("category_id") int category_id, @Query("page") int page);

    @GET("/apm/updatelist/category/{category_id}")
    Observable<PageBean> getNewListAppsByCategory(@Path("category_id") int category_id, @Query("page") int page);

    @GET("/apm/hotfeatured/")
    Observable<PageBean> getHotAppList(@Query("page") int page);

    @GET("/apm/hotsubject/")
    Observable<PageBean> getSubjectList(@Query("page") int page);

    @GET("/apm/subject/{subject_id}")
    Observable<PageBean> getAppListBySubject(@Path("subject_id") int subject_id, @Query("page") int page);

    @GET("/apm/app/id/{app_id}")
    Observable<PageBean> getAppDetailById(@Path("app_id") int app_id);

    @GET("/apm/samedev/")
    Observable<PageBean> getSameDevAppList(@Query("appId") int appid, @Query("page") int page);

    @GET("/apm/search/suggest/")
    Observable<Associational> getAssociationalList(@Query("keyword") String keyword);

    @GET("/apm/search/")
    Observable<PageBean> getAppListByKeyword(@Query("keyword") String keyword, @Query("page") int page);

    @GET("/apm/download/{id}")
    Observable<AppDownloadInfo> getAppDownloadInfo(@Path("id") int id);

    @POST("/apm/updateinfo/v2/")
    @FormUrlEncoded
    Observable<PageBean> getCanUpdateAppList(@FieldMap Map<String, String> fields);

}
