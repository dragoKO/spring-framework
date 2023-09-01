package com.tesla;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor // if only 1 constructor injection will be done automatically (but u must assign value to the object in this constructor)
public class Java {

    //Field Injection

//    @Autowired
//    OfficeHours officeHours;


    //Constructor Injection
    OfficeHours officeHours;

//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }
}
