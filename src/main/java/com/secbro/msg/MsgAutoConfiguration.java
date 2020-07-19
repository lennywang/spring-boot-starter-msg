package com.secbro.msg;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/4 15:33
 */

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 *
 **/
@Configuration
@ConditionalOnClass(MsgService.class)
@EnableConfigurationProperties(MsgProperties.class)
public class MsgAutoConfiguration {
    @Resource
    private MsgProperties msgProperties;

    @Bean
    @ConditionalOnClass(MsgService.class)
    @ConditionalOnProperty(prefix = "msg", value = "enabled", havingValue = "true")
    public MsgService msgService() {
        MsgService msgService = new MsgService(msgProperties.getUrl(), msgProperties.getAccessKeyId(), msgProperties.getAccessKeySecret());
        return msgService;
    }


}
