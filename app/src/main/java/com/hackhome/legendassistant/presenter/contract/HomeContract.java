package com.hackhome.legendassistant.presenter.contract;


import com.hackhome.legendassistant.bean.BaseBean;
import com.hackhome.legendassistant.bean.HomeResultBean;
import com.hackhome.legendassistant.ui.base.BaseView;

import io.reactivex.Observable;

/**
 * Created by Administrator on 2017/9/19 0019.
 */
public interface HomeContract {

    interface IHomeModel {
        Observable<BaseBean<HomeResultBean>> getHomeResult(String params);
    }

    interface IHomeView extends BaseView {
        void showHomeResult(HomeResultBean homeResultBean);
    }

}
