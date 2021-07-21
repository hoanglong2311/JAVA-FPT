import java.util.Date;
import java.util.HashMap;

public class FuMemoryCached {
    public static HashMap<String,FuCached> cached = new HashMap<String,FuCached>();

    public boolean putObject(String key, Object object, int timeToLive) {
        if (cached.containsKey(key)) {
            if (cached.containsKey(key)) {
                if (cached.get(key).getExpiredDate().after(new Date())) {
                    
                }
            }

            
        }
        Date expireDate = new Date(System.currentTimeMillis() + timeToLive);
        cached.put(key, new FuCached(object, expireDate));
        return true;
    }

    public static Object getObject(String key){
        if(cached.containsKey(key)){
            if (cached.get(key).getExpiredDate().after(new Date())) {
                return cached.get(key).getObject();
            } else {
                cached.remove(key);
            }
        }
        return null;
    }

    public static boolean clear(String key) {
        if (cached.containsKey(key)) {
            cached.remove(key);
            return true;
        }
        return false;
    }

    public static boolean clearAll() {
        // if (cached.isEmpty()) {
        //     return false;
        // }
        // cached.clear();

        while (!cached.isEmpty()) {
            cached.clear();
        }
        
        return true;
    }
}
