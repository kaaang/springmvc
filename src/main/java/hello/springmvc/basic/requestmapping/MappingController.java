package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class MappingController {

    @RequestMapping(value = "/hello-basic", method = RequestMethod.GET)
    public String helloBaisc(){
        log.info("helloBasic");
        return "ok";
    }

    @GetMapping(value = "/mapping-get-v2")
    public String mappingGetV2(){
        log.info("mappingGetV1");
        return "ok";
    }

    @GetMapping("/mapping/{userId}")
    public String mappingPath(
            @PathVariable("userId") String data
//            @PathVariable String userId
    ){
        log.info("mappingPath userId={}", data);
        return "ok";
    }

    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(
            @PathVariable String userId,
            @PathVariable Long orderId
    ){
        log.info("mappingPath userId={}, orderId={}", userId, orderId);
        return "ok";
    }

}
