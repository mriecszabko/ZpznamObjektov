package szabo.fpv.umb.zpznamobjektov;

import java.util.ArrayList;
import java.util.List;

public class data {
    List<Country> list = new ArrayList<Country>();
    private String km2 = "km\u00B2";


    public List<Country> returnList(){
        list.add(new Country("Slovensko","49 036 "+km2));
        list.add(new Country("Maďarsko", "93 030 "+km2));
        list.add(new Country("Poľsko","312 679 "+km2));
        return list;
    }
}
