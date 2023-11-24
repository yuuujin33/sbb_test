package com.mysite.sbb_test.article;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public Article getList(Integer id) {
        Optional <Article> article = this.articleRepository.findById(id);
        return article.get();
    }
}
