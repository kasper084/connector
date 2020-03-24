package connector.controller;

import connector.entity.Profile;
import connector.service.ProfilesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    private ProfilesServiceImpl profilesService;

    @GetMapping("/")
    public List<Profile> findAll() {
        return profilesService.findAll();
    }
}
