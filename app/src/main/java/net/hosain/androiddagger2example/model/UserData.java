package net.hosain.androiddagger2example.model;

public class UserData {
    private String name;
    private boolean is_friend;
    private double created;
    private boolean hide_from_robots;
    private double created_utc;
    private int link_karma;
    private int comment_karma;
    private boolean is_gold;
    private boolean is_mod;
    private boolean has_verified_email;
    private String id;

    public String getName() {
        return name;
    }

    public boolean isIsFriend() {
        return is_friend;
    }

    public double getCreated() {
        return created;
    }

    public boolean isHideFromRobots() {
        return hide_from_robots;
    }

    public double getCreatedUTC() {
        return created_utc;
    }

    public int getLinkKarma() {
        return link_karma;
    }

    public int getCommentKarma() {
        return comment_karma;
    }

    public boolean isIsGold() {
        return is_gold;
    }

    public boolean isIsMod() {
        return is_mod;
    }

    public boolean isVerifiedEmail() {
        return has_verified_email;
    }

    public String getId() {
        return id;
    }
}