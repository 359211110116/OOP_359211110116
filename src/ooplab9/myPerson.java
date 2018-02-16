package ooplab9;
//ออกสอบไฟนอล

public class myPerson {
    public static void main(String[] args) {
        Person person = new Person("Saowalak", 22,
                new Address("104", "nakhonsrithammarat", "80180"),
                new Job("receptionist", 10000));
        System.out.println(person.toString());

        //edit data of objet
        person.getJob().setSalary(10000);
        System.out.println(person.getJob().getPosition());
        System.out.println(person.getJob().getSalary());


    }///main
}//class
