package frc.team5032.robot

import edu.wpi.first.wpilibj.TimedRobot

class Robot : TimedRobot() {
    override fun robotInit() {
        println("Hello World from Kotlin!")
    }

    override fun robotPeriodic() {}

    override fun autonomousInit() {}

    override fun autonomousPeriodic() {}

    override fun autonomousExit() {}

    override fun teleopInit() {}

    override fun teleopPeriodic() {}

    override fun teleopExit() {}

    override fun testInit() {}

    override fun testPeriodic() {}

    override fun testExit() {}
}
