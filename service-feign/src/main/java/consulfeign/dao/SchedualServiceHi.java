package consulfeign.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author hgf
 * @Date 2019/7/10
 * 调用服务异常触发断路器 SchedualServiceHiHystrix
 */
@FeignClient(value = "service-hi", fallbackFactory = SchedualServiceHiHystrix.class)
public interface SchedualServiceHi {
    @GetMapping(value = "/hi")
    String getNameFromServiceHi(@RequestParam(value = "name") String name);
}
