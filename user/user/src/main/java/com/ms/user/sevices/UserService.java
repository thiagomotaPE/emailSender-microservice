package com.ms.user.sevices;

import com.ms.user.models.UserModel;
import com.ms.user.producers.UserProducer;
import com.ms.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserProducer userProducer;

    @Transactional
    public UserModel save(UserModel userModel) {
        var newUserModel = userRepository.save(userModel);
        userProducer.publishMessageEmail(newUserModel);

        return newUserModel;
    }
}
