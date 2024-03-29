package backend.mingle.controllers;

import backend.mingle.dto.UserDto;
import backend.mingle.models.User;
import backend.mingle.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mingle/users")
public class UserController {
    /*@Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<Object> getAllUsers(){
        return  new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{email}")
    public ResponseEntity<Object> getUser(@RequestParam String email){
        return  new ResponseEntity<>(userService.getUser(email), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> postUser(@RequestBody UserDto userDto){
        return new ResponseEntity<>(userService.createUser(userDto), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Object> putUser(@RequestBody UserDto userDto){
        return new ResponseEntity<>(userService.updateUser(userDto), HttpStatus.OK);
    }*/
    /*@DeleteMapping("/{email}")
    public ResponseEntity<Object> delUser(@RequestParam String email){
        userService.deleteUser(email);
        return new ResponseEntity<>(HttpStatus.OK);
    }*/

}
