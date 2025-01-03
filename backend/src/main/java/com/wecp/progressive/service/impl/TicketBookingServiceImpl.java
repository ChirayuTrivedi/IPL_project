package com.wecp.progressive.service.impl;
 
import java.util.List;
 
import com.wecp.progressive.dao.TeamDAO;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;
 
public class TicketBookingServiceImpl implements TeamService  {
    private TeamDAO teamDAO;
   
 
    public TicketBookingServiceImpl(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }
 
    @Override
    public List<Team> getAllTeams() {
        return null;
       
    }
 
    @Override
    public int addTeam(Team team) {
        return -1;
    }
 
    @Override
    public List<Team> getAllTeamsSortedByName() {
        return List.of();
    }
   
 
}