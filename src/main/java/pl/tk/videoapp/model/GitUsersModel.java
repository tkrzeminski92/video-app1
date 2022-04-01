package pl.tk.videoapp.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import pl.tk.videoapp.controller.TestController;

import java.util.HashMap;
import java.util.Map;

public class GitUsersModel {

    private String login, avatar_url, gravatarIid, url, htmlUrl, followersUrl;
    private Long id;
    private Logger log = LoggerFactory.getLogger(GitUsersModel.class);

    public GitUsersModel() {
    }

    public GitUsersModel(String login, String avatar_url, String gravatarIid, String url, String htmlUrl, String followersUrl, Long id) {
        this.login = login;
        this.avatar_url = avatar_url;
        this.gravatarIid = gravatarIid;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.followersUrl = followersUrl;
        this.id = id;
    }

    @Override
    public String toString() {
        return "GitUsersModel{" +
                "login='" + login + '\'' +
                ", avatartUrl='" + avatar_url + '\'' +
                ", gravatarIid='" + gravatarIid + '\'' +
                ", url='" + url + '\'' +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", followersUrl='" + followersUrl + '\'' +
                ", id=" + id +
                '}';
    }

    public GitUsersModel test(String login){
        log.info("1");
        RestTemplate restTemplate = new RestTemplate();
        log.info("2");
        String id = "octocat";
        Map map = new HashMap();
        map.put("login",login);
        log.info(restTemplate.getForObject("https://api.github.com/users/{login}", GitUsersModel.class, map).toString());
        return restTemplate.getForObject("https://api.github.com/users/{login}", GitUsersModel.class, map);

    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatartUrl) {
        this.avatar_url = avatartUrl;
    }

    public String getGravatarIid() {
        return gravatarIid;
    }

    public void setGravatarIid(String gravatarIid) {
        this.gravatarIid = gravatarIid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /* {
        "login": "octocat",
            "id": 583231,
            "node_id": "MDQ6VXNlcjU4MzIzMQ==",
            "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4",
            "gravatar_id": "",
            "url": "https://api.github.com/users/octocat",
            "html_url": "https://github.com/octocat",
            "followers_url": "https://api.github.com/users/octocat/followers",
            "following_url": "https://api.github.com/users/octocat/following{/other_user}",
            "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
            "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
            "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
            "organizations_url": "https://api.github.com/users/octocat/orgs",
            "repos_url": "https://api.github.com/users/octocat/repos",
            "events_url": "https://api.github.com/users/octocat/events{/privacy}",
            "received_events_url": "https://api.github.com/users/octocat/received_events",
            "type": "User",
            "site_admin": false,
            "name": "The Octocat",
            "company": "@github",
            "blog": "https://github.blog",
            "location": "San Francisco",
            "email": null,
            "hireable": null,
            "bio": null,
            "twitter_username": null,
            "public_repos": 8,
            "public_gists": 8,
            "followers": 5381,
            "following": 9,
            "created_at": "2011-01-25T18:44:36Z",
            "updated_at": "2022-03-22T14:07:15Z"
    }*/
}
