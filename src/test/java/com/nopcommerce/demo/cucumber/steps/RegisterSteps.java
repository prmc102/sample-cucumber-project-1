package com.nopcommerce.demo.cucumber.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
    }

    @And("I enters following users details")
    public void iEntersFollowingUsersDetails(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> user : userList) {
            System.out.println(user);
        }
    }

    @Then("registration successful")
    public void registrationSuccessful() {
    }
}
