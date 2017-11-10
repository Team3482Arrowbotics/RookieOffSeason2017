package org.usfirst.frc.team3482.robot.subsystems;

import org.usfirst.frc.team3482.robot.OI;
import org.usfirst.frc.team3482.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Chassis extends Subsystem{
	public void drive(){
		//create a dead zone for the joysticks to remove possibility of miniscule movements
		double moveValue = OI.controller.getRawAxis(4); //ACTUALLY ROTATES
		double rotateValue = OI.controller.getRawAxis(1); //right stick side-to-side
		double deadZone = 0.1;
		
		if(moveValue < deadZone && moveValue > -deadZone)
			moveValue = 0;
		if(rotateValue < deadZone && rotateValue > -deadZone)
			rotateValue = 0;
		//first parameter is forward/backward value
		
		RobotMap.drive.arcadeDrive(moveValue, -rotateValue);
	}
	public void raceDrive(){
		double moveValue = OI.controller.getRawAxis(3); //right trigger
		double rotateValue = OI.controller.getRawAxis(0); //left stick side-to-side
		double deadZone = 0.1;
		
		if(moveValue < deadZone)
			moveValue = 0;
		if(rotateValue < deadZone)
			rotateValue = 0;
		
		RobotMap.drive.arcadeDrive(moveValue, rotateValue);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
