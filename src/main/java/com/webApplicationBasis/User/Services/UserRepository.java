package com.webApplicationBasis.User.Services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.webApplicationBasis.User.Model.*;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByNameAndAndLastName(String name, String lastName);
}