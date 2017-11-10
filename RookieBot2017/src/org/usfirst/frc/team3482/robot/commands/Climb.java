package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.subsystems.Climber;

import edu.wpi.first.wpilibj.command.Command;

public class Climb extends Command{
	public void initialize(){
		Climber.start();
	}
	public void interrupted(){
		end();
	}
	public void end(){
		Climber.stop();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}
