
public class p8_weekstotal_temperature {
    public static void main(String[] args) {
        System.out.println("weekly temperature's update");
        int mon=23;
        int tue=26;
        int wed=25;
        int thur=30;
        int fri=40;
        int sat=33;
        int sun=30;
        int total=mon+tue+wed+thur+fri+sat+sun;
        int avg=((mon+tue+wed+thur+fri+sat+sun)/7);
        System.out.println("total temperature");
        System.out.println(total);
        System.out.println("average temperature");
        System.out.println(avg);
    }
    
}
