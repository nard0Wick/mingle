package backend.mingle.services;

import backend.mingle.dto.UserDto;
import backend.mingle.models.User;
import backend.mingle.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserService {
    /*@Autowired
    private  UserRepo userRepo;

    public Set<User> getAllUsers(){
        return new HashSet<>(userRepo.findAll());
    }

    public User getUser(String email){
        return userRepo.findByEmail(email).orElseThrow(()->
                new RuntimeException("Can find no user related with that email"));
*//*        return new UserDto(
                user.getName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword()
        );*//*
    }

    public User createUser(UserDto newUser){
        if(!userRepo.existsByEmail(newUser.getEmail())) {
            System.out.println("inside if");
            User user = new User(newUser.getName(), newUser.getLastName(), newUser.getEmail(), newUser.getPassword());
            return userRepo.save(user);
        }else{
           throw new RuntimeException("This email is already in use");
        }

    }

    public User updateUser(UserDto userDto){
        User user = userRepo.findByEmail(userDto.getEmail()).orElseThrow(()->
                new RuntimeException("Can find no user related with that email"));

        user.setName(userDto.getName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        return userRepo.save(user);
    }

    public void deleteUser(String email){

    }*/

}
