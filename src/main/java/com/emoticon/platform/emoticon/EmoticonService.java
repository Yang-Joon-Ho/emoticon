package com.emoticon.platform.emoticon;

import java.util.List;

public interface EmoticonService {
    public void imageUrlInsert(Long id, String name, String url);
    public List<EmoticonResponseModel> getEmoticonList();
}
