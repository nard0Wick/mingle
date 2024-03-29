package backend.mingle.services;

import backend.mingle.dto.MeetingDto;
import backend.mingle.models.Meeting;
import backend.mingle.models.User;
import backend.mingle.repos.MeetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingService {
    /*@Autowired
    private MeetingRepo meetingRepo;
    private final UserService userService;

    public MeetingService(UserService userService) {
        this.userService = userService;
    }

    public Meeting createMeeting(String email, MeetingDto newMeeting){
        User user = userService.getUser(email);
        Meeting meeting = new Meeting(
                newMeeting.getTitle(),
                newMeeting.getDate(),
                newMeeting.getResume()
        );
        //updating the relationship
        user.getMeetingSet().add(meeting);
        return meetingRepo.save(meeting);
    }*/
}
