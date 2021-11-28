package com.emoticon.platform.apiKey;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Document("user")
public class User {

    @Id
    private String id;
    private String name;
    private String token;
}
