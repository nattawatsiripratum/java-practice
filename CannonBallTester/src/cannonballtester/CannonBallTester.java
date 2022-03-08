package cannonballtester;

public class CannonBallTester {

    public static void main(String[] args) {
        CannonBall ball=new CannonBall(100);
        ball.simulatedFlight();
        System.out.printf("Distance from calculus equation: %.3f\n",ball.calculusFlight(ball.getSimulatedTime()));
    }
}
