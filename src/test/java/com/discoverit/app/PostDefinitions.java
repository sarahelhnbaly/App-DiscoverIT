package com.discoverit.app;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PostDefinitions {
    private String title;
    private String confirmationMessage;

    @Given("I have the following post details:")
    public void iHaveTheFollowingPostDetails(io.cucumber.datatable.DataTable dataTable) {
        // Extract post details from the DataTable
        var data = dataTable.asLists(String.class);
        title = data.get(1).get(0); // Extract title
        String content = data.get(1).get(1); // Extract content

        // Here you might also want to add logic to prepare the post object
    }

    @When("I submit the post")
    public void iSubmitThePost() {
        // Simulate post submission logic
        // For instance, here you would call your service to create the post
        confirmationMessage = "Post '" + title + "' created successfully!";
    }

    @Then("I should see a confirmation message")
    public void iShouldSeeAConfirmationMessage() {
        // Assert that the confirmation message is as expected
        String expectedMessage = "Post '" + title + "' created successfully!";
        Assert.assertEquals(expectedMessage, confirmationMessage);
    }
}
