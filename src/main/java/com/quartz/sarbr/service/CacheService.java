package com.quartz.sarbr.service;

import com.quartz.sarbr.model.JobInfo;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CacheService {

    /**
     * 缓存对象
     */
    public static ConcurrentHashMap<String, JobInfo> CACHE_OBJECT_MAP = new ConcurrentHashMap<>();


    /**
     * 全部缓存对象
     */
    public static Set<Map.Entry<String, JobInfo>> list() {
        return CACHE_OBJECT_MAP.entrySet();
    }

    /**
     * 设置缓存对象
     */
    public static void setCache(String cacheKey, JobInfo cacheValue) {
        if(CACHE_OBJECT_MAP == null) {
            CACHE_OBJECT_MAP = new ConcurrentHashMap<>();
        }
        CACHE_OBJECT_MAP.put(cacheKey, cacheValue);
    }
    /**
     * 获取缓存对象
     */
    public static JobInfo getCache(String cacheKey) {
        return CACHE_OBJECT_MAP.getOrDefault(cacheKey, null);
    }

    /**
     * 删除所有缓存
     */
    public static void clear() {
        CACHE_OBJECT_MAP.clear();
    }

    /**
     * 修改某个缓存
     */
    public static void updateCache(String cacheKey, JobInfo cacheValue) {
        CACHE_OBJECT_MAP.replace(cacheKey, cacheValue);
    }

    public static JobInfo createInfo(String param1, String param2, String param3){
        JobInfo jobInfo = new JobInfo();
        jobInfo.setKey(param1);
        jobInfo.setValue(param2);
        jobInfo.setDesc(param3);
        return jobInfo;
    }
}