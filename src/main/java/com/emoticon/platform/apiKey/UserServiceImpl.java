package com.emoticon.platform.apiKey;

import com.emoticon.platform.auth.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

    private final MongoTemplate mongoTemplate;
    private final SessionService sessionService;

    public String registerUser(UserRequestModel requestModel) {

        User user = new User(requestModel.getId(), requestModel.getName(), sessionService.create(requestModel));
        mongoTemplate.insert(user);
        return user.getToken();
    }
}
