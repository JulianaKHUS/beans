package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.model.Post;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository {
    List all();

    Optional getById(long id);

    Post save(Post post);

    void removeById(long id);
}