package ie.atu.openfeign1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "confirmation-service", url = "http://localhost:8081")
public interface RegistrationServiceClient {
    @PostMapping("/confirm-and-register")
    String someDetails(@RequestBody UserDetails userDetails);

}
