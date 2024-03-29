package backend.mingle.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "meeting_confirmed_people")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MeetingConfirmedPeople {
    @EmbeddedId
    private MeetingConfirmedPeopleKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("meetingId")
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;

    @Column(name = "confirmed_people")
    private Boolean confirmed;

}
