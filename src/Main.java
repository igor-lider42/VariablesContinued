public class Main {
    public static void main(String[] args) {
     byte year = 12;
        System.out.println("Значение переменной " + " year " + " с типом " + " byte " + " равно " + 12);
        System.out.println("Значение переменной year с типом  byte равно " + year);
     short month = 30;
        System.out.println("Значение переменной month с типом  hort равно " + month);
     int seconds = 3600;
        System.out.println("Значение переменной seconds с типом  int равно " + seconds);
     long speedOfLight = 300000;
        System.out.println("Значение переменной speedOfLight с типом long равно " + speedOfLight);
     float pai = 3.14f;
        System.out.println("Значение переменной pai с типом float равно " + pai);
     double Pai = 3.14159;
        System.out.println("Значение переменной Pai с типом double равно " + Pai);

        byte h = 67;
        short f = -159;
        int g = 27897;
        long b = 987678965549L;
        float a = 27.12F;
        double c = 2.786;
        char e = 569;
        boolean d = c>3;

        short totalSheets=480;
        byte classLudmila=23;
        byte classAnna=27;
        byte classEkaterina=30;
        int totalStudents=classLudmila+classAnna+classEkaterina;
        int eachSheet=totalSheets/totalStudents;
        System.out.println("На каждого ученика расчитано " + eachSheet + " листов бумаги");

        byte volumeIn2Minutes=16;
        int volumeIn20Minutes=volumeIn2Minutes*10;
        System.out.println("За 20 минут машина произвела бутылок " + volumeIn20Minutes + " штук");
        int volumeInHour=volumeIn2Minutes*30;
        int volumePerDay=volumeInHour*24;
        System.out.println("За сутки машина произвела бутылок " + volumePerDay + " штук");
        int volumePer3Day=volumePerDay*3;
        System.out.println("За 3 суток машина произвела бутылок " + volumePer3Day + " штук");
        int monthlyVolume=volumePerDay*30;
        System.out.println("За месяц машина произвела бутылок " + monthlyVolume + " штук");

        byte whitePaintForOffice=2;
        byte brownPaintForOffice=4;
        int cansOfPaintForOffice=whitePaintForOffice+brownPaintForOffice;
        int numberOfOffices=120/cansOfPaintForOffice;
        int needWhitePaint=whitePaintForOffice*numberOfOffices;
        int needBrownPaint=brownPaintForOffice*numberOfOffices;
       System.out.println("В школе где "+numberOfOffices+" классов, нужно "+needWhitePaint+
               " банок белой краски и "+needBrownPaint+" банок коричневой краски");

       int bananaWeight=80*5;
       int milkWeight=200/100*105;
       int iceCreamWeight=100*2;
       int eegWeight=4*70;
       int breakfastWeightGram=bananaWeight+milkWeight+iceCreamWeight+eegWeight;
       System.out.println("Вес завтрака в граммах составляет "+breakfastWeightGram+" гр");
       float breakfastWeightKg=breakfastWeightGram/1000F;
       System.out.println("Вес завтрака в килограмммах составляет "+breakfastWeightKg+" кг");

       int slowWeightLoss=7000/250;
        System.out.println("При похудении на 250 гр в день, спортсмену для вхождения в свою весовую категорию," +
                " понадобится "+slowWeightLoss+" дней");
        int fastWeightLoss=7000/500;
        System.out.println("При похудении на 500 гр в день, спортсмену для вхождения в свою весовую категорию," +
                " понадобится "+fastWeightLoss+" дней");
        int averageWeightLoss=(slowWeightLoss+fastWeightLoss)/2;
        System.out.println("Среднее время похудении спортсмену для вхождения в свою весовую категорию," +
                " составит "+averageWeightLoss+" день");

        int oldSalaryMasha=67760;
        float newSalaryMasha=oldSalaryMasha*1.1F;
        int oldSalaryMashaYear=oldSalaryMasha*12;
        float newSalaryMashaYear=newSalaryMasha*12F;
        float differenceUnAnnualIncomeMasha=newSalaryMashaYear-oldSalaryMashaYear;
        System.out.println("Маша теперь получает "+newSalaryMasha+" рублей. "+ "Годовой доход вырос на "
                +differenceUnAnnualIncomeMasha+" рублей.");
        int oldSalaryDenis=83690;
        float newSalaryDenis=oldSalaryDenis*1.1F;
        int oldSalaryDenisYear=oldSalaryDenis*12;
        float newSalaryDenisYear=newSalaryDenis*12;
        float differenceUnAnnualIncomeDenis=newSalaryDenisYear-oldSalaryDenisYear;
        System.out.println("Денис теперь получает "+newSalaryDenis+" рублей. "+ "Годовой доход вырос на "
                +differenceUnAnnualIncomeDenis+" рублей.");
        int oldSalaryKristina=76230;
        float newSalaryKristina=oldSalaryKristina*1.1F;
        int oldSalaryKristinaYear=oldSalaryKristina*12;
        float newSalaryKristinaYear=newSalaryKristina*12;
        float differenceUnAnnualIncomeKristina=newSalaryKristinaYear-oldSalaryKristinaYear;
        System.out.println("Денис теперь получает "+newSalaryKristina+" рублей. "+ "Годовой доход вырос на "
                +differenceUnAnnualIncomeKristina+" рублей.");






























    }
}