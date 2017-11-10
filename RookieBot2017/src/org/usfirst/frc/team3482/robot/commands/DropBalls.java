package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DropBalls extends Command{
	public void initialize(){
		Robot.gearManipulator.setToBallPosition();
	}
	public void interrupted(){
		end();
	}
	public void end(){
		Robot.gearManipulator.setToGearPosition();
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}
