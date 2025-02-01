package it.primei;

import it.primei.clients.CommitDataClient;
import lombok.RequiredArgsConstructor;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final CommitDataClient commitDataClient;
    private final Faker faker = new Faker();

    @Value("${it.primei.ccp.url}")
    private String ccpUrl;

    @GetMapping("/")
    public String home(Model model) {
        var message = faker.name().firstName() + ": " + commitDataClient.getMessage();
        model.addAttribute("message", message);
        model.addAttribute("ccpUrl", ccpUrl);
        return "index";
    }
}
