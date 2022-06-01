package io.namusori.java.tavelClub.entity;

import io.namusori.java.tavelClub.util.DateUtil;

import java.util.UUID;

public class TravelClub {
    private static final int MINIMUM_NAME_LENGTH = 3;
    private static final int MININUM_INTRO_LENGTH = 10;
    private String id;
    private String clubName;
    private String intro;
    private String foundationDay;

    private TravelClub() {
        this.id = UUID.randomUUID().toString();
    }

    public TravelClub(String clubName, String intro) {
        this();
        setClubName(clubName);
        this.intro = intro;
        this.foundationDay = DateUtil.today();
    }

    public void setClubName(String clubName) {
        if(clubName.length() < MINIMUM_NAME_LENGTH) {
            System.out.printf("Club name should be longer the 3");
            return;
        }
        this.clubName = clubName;
    }

    public String getClubName() {
        return clubName;
    }
}
