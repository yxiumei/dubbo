package com.alibaba.dubbo.dubbospi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 *  dubbo spi
 * @Author yxiumei
 * @Data 2020/8/30 16:37
 */
public class SpiDome {

    public static void main(String[] args) {

        // ExtensionLoader是整个扩展机制的核心逻辑类,包含配置加载，扩展缓存，只适应对象生成等
        // 1. 参数检查---》2.从缓存中读取ExtensionLoader，如果不存在则创建一个，再从缓存中读取返回
        ExtensionLoader<Filter> extensionLoader = ExtensionLoader.getExtensionLoader(Filter.class);

        // getExtension 获取普通扩展加载类
        Filter filter = extensionLoader.getExtension("url");
        filter.invoke();

    }
}
