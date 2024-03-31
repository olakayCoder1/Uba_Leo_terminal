
package db;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Data
 */
public class Data {

    @SuppressWarnings("rawtypes")
    ArrayList<Map> users = new ArrayList<Map>();
    private int[] user_count = {1234,5678,3213,4321,5555};

    public void Data(){ 

        for (int x: user_count){
            Map<String, Object> user = new Map<String,Object>(){

                @Override
                public void clear() {
                    // TODO Auto-generated method stub
                    
                }

                @Override
                public boolean containsKey(Object key) {
                    // TODO Auto-generated method stub
                    return false;
                }

                @Override
                public boolean containsValue(Object value) {
                    // TODO Auto-generated method stub
                    return false;
                }

                @Override
                public Set<Entry<String, Object>> entrySet() {
                    // TODO Auto-generated method stub
                    return null;
                }

                @Override
                public Object get(Object key) {
                    // TODO Auto-generated method stub
                    return null;
                }

                @Override
                public boolean isEmpty() {
                    // TODO Auto-generated method stub
                    return false;
                }

                @Override
                public Set<String> keySet() {
                    // TODO Auto-generated method stub
                    return null;
                }

                @Override
                public Object put(String key, Object value) {
                    // TODO Auto-generated method stub
                    return null;
                }

                @Override
                public void putAll(Map<? extends String, ? extends Object> m) {
                    // TODO Auto-generated method stub
                    
                }

                @Override
                public Object remove(Object key) {
                    // TODO Auto-generated method stub
                    return null;
                }

                @Override
                public int size() {
                    // TODO Auto-generated method stub
                    return 0;
                }

                @Override
                public Collection<Object> values() {
                    // TODO Auto-generated method stub
                    return null;
                }
                // "name" = "Any objedc";
                
            };
            
            user.put("name","any object");
            user.put("pin",x);
            user.put("balance",5555);
            users.add(user);
        }
    }

    public List<Object> login(){
        System.out.println(users);
        try (Scanner scanner = new Scanner(System.in)) {
            int pin = scanner.nextInt();
            for (Map x: users){
                if (x.get("pin").equals(pin)){
                    String name = (String) x.get("name");
                    int balance = (int) x.get("balance");
                    return Arrays.asList(true , name, balance) ;
                }
            }
        }
        return Arrays.asList(false, null , null);
        
    }
    
    
}