package gcu.javaii.interfacesamples;

import java.util.List;

public interface Monster {

    int defaultSpeed = 10;

    /** This will make the bug shoot
     */
    Laser shoot(Fighter fighter);

    /** This will return the bug position
     */
    Position getPosition();

    /** This will make the bug to move to the right
     */
    void xmove();

    /** This will make the bug to move to the left
     */
    void minusxmove();

    /** This will make the bug to attack the main ship
     */
    void descent();

    /** This will happen when a bug is destroyed, returning the score
     */
    int eliminate();


}
