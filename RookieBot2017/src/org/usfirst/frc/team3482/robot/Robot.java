package org.usfirst.frc.team3482.robot;

import org.usfirst.frc.team3482.robot.subsystems.Chassis;
import org.usfirst.frc.team3482.robot.subsystems.GearManipulator;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static double talonStartPosition;

	public static Chassis chassis;
	public static GearManipulator gearManipulator;
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {

		RobotMap.init();
		chassis = new Chassis();
		OI.init();
		gearManipulator = new GearManipulator();
	}

	@Override
	public void autonomousInit() {

	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		RobotMap.drive.arcadeDrive(0, 0.6);
	}

	public void teleopInit() {
		
	}
	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		chassis.drive();
		Scheduler.getInstance().run();
		System.out.println(RobotMap.gearManipulator.get());
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {

	}

	public void disabledInit() {
	}
}
