package com.semjasa.vernocsyndicates.bootstrap;

import com.semjasa.vernocsyndicates.models.Post;
import com.semjasa.vernocsyndicates.models.Rank;
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
        Rank rank1 = new Rank();

        rank1.setName("Admin");
        rank1.setDescription("Aufganen: Verwaltung und Wartung der Webseite");

        Rank rank2 = new Rank();

        rank2.setName("Support");
        rank2.setDescription("Aufganen: Verwaltung der Benutzer der Webseite");

        User user1 = new User();

        user1.setEmail("semjasa0@gmail.com");
        user1.setIngameName("Kniff");
        user1.setUserName("Semjasa");
        user1.setRank(rank1);

        userService.save(user1);

        User user2 = new User();

        user2.setEmail("lauraleske@web.de");
        user2.setUserName("Laura");
        user2.setIngameName("Serafina");
        user2.setRank(rank2);
        userService.save(user2);

        System.out.println("Users loaded.");

        Post post1 = new Post();
        post1.setUser(user1);
        post1.setPostDate(LocalDate.parse("2018-01-01"));
        post1.setHeadline("Thomas first Post");
        post1.setContent("blablabla");

        postService.save(post1);

        Post post2 = new Post();
        post2.setUser(user2);
        post2.setPostDate(LocalDate.now());
        post2.setHeadline("Lauras first Post");
        post2.setContent("Lalala");

        postService.save(post2);

        System.out.println("Posts loaded.");
    }
}
