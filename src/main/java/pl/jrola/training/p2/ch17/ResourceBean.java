package pl.jrola.training.p2.ch17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by JrQ- on 2016-03-19.
 */
@Component(value = "resourceBean")
public class ResourceBean {

    @Autowired
    @Value(value = "http://jrola.pl")
    private Resource urlResource;

    @Autowired
    @Value(value = "file:C:\\Users\\JrQ-\\Desktop\\dev\\source\\training\\spring-training\\src\\main\\resources\\text_files\\ch17.txt")
    private Resource fileResource;

    @Autowired
    @Value(value = "classpath:text_files\\ch17.txt")
    private Resource classPathResource;

    public void printResourcesContent() throws IOException {

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(urlResource.getInputStream()));
        System.out.println("URL, resource type: " + urlResource.getClass());
        for(String line = reader1.readLine(); line != null; line = reader1.readLine()) {
            System.out.println(line);
        }

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(fileResource.getInputStream()));
        System.out.println("\n\nFILE, resource type: " + fileResource.getClass());
        for(String line = reader2.readLine(); line != null; line = reader2.readLine()) {
            System.out.println(line);
        }

        BufferedReader reader3 = new BufferedReader(new InputStreamReader(classPathResource.getInputStream()));
        System.out.println("\n\nCLASSPATH, resource type: " + classPathResource.getClass());
        for(String line = reader3.readLine(); line != null; line = reader3.readLine()) {
            System.out.println(line);
        }

    }
}
