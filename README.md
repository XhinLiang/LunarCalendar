zkconfig-resources [![Build Status](https://travis-ci.org/PhantomThief/zkconfig-resources.svg)](https://travis-ci.org/PhantomThief/zkconfig-resources)
=======================

ZooKeeper节点缓存，基于CuratorFramework封装

* 节点变更时，旧资源清理机制
* 强类型泛型支持
* 只支持Java8

## Get Started

```xml
<dependency>
    <groupId>com.github.phantomthief</groupId>
    <artifactId>zkconfig-resources</artifactId>
    <version>1.1.21</version>
</dependency>
```

```Java
ZkBasedNodeResource<ShardedJedisPool> node = ZkBasedNodeResource.<ShardedJedisPool> newBuilder() //
                .withCacheFactory(ZKPaths.makePath("/redis", monitorPath), ZkClientHolder::get) //
                .withStringFactory(this::initObject) //
                .withCleanup(ShardedJedisPool::close) //
                .build();

ShardedJedisPool pool = node.get();                
```
