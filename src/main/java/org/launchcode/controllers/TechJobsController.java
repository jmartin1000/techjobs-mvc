package org.launchcode.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {

    static HashMap<String, String> actions = new HashMap<>();

    static HashMap<String, String> columnChoices = new HashMap<>();

    public TechJobsController(){
        actions.put("/search", "Search");
        actions.put("/list", "List");
        columnChoices.put("core competency", "Skill");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("position type", "Position Type");
        columnChoices.put("all", "All");
    }

    @ModelAttribute("actions")
    public static HashMap getActions() {
        return actions;
    }

}
