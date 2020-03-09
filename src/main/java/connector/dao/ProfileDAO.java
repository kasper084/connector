package connector.dao;

import connector.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileDAO extends JpaRepository<Profile, Long> {

}
