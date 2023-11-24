package com.mysite.sbb_test;

import com.mysite.sbb_test.article.Article;
import com.mysite.sbb_test.article.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootTest
class SbbTestApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;
	@Test
	@DisplayName("등록")
	void test01() {
		Article a1 = new Article();
		a1.setSubject("안녕하세요");
		a1.setContent("내용입니다.");
		a1.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(a1);
	}

}
