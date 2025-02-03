package ISP;

/**
 * This Athlete interface lists every method that an athlete need to implement.
 */
public interface Athlete {

    /**
     * This method allows an athlete to participate in a competition and to compete with other athletes.
     */
    void compete();

    /**
     * This method allows an athlete to swim.
     */
    void swim();

    /**
     * This method allows an athlete to perform a high jump.
     */
    void highJump();

    /**
     * This method allows an athlete to perform a long jump.
     */
    void longJump();
}
