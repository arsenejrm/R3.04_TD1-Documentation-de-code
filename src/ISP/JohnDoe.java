package ISP;

/**
 * This John Doe class represents a person named John Doe.
 * John Doe is an athlete so the John Doe class implements Athlete interface.
 */
public class JohnDoe implements Athlete{

    /**
     * John Doe often competes in competitions against other athletes, so the John Doe class instances compete method from Athlete interface.
     *
     */
    @Override
    public void compete() {
        System.out.println("John Doe started competing");
    }

    /**
     * John Doe can swim, so the John Doe class instances swim method from Athlete interface.
     */
    @Override
    public void swim() {
        System.out.println("John Doe started swimming");
    }

    /**
     * John Doe can perform a high jump, so the John Doe class instances highJump method from Athlete interface.
     */
    @Override
    public void highJump() {
    }

    /**
     * John Doe can perform a long jump, so the John Doe class instances longJump method from Athlete interface.
     */
    @Override
    public void longJump() {
    }
}
