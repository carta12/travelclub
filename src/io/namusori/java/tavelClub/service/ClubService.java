package io.namusori.java.tavelClub.service;

import io.namusori.java.tavelClub.entity.TravelClub;

public interface ClubService {
    void register(TravelClub travelClub);

    TravelClub[] findAll();
    TravelClub[] findByName(String clubName);
    TravelClub findById(String clubId);

    void modify(TravelClub modifyClub);
    void remove(String clubId);
}