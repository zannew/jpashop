package jpabook.jpashop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) // AUTO는 생략가능
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;


}
