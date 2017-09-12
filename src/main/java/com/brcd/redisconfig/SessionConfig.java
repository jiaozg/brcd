package com.brcd.redisconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by 任彩雨 on 2017/9/11.
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 6000)
public class SessionConfig {

}
