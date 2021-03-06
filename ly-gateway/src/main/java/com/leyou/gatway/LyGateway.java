/**
 * FlieName:LyGateway
 * Author:  jinliansheng
 * Date:    2019/4/26 0:52
 * Description: 网关服务
 */
package com.leyou.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class LyGateway {
    public static void main(String[] args) {
        SpringApplication.run(LyGateway.class);
    }
}
