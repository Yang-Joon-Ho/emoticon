package com.emoticon.platform.emoticon;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EmoticonServiceImpl implements EmoticonService{

    private final MongoTemplate mongoTemplate;

    public void imageUrlInsert(Long id, String name, String url) {
        EmoticonUrl emoticonUrl = new EmoticonUrl(id, name, url);
        mongoTemplate.insert(emoticonUrl);
    }

    public List<EmoticonResponseModel> getEmoticonList() {
        List<EmoticonUrl> emoticonUrlList = mongoTemplate.findAll(EmoticonUrl.class);

        List<EmoticonResponseModel> emoticonResponseModelList =
                emoticonUrlList.stream().map(EmoticonResponseModel::new)
                .collect(Collectors.toList());

        return emoticonResponseModelList;

    }
}
