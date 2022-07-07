package com.user.entity;

public class Contact {

    private Long cId;
    private String email;
    private String contactName;
    private Long userID;

    public Contact(Long cId, String email, String contactName, Long userID) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.userID = userID;
    }

    public Contact() {}
    
    public Long getcId() {
        return cId;
    }


}
