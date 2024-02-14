package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Model implements IModel {

    public String getMessage() {
        InputStream in=Model.class.getResourceAsStream("message.txt");
        if (in==null)
            return "erreur";
        try (BufferedReader stream=new BufferedReader(new InputStreamReader(in))){
            return stream.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
