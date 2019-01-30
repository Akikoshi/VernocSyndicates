package com.semjasa.vernocsyndicates.bootstrap;

import com.semjasa.vernocsyndicates.models.*;
import com.semjasa.vernocsyndicates.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {
    private final UserService userService;
    private final PostService postService;
    private final NewsletterService newsletterService;
    private final ArticleService articleService;
    private final AuctionhouseService auctionhouseService;

    public DataLoader(UserService userService
            , PostService postService
            , NewsletterService newsletterService
            , ArticleService articleService
            , AuctionhouseService auctionhouseService)
    {
        this.userService = userService;
        this.postService = postService;
        this.newsletterService = newsletterService;
        this.articleService = articleService;
        this.auctionhouseService = auctionhouseService;
    }

    @Override
    public void run(String... args) throws Exception {

        Rank rank1 = new Rank();

        rank1.setName("Admin");
        rank1.setDescription("Aufganen: Verwaltung und Wartung der Webseite");

        Rank rank2 = new Rank();

        rank2.setName("Support");
        rank2.setDescription("Aufganen: Verwaltung der Benutzer der Webseite");

        System.out.println("Ranks loaded.");

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

        Article article1 = new Article();
        article1.setContent("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        article1.setCreationDate(LocalDate.parse("2017-01-01"));
        article1.setCreator(user1);
        article1.setHeadline("Headline");

        articleService.save(article1);

        Article article2 = new Article();
        article2.setContent("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        article2.setCreationDate(LocalDate.parse("2017-01-01"));
        article2.setCreator(user1);
        article2.setHeadline("Headline1");

        articleService.save(article2);

        Set<Article> articleSet1 = new HashSet<>();
        articleSet1.add(article1);
        articleSet1.add(article2);

        Newsletter newsletter1 = new Newsletter();
        newsletter1.setCreationDate(LocalDate.parse("2017-01-01"));
        newsletter1.setHeadline("News News News");
        newsletter1.setArticles(articleSet1);

        newsletterService.save(newsletter1);

        Article article3 = new Article();
        article3.setContent("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        article3.setCreationDate(LocalDate.parse("2017-01-01"));
        article3.setCreator(user2);
        article3.setHeadline("Headline");

        articleService.save(article3);

        Article article4 = new Article();
        article4.setContent("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
        article4.setCreationDate(LocalDate.parse("2017-01-01"));
        article4.setCreator(user2);
        article4.setHeadline("Headline1");

        articleService.save(article4);

        Set<Article> articleSet2 = new HashSet<>();
        articleSet2.add(article3);
        articleSet2.add(article4);

        Newsletter newsletter2 = new Newsletter();
        newsletter2.setCreationDate(LocalDate.parse("2017-01-01"));
        newsletter2.setHeadline("News News News");
        newsletter2.setArticles(articleSet2);

        newsletterService.save(newsletter2);

        System.out.println("Newsletters loaded.");

        AuctionhouseEntry auctionhouseEntry1 = new AuctionhouseEntry();
        auctionhouseEntry1.setItemName("Helm");
        auctionhouseEntry1.setAmount(1);
        auctionhouseEntry1.setCosts(100);
        auctionhouseEntry1.setUser(user1);
        auctionhouseEntry1.setSellBuyState("WTS");
        auctionhouseEntry1.setOnlineState("Online im Spiel");

        auctionhouseService.save(auctionhouseEntry1);

        AuctionhouseEntry auctionhouseEntry2 = new AuctionhouseEntry();
        auctionhouseEntry2.setItemName("Schulter");
        auctionhouseEntry2.setAmount(4);
        auctionhouseEntry2.setCosts(2000);
        auctionhouseEntry2.setUser(user1);
        auctionhouseEntry2.setSellBuyState("WTS");
        auctionhouseEntry2.setOnlineState("Online im Spiel");

        auctionhouseService.save(auctionhouseEntry2);

        AuctionhouseEntry auctionhouseEntry3 = new AuctionhouseEntry();
        auctionhouseEntry3.setItemName("Brust");
        auctionhouseEntry3.setAmount(2);
        auctionhouseEntry3.setCosts(6000);
        auctionhouseEntry3.setUser(user2);
        auctionhouseEntry3.setSellBuyState("WTB");
        auctionhouseEntry3.setOnlineState("Offline");

        auctionhouseService.save(auctionhouseEntry3);

        System.out.println("Auctionhouse Data  loaded.");
    }
}
