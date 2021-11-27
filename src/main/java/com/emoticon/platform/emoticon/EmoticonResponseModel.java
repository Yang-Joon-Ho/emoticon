package com.emoticon.platform.emoticon;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmoticonResponseModel {

    private String name;
    private String url;

    public EmoticonResponseModel(EmoticonUrl emoticonUrl) {
        this.name = emoticonUrl.getName();
        this.url = emoticonUrl.getUrl();
    }
}
