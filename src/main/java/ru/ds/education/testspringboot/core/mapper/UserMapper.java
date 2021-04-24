package ru.ds.education.testspringboot.core.mapper;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;
import ru.ds.education.testspringboot.core.model.AddressDto;
import ru.ds.education.testspringboot.core.model.UserDto;
import ru.ds.education.testspringboot.db.entity.Address;
import ru.ds.education.testspringboot.db.entity.User;

@Component
public class UserMapper extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(User.class, UserDto.class)
                .byDefault()
                .register();
        factory.classMap(Address.class, AddressDto.class)
                .byDefault()
                .register();
    }
}
