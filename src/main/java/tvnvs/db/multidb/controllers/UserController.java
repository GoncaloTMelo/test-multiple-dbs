package tvnvs.db.multidb.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tvnvs.db.multidb.data.models.AUser;
import tvnvs.db.multidb.dto.UserDto;
import tvnvs.db.multidb.service.UserService;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public ResponseEntity<List<AUser>> findUserById() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{idUser}")
    public ResponseEntity<AUser> findUserById(@PathVariable Long idUser) {
        return ResponseEntity.ok(userService.findUserById(idUser));
    }

    @GetMapping("/userName/{userName}")
    public ResponseEntity<List<AUser>> findUserById(@PathVariable String userName) {
        return ResponseEntity.ok(userService.findUserByUserName(userName));
    }

    @PutMapping
    public ResponseEntity<AUser> createUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.createUser(userDto));
    }
}
