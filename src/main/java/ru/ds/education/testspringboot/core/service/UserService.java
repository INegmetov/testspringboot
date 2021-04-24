package ru.ds.education.testspringboot.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ds.education.testspringboot.core.mapper.AddressMapper;
import ru.ds.education.testspringboot.core.mapper.UserMapper;
import ru.ds.education.testspringboot.core.model.UserDto;
import ru.ds.education.testspringboot.db.entity.User;
import ru.ds.education.testspringboot.db.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public UserDto addUser(UserDto user){

        User userNew = userMapper.map(user, User.class);
        userNew = userRepository.save(userNew);
        user = userMapper.map(userNew, UserDto.class);
        return user;
    }

    public UserDto getUser(Long id){
        User user = userRepository.getOne(id);
        return  userMapper.map(user, UserDto.class);
    }

    public List<UserDto> getByEmail (String email){

        List<User>userList = userRepository.findByEmail(email);
        List<UserDto> result = userMapper.mapAsList(userList, UserDto.class);
        return result;
    }
}
