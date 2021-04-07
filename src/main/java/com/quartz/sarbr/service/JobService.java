package com.quartz.sarbr.service;

import com.quartz.sarbr.model.JobInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {

    public List<JobInfo> list(){
        List<JobInfo> list = new ArrayList<>();
        CacheService.list().forEach(k->list.add(k.getValue()));
        return list;
    }

    public void save(JobInfo jobInfo){
        CacheService.setCache(jobInfo.getKey(), jobInfo);
    }

    public JobInfo get(String key){
        return CacheService.getCache(key);
    }

}
