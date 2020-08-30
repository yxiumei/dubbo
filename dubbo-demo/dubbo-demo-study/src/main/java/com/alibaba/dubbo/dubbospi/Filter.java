package com.alibaba.dubbo.dubbospi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 Author yxiumei
 * @Data 2020/8/30 16:42
 */
@SPI
public interface Filter {

    void invoke();

}
