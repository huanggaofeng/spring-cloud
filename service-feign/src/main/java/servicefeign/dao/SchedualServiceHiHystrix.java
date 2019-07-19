package servicefeign.dao;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author hgf
 * @Date 2019/7/19
 * ServiceHi服务出现异常的调用方法（断路器）
 * 打印错误日志
 */
@Component
public class SchedualServiceHiHystrix implements FallbackFactory<SchedualServiceHi> {

    private static final Logger LOGGER = LoggerFactory.getLogger(SchedualServiceHiHystrix.class);

    @Override
    public SchedualServiceHi create(Throwable throwable) {
        return new SchedualServiceHi() {
            @Override
            public String getNameFromServiceHi(String name) {
                LOGGER.error("ServiceHi异常原因: " + throwable);
                return "service-hi出现异常";
            }
        };
    }
}
