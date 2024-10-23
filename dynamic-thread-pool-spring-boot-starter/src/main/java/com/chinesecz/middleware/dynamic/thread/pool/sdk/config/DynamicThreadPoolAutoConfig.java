package com.chinesecz.middleware.dynamic.thread.pool.sdk.config;


import com.alibaba.fastjson.JSON;
import com.chinesecz.middleware.dynamic.thread.pool.sdk.domain.DynamicThreadPoolService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/*
    动态配置入口
 */
@Configuration
public class DynamicThreadPoolAutoConfig {
    private final Logger logger = LoggerFactory.getLogger(DynamicThreadPoolAutoConfig.class);

    @Bean("dynamicThreadPoolService")
    public DynamicThreadPoolService dynamicThreadPoolService(ApplicationContext applicationContext, Map<String,ThreadPoolExecutor> threadPoolExecutorMap) {
        String applicationName = applicationContext.getEnvironment().getProperty("spring.application.name");

        if (StringUtils.isBlank(applicationName)) {
            logger.warn("无应用名称");
        }
//
//        Set<String> threadPoolKeys = threadPoolExecutorMap.keySet();
//        for (String threadPoolKey:threadPoolKeys) {
//            ThreadPoolExecutor threadPoolExecutor = threadPoolExecutorMap.get(threadPoolKeys);
//            int poolSize = threadPoolExecutor.getPoolSize();
//            int corePoolSize = threadPoolExecutor.getCorePoolSize();
//            BlockingQueue<Runnable> queue = threadPoolExecutor.getQueue();
//            String simpleName = queue.getClass().getSimpleName();
//
//        }

        logger.info("线程池信息：{}", JSON.toJSONString(threadPoolExecutorMap.keySet()));
        return new DynamicThreadPoolService(applicationName,threadPoolExecutorMap );
    }

}
