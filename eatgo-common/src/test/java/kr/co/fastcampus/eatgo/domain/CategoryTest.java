package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    public void creation(){
        Category category = Category.builder().name("Korea Food").build();

        assertThat(category.getName(), is("Korea Food"));

    }

}