import java.util.ArrayList;

public class CityFactory {
     ArrayList<City> Sindh;
     ArrayList<City> Punjab;
     ArrayList<City> Balochistan;
     ArrayList<City> Gilgit;
     ArrayList<City> Kashmir;
     ArrayList<City> Kpk;

    public CityFactory(ArrayList<City> Sindh, ArrayList<City> Punjab, ArrayList<City> KPK, ArrayList<City> Balochistan, ArrayList<City> Gilgit, ArrayList<City> Kashmir) {
        setSindh(Sindh);
        setBalochistan(Balochistan);
        setGilgit(Gilgit);
        setKpk(KPK);
        setPunjab(Punjab);
        setKashmir(Kashmir);
    }
     public void setBalochistan(ArrayList<City> balochistan) {
        Balochistan = balochistan;
    }

    public void setGilgit(ArrayList<City> gilgit) {
        Gilgit = gilgit;
    }

    public void setKashmir(ArrayList<City> kashmir) {
        Kashmir = kashmir;
    }

    public void setKpk(ArrayList<City> kpk) {
        Kpk = kpk;
    }

    public void setPunjab(ArrayList<City> punjab) {
        Punjab = punjab;
    }

    public void setSindh(ArrayList<City> sindh) {
        Sindh = sindh;
    }
    public City randomcity (String admin_name) {
        int a = 0;
        if (admin_name.equals("Sindh")) {
            a = (int)(Math.random()* Sindh.size());
        return Sindh.get(a);
        }
        else if (admin_name.equals("KPK")) {
            a = (int)(Math.random()* Kpk.size());
            return Kpk.get(a);
        }
        else if (admin_name.equals("Punjab")) {
            a = (int)(Math.random()* Punjab.size());
            return Punjab.get(a);
        }
        else if (admin_name.equals("Balochistan")) {
            a = (int)(Math.random()* Balochistan.size());
            return Balochistan.get(a);
        }
        else if (admin_name.equals("Kashmir")) {
            a = (int)(Math.random()* Kashmir.size());
            return Kashmir.get(a);
        }
        else if (admin_name.equals("Gilgit")) {
            a = (int)(Math.random()* Gilgit.size());
            return Gilgit.get(a);
        }
    else {System.out.println("Province name is wrong.");
    return null;
    }
    }
}
