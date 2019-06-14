/**
 * FlieName:LyitemApplication
 * Author:  jinliansheng
 * Date:    2019/4/26 12:55
 * Description:
 */
package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LyitemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyitemApplication.class);
    }
}
