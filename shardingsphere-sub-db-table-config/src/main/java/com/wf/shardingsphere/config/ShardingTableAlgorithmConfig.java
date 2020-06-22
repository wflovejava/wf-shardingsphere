package com.wf.shardingsphere.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @Author ：wf
 * @Date ：2020/6/1 11:14
 * @Describe： 通过ID取模分片
 */
public class ShardingTableAlgorithmConfig implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> tableNames, PreciseShardingValue<Long> shardingValue) {

        for (String tableName : tableNames) {
            if(tableName.endsWith(shardingValue.getValue() %2 +"")){
                return tableName;
            }
        }
        throw new RuntimeException("没有需要分的表");
    }
}
