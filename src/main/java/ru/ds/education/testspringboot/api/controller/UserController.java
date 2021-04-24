package ru.ds.education.testspringboot.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ds.education.testspringboot.core.model.UserDto;
import ru.ds.education.testspringboot.core.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserDto addUser(@RequestBody UserDto user){
        return userService.addUser(user);
    }

    @RequestMapping(value ={"{id}"}, method = RequestMethod.GET)
    public UserDto getUser(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

    @GetMapping
    public List<UserDto> getByEmail(@RequestParam String email){
        return userService.getByEmail(email);
    }
}
