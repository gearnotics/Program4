/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.InstantCommand;
//import frc.robot.Robot;
//import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.Robot;


public class GrabberIn extends InstantCommand {
  public GrabberIn() {
    
    
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_grabber);  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //DoubleSolenoid pitchSolenoid = new DoubleSolenoid(3, 7);

   //pitchSolenoid.set(DoubleSolenoid.Value.kOff);
    //pitchSolenoid.set(DoubleSolenoid.Value.kForward);
    Robot.m_grabber.Close();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
