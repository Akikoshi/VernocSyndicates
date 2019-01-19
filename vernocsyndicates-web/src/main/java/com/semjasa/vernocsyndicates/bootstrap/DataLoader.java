package com.semjasa.vernocsyndicates.bootstrap;

import com.semjasa.vernocsyndicates.models.Post;
import com.semjasa.vernocsyndicates.models.User;
import com.semjasa.vernocsyndicates.services.PostService;
import com.semjasa.vernocsyndicates.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final UserService userService;
    private final PostService postService;

    public DataLoader(UserService userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setId(1L);
        user1.setFirstName("Thomas");
        user1.setLastName("Heise");

        userService.save(user1);

        User user2 = new User();
        user2.setId(2L);
        user2.setFirstName("Laura");
        user2.setLastName("Leske");

        userService.save(user2);

        System.out.println("Users loaded.");

        Post post1 = new Post();
        post1.setId(1L);
        post1.setUser(user1);
        post1.setPostDate(LocalDate.parse("2018-01-01"));
        post1.setHeadline("Thomas first Post");
        post1.setContent("blablabla");

        postService.save(post1);

        Post post2 = new Post();
        post2.setId(2L);
        post2.setUser(user2);
        post2.setPostDate(LocalDate.now());
        post2.setHeadline("Lauras first Post");
        post2.setContent("Lalala");

        postService.save(post2);

        System.out.println("Posts loaded.");
    }
}
