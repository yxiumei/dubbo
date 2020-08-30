package com.alibaba.dubbo.dubbospi;


/**
 * @Author yxiumei
 * @Data 2020/8/30 16:48
 */
public class UrlFilter implements Filter{

    @Override
    public void invoke() {
        System.out.println("this.url.filter");
    }
}
