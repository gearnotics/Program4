/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;


public class TankDrive extends Command {

  public double right, left;
  public TankDrive() {
    requires(Robot.m_drivetrain);
  }

  @Override
  protected void initialize() {
    Robot.m_drivetrain.drive(0,0);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    right = Robot.m_oi.driverController.getRawAxis(5);
    left = Robot.m_oi.driverController.getRawAxis(1);
    // System.out.print(right);
    // System.out.print(" ");
    // System.out.println(left);
    // System.out.println(Robot.m_drivetrain.backLeft.getSpeed());
    Robot.m_drivetrain.drive(left, right);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false; // Runs until interrupted
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    // Robot.m_drivetrain.drive(0, 0);
  }
}
