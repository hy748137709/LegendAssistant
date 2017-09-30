package com.hackhome.legendassistant.commen.rx.subscriber;

import android.content.Context;

import com.hackhome.legendassistant.commen.exception.BaseException;
import com.hackhome.legendassistant.commen.rx.RxErrorHandler;

import io.reactivex.annotations.NonNull;

/**
 * Created by Administrator on 2017/9/27 0027.
 */
public abstract class ErrorHandleSubscriber<T> extends BaseSubscriber<T> {

    protected RxErrorHandler mRxErrorHandler;

    protected Context mContext;

    public ErrorHandleSubscriber(Context context) {

        this.mContext = context;

        mRxErrorHandler = new RxErrorHandler(mContext);
    }

    @Override
    public void onError(@NonNull Throwable e) {
        BaseException baseException = mRxErrorHandler.handleError(e);

        if (null == baseException) {
            e.printStackTrace();
        } else {
            mRxErrorHandler.showErrorMessage(baseException);

        }

    }
}