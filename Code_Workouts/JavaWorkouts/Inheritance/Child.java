package Code_Workouts.JavaWorkouts.Inheritance;

public class Child extends Parent {
    private int networthc = 15000;
    private String namec = "Peter";
    private int agec = 25;

    Child() {
        super(5);
        System.out.println("Child Class constructor executed");
    }

    public int asserts() {
        return networthc + networthp;
    }

    public int parentsAsserts(){
        return super.asserts();
    }

    public void informationc() {
        System.out.println("Name : " + namec);
        System.out.println("Age : " + agec);
        System.out.println("Parent Name " + namep);
        System.out.println("Networth : " + asserts());
    }
}
