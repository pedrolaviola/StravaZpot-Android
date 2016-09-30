package com.sweetzpot.stravazpot.club.api;

import com.sweetzpot.stravazpot.club.request.GetClubRequest;
import com.sweetzpot.stravazpot.club.request.ListClubAnnouncementsRequest;
import com.sweetzpot.stravazpot.club.rest.ClubRest;
import com.sweetzpot.stravazpot.common.api.StravaAPI;
import com.sweetzpot.stravazpot.common.api.StravaConfig;

public class ClubAPI extends StravaAPI {

    public ClubAPI(StravaConfig config) {
        super(config);
    }

    public GetClubRequest getClub(int clubID) {
        return new GetClubRequest(clubID, getAPI(ClubRest.class), this);
    }

    public ListClubAnnouncementsRequest listClubAnnouncements(int clubID) {
        return new ListClubAnnouncementsRequest(clubID, getAPI(ClubRest.class), this);
    }
}
