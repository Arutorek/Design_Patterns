package builder;

public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Small head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("regular torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("large arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("legs");
    }

    public Robot getRobot() {
        return this.robot;
    }
}
