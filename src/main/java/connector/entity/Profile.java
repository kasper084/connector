package connector.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Column(name = "job_title")
    private String jobTitle;

    private String department;

    private String company;

    private String skill;

    @OneToOne(mappedBy = "profile")
    private Account account;
}
