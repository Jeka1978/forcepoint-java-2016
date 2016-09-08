package demo;

import lombok.*;
import neveruseswitch.MailCode;

import java.io.Serializable;

/**
 * Created by Jeka on 07/09/2016.
 */
@Value
@AllArgsConstructor
public class Person implements Serializable{
    private String name;
    private transient int age;


}
