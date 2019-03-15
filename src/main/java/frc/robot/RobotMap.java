/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.

  public static final int DRIVETRAIN_LEFT_FRONT_SPARK = 0;
  public static final int DRIVETRAIN_RIGHT_FRONT_SPARK = 1;
  public static final int DRIVETRAIN_LEFT_BACK_SPARK = 2;
  public static final int DRIVETRAIN_RIGHT_BACK_SPARK = 3;
  public static final int DRIVETRAIN_LEFT_BALL_SPARK = 4;
  public static final int DRIVETRAIN_RIGHT_BALL_SPARK = 5;

  public static final int OI_DRIVER_CONTROLLER = 0;
  public static final String DRIVER_CONTROLLER_ROTATE_AXIS = null;
  public static final String DRIVER_CONTROLLER_MOVE_AXIS = null;

  // solenoids
  public static final int LIFT_PITCH_SOLENOID_DEPLOY = 0;
  public static final int LIFT_PITCH_SOLENOID_RETRACT = 1;

  public static final int GRABBER_PITCH_SOLENOID_DEPLOY = 3;
  public static final int GRABBER_PITCH_SOLENOID_RETRACT = 7;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
