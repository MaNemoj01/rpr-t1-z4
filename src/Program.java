public class Program {

    public static void main(String[] args) {

        Student s1 = new Student("Huso", "Husic" , 007);
        Student s2 = new Student("Mujo", "Mujic" , 16000);
        Student s3 = new Student("Sara", "Saric", 17000);
        Student s4 = new Student("Thierry", "Henry ", 14);

        Predmet p1 = new Predmet("Razvoj Programskih Rjesenja", 159753 , 3);


        p1.upisi(s1);
        p1.upisi(s2);
        p1.upisi(new Student("Pero", "Peric", 123123));


        p1.ispisSpiskaSvihStudenata();
        System.out.println("----------------------------");

        p1.ispisi(s3);
        p1.ispisi(s1);

        System.out.println(s4);
        p1.upisi(s4);
        System.out.println("----------------------------");
        p1.ispisSpiskaSvihStudenata();
        System.out.println("----------------------------");

        p1.upisi(s1);


    }
}
