package com.emoticon.platform.emoticon;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Document("image_url")
public class EmoticonUrl {

    @Id
    private Long id;
    private String name;
    private String url;

//    private Long getId() {
//        return this.id;
//    }
//
//    private String getName() {
//        return this.name;
//    }
//
//    private String getUrl() {
//        return this.url;
//    }
}
