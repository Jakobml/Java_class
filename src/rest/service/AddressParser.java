package rest.service;

import rest.db.Address;

/**
 * Created by jane on 2016-02-17.
 */
public class AddressParser {
    public static Address parse(String addressString) {
        Address address = new Address();
        addressString = addressString.replace("{", "").replace("}", "");
        String[] keyValuePairs = addressString.split(",");
        for (String keyValuePair : keyValuePairs) {
            String[] keyValue = keyValuePair.split(":");

        }
        return address;
    }

    public static void main(String[] args) {
        String testString = "{name:\"Jörgen\",postalCode:\"12345\"}";
        Address testAddress = parse(testString);
        System.out.println(testAddress.getName());
        System.out.println(testAddress.getPostalCode());
    }
}
