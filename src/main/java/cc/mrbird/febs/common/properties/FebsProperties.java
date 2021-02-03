package cc.mrbird.febs.common.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author MrBird
 */
@Data
@SpringBootConfiguration(proxyBeanMethods = false)
@ConfigurationProperties(prefix = FebsProperties.PROPERTIES_PREFIX)
public class FebsProperties {

    public static final String PROPERTIES_PREFIX = "febs";
    public static final String ENABLE_REDIS_CACHE = "febs.enable-redis-cache";

    private ShiroProperties shiro = new ShiroProperties();
    private SwaggerProperties swagger = new SwaggerProperties();
    /**
     * 批量插入提交commit数据量
     */
    private int maxBatchInsertNum = 1000;

    private ValidateCodeProperties code = new ValidateCodeProperties();
    /**
     * 是否开启Redis缓存
     */
    private boolean enableRedisCache;
}
