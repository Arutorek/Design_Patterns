package adapter;

public class TheEnemyAttackers {

    public static void main(String[] args) {
        EnemyTank T32 = new EnemyTank();

        EnemyRobot evilRobot = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(evilRobot);

        System.out.println("The Robot");

        evilRobot.reactToHuman("Paul");
        evilRobot.walkForward();
        evilRobot.smashWithHands();

        System.out.println("The Enemy Tank");

        T32.assignDriver("Frank");
        T32.driveForward();
        T32.fireWeapon();

        System.out.println("The Robot with Adapter");
        robotAdapter.assignDriver("mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
