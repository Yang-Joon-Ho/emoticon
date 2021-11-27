package com.emoticon.platform.emoticon;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/emoticon")
public class EmoticonController {

    private final EmoticonService emoticonService;

    @PutMapping("/url")
    public String insertUrl(@RequestParam Long id, @RequestParam String name, @RequestParam String url) {
        emoticonService.imageUrlInsert(id, name, url);

        return url;
    }

    @GetMapping("/list")
    public List<EmoticonResponseModel> getEmoticonList() {
        return emoticonService.getEmoticonList();
    }
}
