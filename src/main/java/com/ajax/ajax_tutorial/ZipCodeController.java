package com.ajax.ajax_tutorial;

import com.ajax.ajax_tutorial.model.Locality;
import com.ajax.ajax_tutorial.zipCodeControllerRepositories.LocalityRepository;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class ZipCodeController extends HttpServlet {

    @GetMapping("/getLocality/{zipCode}")
    public @ResponseBody Locality getLocality(@PathVariable("zipCode") String zipCode,
                                              @Autowired LocalityRepository localityRepository,
                                              HttpServletResponse response) throws IOException {

        Locality locality = localityRepository.getLocalityByZipCode(zipCode);
        return  locality;
    }
}
