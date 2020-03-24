package connector.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String city;

    private String gender;

    private String username;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;
}
