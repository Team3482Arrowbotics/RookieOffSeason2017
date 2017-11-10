package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class RunTalon extends Command{

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	protected void execute(){
		RobotMap.backLeftWheel.set(0.5);
	}
	protected void interrupted(){
		end();
	}
	protected void end(){
		RobotMap.backLeftWheel.set(0);
	}

}
