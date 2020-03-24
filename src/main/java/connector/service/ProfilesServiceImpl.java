package connector.service;

import connector.dao.ProfileDAO;
import connector.entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfilesServiceImpl {

    @Autowired
    private ProfileDAO profileDAO;

    public List<Profile> findAll() {
        return profileDAO.findAll();
    }
}
