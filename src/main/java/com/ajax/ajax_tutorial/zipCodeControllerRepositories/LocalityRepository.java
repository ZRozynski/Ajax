package com.ajax.ajax_tutorial.zipCodeControllerRepositories;

import com.ajax.ajax_tutorial.model.Locality;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LocalityRepository {
    private List<Locality> localities;

    public Locality getLocalityByZipCode(String zipCode){
        return  localities.
                stream().
                filter(loc -> loc.equals(zipCode)).
                findAny().
                orElse(null);
    }
    public LocalityRepository() {
        localities = new ArrayList<>();
        localities.add(new Locality("22-500","Hrubieszów"));
        localities.add(new Locality("22-530","Mircze"));
    }

    public List<Locality> getLocalities() {
        return localities;
    }

    public void setLocalities(List<Locality> localities) {
        this.localities = localities;
    }
}
