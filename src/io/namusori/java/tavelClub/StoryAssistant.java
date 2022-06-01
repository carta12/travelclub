package io.namusori.java.tavelClub;

import io.namusori.java.tavelClub.entity.TravelClub;
import io.namusori.java.tavelClub.util.DateUtil;

public class StoryAssistant {
    public static void main(String[] args) {
        TravelClub newClub = new TravelClub("Jeju Club", "Jeju Travel Club~");
        System.out.println(newClub.getClubName());
    }
}
