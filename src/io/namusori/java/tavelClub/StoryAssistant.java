package io.namusori.java.tavelClub;

import io.namusori.java.tavelClub.entity.TravelClub;
import io.namusori.java.tavelClub.ui.menu.ClubMenu;
import io.namusori.java.tavelClub.util.DateUtil;

public class StoryAssistant {
    private  void startStory() {
        ClubMenu clubMenu = new ClubMenu();
        clubMenu.show();
    }
    public static void main(String[] args) {
        StoryAssistant assistant = new StoryAssistant();
        assistant.startStory();
    }
}