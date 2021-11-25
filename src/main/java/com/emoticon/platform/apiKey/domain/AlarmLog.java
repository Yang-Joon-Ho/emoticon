package com.emoticon.platform.apiKey.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Document("image_url")
public class AlarmLog {

    @Id
    private Long id;
    private String title;
    private String message;
}
