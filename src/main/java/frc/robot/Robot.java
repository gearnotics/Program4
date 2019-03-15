/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;

//import frc.robot.commands.Autonomous;
//import frc.robot.subsystems.Claw;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Grabber;
//import frc.robot.subsystems.Elevator;
//import frc.robot.subsystems.Wrist;
import frc.robot.subsystems.Lift;
import frc.robot.subsystems.Shooter;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  

  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";
  //private String m_autoSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();
  int joystickPort = 0;
  Joystick m_joystick = new Joystick(joystickPort);
  int btnActuateSolenoid = 0;
  boolean rodExtended = false;

  //Forward Channel Number for the double solenoid:
  int forwardCN = 0;
  //Reverse Channel Number for the double solenoid:
  int reverseCN = 1;
  //(PCMNodeCN stands for "Pneumatics Control Module Node Channel Number"):
  int PCMNodeCN = 0;
  //For more info on the DoubleSolenoid class, go to this url: https://wpilib.screenstepslive.com/s/currentCS/m/cpp/l/241866-operating-pneumatic-cylinders-solenoids
  //DoubleSolenoid m_solenoid = new DoubleSolenoid(forwardCN, reverseCN);
  //For more info on the compressor class, go to this url: https://wpilib.screenstepslive.com/s/currentCS/m/java/l/599707-operating-a-compressor-for-pneumatics
  Compressor m_compressor = new Compressor(PCMNodeCN);



  Command m_autonomousCommand;

  public static DriveTrain m_drivetrain = new DriveTrain();
  public static Lift m_lift = new Lift();
  public static Shooter m_shooter = new Shooter();
  public static Grabber m_grabber = new Grabber();
  public static OI m_oi;

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    // Initialize all subsystems
    
    
   // m_wrist = new Wrist();
   // m_claw = new Claw();
    m_oi = new OI();
    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    m_chooser.addOption("My Auto", kCustomAuto);
    //Turns the compressor on:
    m_compressor.setClosedLoopControl(true);
    //Makes sure the robot starts with its rod hidden
    //m_solenoid.set(DoubleSolenoid.Value.kReverse);
    SmartDashboard.putData("Auto choices", m_chooser);

    //camera code
    CameraServer.getInstance().startAutomaticCapture(0);
    CameraServer.getInstance().startAutomaticCapture(1);
  }

    // instantiate the command used for the autonomous period m
   // m_autonomousCommand = new Autonomous();

    // Show what command your subsystem is running on the SmartDashboard
    //SmartDashboard.putData(m_grabber);
    //SmartDashboard.putData(m_elevator);
    //SmartDashboard.putData(m_wrist);
    //SmartDashboard.putData(m_claw);
  


  @Override
  public void autonomousInit() {
    this.teleopInit();
    //m_autonomousCommand.start(); // schedule the autonomous command (example)
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    teleopPeriodic();
    //Scheduler.getInstance().run();
    //log();
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    //m_autonomousCommand.cancel();
  }

  /**
   * This function is called periodically during teleoperated mode.
   */
  @Override
  public void teleopPeriodic() {

    Scheduler.getInstance().run();
    log();

      //Code for commencing rod extendus and rod retractus
      // if (m_joystick.getRawButtonPressed(btnActuateSolenoid)) {

      //   if (rodExtended = false) {
      //     //m_solenoid.set(DoubleSolenoid.Value.kForward);
      //     rodExtended = true;
      //   } else {
      //     //m_solenoid.set(DoubleSolenoid.Value.kReverse);
      //     rodExtended = false;
      //   }
  
      // }
      
      //SmartDashboard things for looking at the numbers and stuff.
      SmartDashboard.putBoolean("compressor enabled/disabled: ", m_compressor.enabled());
      SmartDashboard.putBoolean("compressor pressure switch status: ", m_compressor.getPressureSwitchValue());
      SmartDashboard.putNumber("compressor current value: ", m_compressor.getCompressorCurrent());
    }
  

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }

  /**
   * The log method puts interesting information to the SmartDashboard.
   */
  private void log() {
    //m_wrist.log();
    //m_elevator.log();
    //m_drivetrain.log();
    //m_claw.log();
  }
}
