package com.edwin.springcloud.service.impl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by wenpuzhao on 2018/11/7.
 */
@Service
public class ScheduleService {

    /**
    *   second (秒), minute（分）, hour （小时）, day of month（日期）, month（月份）, day of week（周几）
    *   例子："0 * * * * MON-FRI"
     *
     *  每隔1分钟去查看服务是否连接正常
    * */
    @Scheduled(cron ="0 0/1 * * * ?") // 每隔1分钟执行一次
    public void ScheduleHealth(){
        System.out.println("hello...");
    }
}
