package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts
    List<Contact> list = List.of(
            new Contact(1l, "amit@gmail.com", "Amit", 1311L),
            new Contact(2l, "anil@gmail.com", "Anil", 1311L),
            new Contact(3l, "ram@gmail.com", "Ram", 1312L),
            new Contact(4l, "sam@gmail.com", "Sam", 1313L)
    );

    @Override
    public List<Contact> getContactsofUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
