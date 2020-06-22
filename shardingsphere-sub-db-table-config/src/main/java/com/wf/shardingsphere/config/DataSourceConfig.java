package com.wf.shardingsphere.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.TableRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.InlineShardingStrategyConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.StandardShardingStrategyConfiguration;
import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Author ：wf
 * @Date ：2020/6/1 11:12
 * @Describe：
 */
@Configuration
public class DataSourceConfig {

    /**
     *
     * @return
     * @throws SQLException
     */
    @Bean
    public DataSource dataSource() throws SQLException {
        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
        shardingRuleConfig.getTableRuleConfigs().add(getInfoObjectHistoryTableRuleConfiguration());
        //相同表分片规则的组，如果表分片规则相同，则可以放在一个组里
        shardingRuleConfig.getBindingTableGroups().add("infoobject_history");
        //广播表
//        shardingRuleConfig.getBroadcastTables().add("t_config");
        // 根据ID分库 一共分为2个库
        shardingRuleConfig.setDefaultDatabaseShardingStrategyConfig(new InlineShardingStrategyConfiguration("id", "ds${id % 2}"));
        // 根据ID分表  一共分为2张表
        shardingRuleConfig.setDefaultTableShardingStrategyConfig(new StandardShardingStrategyConfiguration("id", new ShardingTableAlgorithmConfig()));
        Properties properties = new Properties();
        properties.setProperty("sql.show",Boolean.TRUE.toString());
        return ShardingDataSourceFactory.createDataSource(createDataSourceMap(), shardingRuleConfig, properties);
    }

    /**
     * 主键配生成配置-因用了mybatis-plus，可以不用配置
     * @return
     */
//    private static KeyGeneratorConfiguration getKeyGeneratorConfiguration() {
//        KeyGeneratorConfiguration result = new KeyGeneratorConfiguration("SNOWFLAKE", "id");
//        return result;
//    }

    TableRuleConfiguration getInfoObjectHistoryTableRuleConfiguration() {
        TableRuleConfiguration result = new TableRuleConfiguration("infoobject_history", "ds${0..1}.infoobject_history_${0..1}");
//        result.setKeyGeneratorConfig(getKeyGeneratorConfiguration());
        return result;
    }

    /**
     * 创建数据源的集合
     * @return
     */
    Map<String, DataSource> createDataSourceMap() {
        Map<String, DataSource> result = new HashMap<>();
        result.put("ds0", createDataSource("sharding_0"));
        result.put("ds1", createDataSource("sharding_1"));
        return result;
    }

    /**
     * 创建数据库方案
     * @param dataSourceName
     * @return
     */
    public static DataSource createDataSource(final String dataSourceName) {
        HikariDataSource result = new HikariDataSource();
        result.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
        result.setJdbcUrl(String.format("jdbc:mysql://%s:%s/%s?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8", "10.4.148.135", "3306", dataSourceName));
        result.setUsername("root");
        result.setPassword("123456");
        return result;
    }
}
