package com.chinesecz.middleware.dynamic.thread.pool.sdk.registry;
/*
    注册中心
 */

import com.chinesecz.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

public interface IRegistry {


    //上报线程池
    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);
    //上报线程池参数
    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
