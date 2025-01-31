package it.primei.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "commitDataClient", url = "https://whatthecommit.com/index.txt")
public interface CommitDataClient {

    @GetMapping
    String getMessage();
}
