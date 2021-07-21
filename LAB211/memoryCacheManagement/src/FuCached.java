import java.util.Date;
import java.util.HashMap;

public class FuCached {
   
    private Object object;
    private Date expiredDate;
    public FuCached(Object object, Date expireDate) {
        this.object = object;
        this.expiredDate = expireDate;
    }
    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
    public Date getExpiredDate() {
        return expiredDate;
    }
    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }


}
