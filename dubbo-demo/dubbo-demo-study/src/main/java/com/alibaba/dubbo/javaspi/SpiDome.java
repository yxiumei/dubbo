package com.alibaba.dubbo.javaspi;

import java.util.ServiceLoader;

/**
 *  java spi
 * @Author yxiumei
 * @Data 2020/8/30 16:37
 */
public class SpiDome {

    public static void main(String[] args) {
        // 加载所有实现类，如初始化实现类非常耗时会导致资源浪费
        ServiceLoader<Filter> load = ServiceLoader.load(Filter.class);
        for (Filter filter : load) {
            filter.invoke();
        }
    }
}
