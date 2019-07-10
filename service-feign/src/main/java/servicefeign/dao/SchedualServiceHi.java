package servicefeign.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author hgf
 * @Date 2019/7/10
 */
@FeignClient("service-hi")
public interface SchedualServiceHi {
    @GetMapping(value = "/hi")
    String getNameFromServiceHi(@RequestParam(value = "/hi") String name);
}
