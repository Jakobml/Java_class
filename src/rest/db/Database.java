package rest.db;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jane on 2016-01-10.
 */
public class Database {
    private static Database instance = null;

    private Database(){
        this.addressList = new ArrayList<>();
    }

    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    private List<Address> addressList;

    public Address saveAddress(Address address){
        if (address.getId() > 0) {
            addressList.remove(address);
        } else {
            address.setId(getNextAddressId());
        }
        addressList.add(address);

        return address;

    }
    private int getNextAddressId() {
        return addressList.size() + 1;
    }

    public List<Address> findAll() {
        return addressList;
    }
    public Address findOne(int id) {
        for (Address address : addressList) {
            if (id == address.getId()) {
                return address;
            }
        }
        return new Address();
    }
    public void deleteAddress(int id) {
        Address address = findOne(id);
        addressList.remove(address);
    }
}
