import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("pk.csv");
        Scanner sc = new Scanner(file);
        City [] cities = new City[158];
        sc.nextLine();
        for (int i=0; i< cities.length; i++){
        String [] input = sc.nextLine().split(",");
        cities[i] = new City(input[0], input[1], input[2], input[3], input[4], input[5]);
        }

        ArrayList<City> Sindh= new ArrayList<>();
        ArrayList<City> Punjab= new ArrayList<>();
        ArrayList<City> KPK= new ArrayList<>();
        ArrayList<City> Balochistan = new ArrayList<>();
        ArrayList<City> Gilgit= new ArrayList<>();
        ArrayList<City> Kashmir= new ArrayList<>();

        for (City city : cities) {
            if (city.getAdmin_name().equals("Sindh"))
                Sindh.add(city);
            else if (city.getAdmin_name().equals("Punjab") || city.getAdmin_name().equals("Islāmābād"))
                Punjab.add(city);
            else if (city.getAdmin_name().equals("Khyber Pakhtunkhwa"))
                KPK.add(city);
            else if (city.getAdmin_name().equals("Balochistān"))
                Balochistan.add(city);
            else if (city.getAdmin_name().equals("Gilgit-Baltistan"))
                Gilgit.add(city);
            else if (city.getAdmin_name().equals("Azad Kashmir"))
                Kashmir.add(city);
        }
        CityFactory cf1 = new CityFactory(Sindh, Punjab, KPK, Balochistan, Gilgit, Kashmir);
        System.out.println(cf1.randomcity("Sindh"));
    }
}
