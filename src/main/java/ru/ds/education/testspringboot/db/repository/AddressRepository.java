package ru.ds.education.testspringboot.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ds.education.testspringboot.db.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
