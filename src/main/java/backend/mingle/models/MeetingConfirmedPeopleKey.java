package backend.mingle.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MeetingConfirmedPeopleKey implements Serializable {
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "meeting_id")
    private Long meetingId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeetingConfirmedPeopleKey that = (MeetingConfirmedPeopleKey) o;
        return Objects.equals(userId, that.userId) && Objects.equals(meetingId, that.meetingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, meetingId);
    }
}
