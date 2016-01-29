package Week_01;

public class Main {

    public static void main(String[] args) {

        String cityName = "Columbus";
        int zipCode = 43215;
        int[] highTemps = {32, 25, 27, 40, 45};

        double average = highTemps[0];
        average += highTemps[1];
        average += highTemps[2];
        average += highTemps[3];
        average += highTemps[4];
        average /= 5;

        System.out.println("City: " + cityName);
        System.out.println("Zip code: " + zipCode);
        System.out.println("Average high: " + average);

    }
}
