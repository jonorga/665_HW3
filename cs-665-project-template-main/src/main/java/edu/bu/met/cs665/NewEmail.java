/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/23/2023
 * File Name: Customer.java
 * Description: This file contains the Customer class, it contains a CreateEmailBehavior object and a method to 
 * return the email that was generated
 */
 
package email_generator;

public class NewEmail implements CreateEmailBehavior {
    
    /**
     * This method gets the email from the create email behavior
     * @return String
     */
    public String CreateEmail() {
        return "Welcome! we are reaching out regarding our new business partnership.";
    }
}