package app.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public abstract class Animal {
    @Autowired
    @Qualifier("dog")
    private Dog dog;


}
