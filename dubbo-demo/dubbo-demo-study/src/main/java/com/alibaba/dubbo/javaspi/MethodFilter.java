package com.alibaba.dubbo.javaspi;

/**
 * @Author yxiumei
 * @Data 2020/8/30 16:48
 */
public class MethodFilter implements Filter{

    @Override
    public void invoke() {
        System.out.println("this.method.filter");
    }
}
