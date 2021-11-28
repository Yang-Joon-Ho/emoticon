package com.emoticon.platform.emoticon;

import com.emoticon.platform.apiKey.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Collections;
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

    public List<EmoticonResponseModel> getEmoticonList(String id, String token) {

        Criteria criteria = Criteria.where("id").is(id).and("token").is(token);
        Query query = Query.query(criteria);
        User user = mongoTemplate.findOne(query, User.class);
        if (user == null) {
            return Collections.emptyList();
        }
        List<EmoticonUrl> emoticonUrlList = mongoTemplate.findAll(EmoticonUrl.class);

        List<EmoticonResponseModel> emoticonResponseModelList =
                emoticonUrlList.stream().map(EmoticonResponseModel::new)
                .collect(Collectors.toList());

        return emoticonResponseModelList;

    }
}
