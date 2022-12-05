package controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Id;

public class IdController {
    URL url;
    //private HashMap<String, Id> allIds;
    //private ObjectMapper mapper = new ObjectMapper();
    private List<Id> idlist;
    private ServerController svr = ServerController.shared();
    private Id[] myId;

    public IdController(){
//        url = new URL("http://zipcode.rocks:8085");
    }

    public Id[] getMyId(){
        return myId;
    }
    public List<Id> getIds() {

        if(this.idlist == null) {
            String resultJSON = null;
            resultJSON = svr.idGet("ids");
            final ObjectMapper objectMapper = new ObjectMapper();
            try {
                this.myId = objectMapper.readValue(resultJSON, Id[].class);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
            this.idlist = (List<Id>) Arrays.asList(this.myId);
        }
        return this.idlist;
    }

    public Id postId(Id id) {
//        String body = "";
//        String result = "";
//        try {
//            body = objectMapper.writeValueAsString(id);
//            result = HTTPController.postURL("/ids", body);
//            myId = objectMapper.readValue(result, Id.class);
//            return myId;
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
            return null;
      //  }
    }


    public Id putId(Id id) {
//        String body = "";
//        String result = "";
//        try {
//            body = objectMapper.writeValueAsString(id);
//            result = HTTPController.putURL("/ids", body);
//            myId = objectMapper.readValue(result, Id.class);
//            return myId;
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
            return null;
//        }
    }
 
}