public class Que10 {
    enum DOW{
        Monday,Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) {
        DOW day = DOW.Friday;
//        System.out.println(day.ordinal() + " " +  day.name());
        for (DOW d: DOW.values()
             ) {
            System.out.println(d.ordinal() + " " + d.name());

        }
    }
}
