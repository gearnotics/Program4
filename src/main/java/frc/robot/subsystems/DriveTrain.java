/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.AnalogGyro;
//import edu.wpi.first.wpilibj.AnalogInput;
//import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
//import frc.robot.Robot;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {

  public static Spark frontRight =  new Spark(RobotMap.DRIVETRAIN_RIGHT_FRONT_SPARK);
  public static Spark frontLeft= new Spark(RobotMap.DRIVETRAIN_LEFT_FRONT_SPARK);
  public static Spark backRight = new Spark(RobotMap.DRIVETRAIN_RIGHT_BACK_SPARK);
  public static Spark backLeft = new Spark(RobotMap.DRIVETRAIN_LEFT_BACK_SPARK);




  //private final Encoder m_leftEncoder = new Encoder(1, 2);
  //private final Encoder m_rightEncoder = new Encoder(3, 4);
  //private final AnalogInput m_rangefinder = new AnalogInput(6);
//  private final AnalogGyro m_gyro = new AnalogGyro(1);

  /**
   * Create a new drive train subsystem.
   */
  public DriveTrain() {

    // Encoders may measure differently in the real world and in
    // simulation. In this example the robot moves 0.042 barleycorns
    // per tick in the real world, but the simulated encoders
    // simulate 360 tick encoders. This if statement allows for the
    // real robot to handle this difference in devices.
    /*if (Robot.isReal()) {
      m_leftEncoder.setDistancePerPulse(0.042);
      m_rightEncoder.setDistancePerPulse(0.042);
    } else { */
      // Circumference in ft = 4in/12(in/ft)*PI
      //m_leftEncoder.setDistancePerPulse((4.0 / 12.0 * Math.PI) / 360.0);
      //m_rightEncoder.setDistancePerPulse((4.0 / 12.0 * Math.PI) / 360.0);
    }

    // Let's name the sensors on the LiveWindow
    /*addChild("Drive", m_drive);
    addChild("Left Encoder", m_leftEncoder);
    addChild("Right Encoder", m_rightEncoder);
    addChild("Rangefinder", m_rangefinder);
   addChild("Gyro", m_gyro); */
  

  /**
   * When no other command is running let the operator drive around using the
   * PS3 joystick.
   */
  @Override
  public void initDefaultCommand() {
    //setDefaultCommand(new TankDrive());
    LiveWindow.add(frontRight);
    LiveWindow.add(frontLeft);
    LiveWindow.add(backRight);
    LiveWindow.add(backRight);
  }

  /**
   * The log method puts interesting information to the SmartDashboard.
   */


  /**
   * Tank style driving for the DriveTrain.
   *
   * @param left Speed in range [-1,1]
   * @param right Speed in range [-1,1]
   */
  public void drive(double left, double right) {
    System.out.print(right);
    System.out.print(" ");
    System.out.println(left);
    frontRight.set(right);
    frontLeft.set(left);
    backRight.set(right);
    backLeft.set(left);
  }

  /**
   * Tank style driving for the DriveTrain.
   *
   * @param joy The ps3 style joystick to use to drive tank style.
   */
  public void drive(Joystick joy) {
    drive(-joy.getY(), -joy.getThrottle());
  }

  /**
   * Get the robot's heading.
   *
   * @return The robots heading in degrees.
   */
  //public double getHeading() {
   // return m_gyro.getAngle(); }
  

  /**
   * Reset the robots sensors to the zero states.
   */
  public void reset() {
   // m_gyro.reset();
    //m_leftEncoder.reset();
    //m_rightEncoder.reset();
  }

  /**
   * Get the average distance of the encoders since the last reset.
   *
   * @return The distance driven (average of left and right encoders).
   */
 // public double getDistance() {
 //   return (m_leftEncoder.getDistance() + m_rightEncoder.getDistance()) / 2;
 // }

  /**
   * Get the distance to the obstacle.
   *
   * @return The distance to the obstacle detected by the rangefinder.
   */
 // public double getDistanceToObstacle() {
    // Really meters in simulation since it's a rangefinder...
   // return m_rangefinder.getAverageVoltage();
  //}
}
