package consulfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import consulfeign.dao.SchedualServiceHi;

/**
 * @Author hgf
 * @Date 2019/7/10
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.getNameFromServiceHi(name) + "----b";
    }
}
