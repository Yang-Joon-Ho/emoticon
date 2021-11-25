package com.emoticon.platform.apiKey.service;

import com.emoticon.platform.apiKey.domain.AlarmLog;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final MongoTemplate mongoTemplate;

    public void mongoInsert() {
        AlarmLog alarmLog = new AlarmLog(1L, "제목", "메세지");
        mongoTemplate.insert(alarmLog);
    }
}
