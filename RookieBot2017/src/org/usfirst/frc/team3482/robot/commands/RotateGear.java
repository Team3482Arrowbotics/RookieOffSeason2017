package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;
import org.usfirst.frc.team3482.robot.Robot;
import org.usfirst.frc.team3482.robot.subsystems.GearManipulator;

import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.command.Command;

public class RotateGear extends Command{
	private boolean pos = false;
	public void initialize(){
		pos = !pos;
		if(pos){
			Robot.gearManipulator.setToGearPosition();
		} else{
			Robot.gearManipulator.setToUprightPosition();
		}
	}
	public void interrupted(){
		
	}
	
	public void execute(){
		
	}
	
	public void end(){
		System.out.println("End" + RobotMap.gearManipulator.get());
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

}
