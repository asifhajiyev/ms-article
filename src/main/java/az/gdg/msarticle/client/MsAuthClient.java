package az.gdg.msarticle.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "ms-auth-client", url = "https://gdg-ms-auth.herokuapp.com")
public interface MsAuthClient {
    @GetMapping("/user/popularity/{userId}")
    void addPopularity(@PathVariable("userId") Integer userId);
}
