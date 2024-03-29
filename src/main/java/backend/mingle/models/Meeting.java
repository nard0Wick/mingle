package backend.mingle.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "meetings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Meeting {

    @Id
    @Column(name = "meeting_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "meeting_title")
    private String title;

    @Column(name = "meeting_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    @Column(name = "meeting_resume")
    private String resume;

    /*@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "guests",
            joinColumns = @JoinColumn(name = "meeting_id",
                    referencedColumnName = "meeting_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id",
                    referencedColumnName = "user_id"))
    private Set<User> guests;*/

    @OneToMany(mappedBy = "meeting")
    Set<MeetingConfirmedPeople> confirmedPeopleSet;
    public Meeting(String title, Date date, String resume) {
        this.title = title;
        this.date = date;
        this.resume = resume;
    }
}
