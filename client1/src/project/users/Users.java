package project.users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Users {

    public Map<String,String> get_port_ip_by_name(String name) {

        if(name.equals("server")){
        Map<String,String> result=new HashMap<>();
//UID-tvSbz1aKz1
        result.put("RecievePort","5252");
        result.put("FTPPort","2221");
        result.put("IP","127.0.0.1");


        return result;
    }
        return null;
    }

}
