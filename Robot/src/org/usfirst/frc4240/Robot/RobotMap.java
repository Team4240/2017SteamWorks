// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc4240.Robot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Ultrasonic;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.ADXL362;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import com.ctre.*;
import com.kauailabs.navx.*;
import com.kauailabs.navx.frc.AHRS;
import com.kauailabs.*;
import com.kauailabs.navx.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainRightFrontMotor;
    public static CANTalon driveTrainRightRearMotor;
    public static CANTalon driveTrainLeftFrontMotor;
    public static CANTalon driveTrainLeftRearMotor;
    public static RobotDrive driveTrainRobotDrive;
    public static Encoder driveTrainQuadratureEncoder1;
    public static Ultrasonic driveTrainUltrasonic2;
    public static Ultrasonic driveTrainUltrasonic1;
    public static CANTalon shooterShooter;
    public static CANTalon feederFeederMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
//    public static ADXRS450_Gyro driveTrainGyro;
//    public static Accelerometer driveTrainAccel;
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainRightFrontMotor = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "RightFrontMotor", driveTrainRightFrontMotor);
        
        driveTrainRightRearMotor = new CANTalon(4);
        LiveWindow.addActuator("DriveTrain", "RightRearMotor", driveTrainRightRearMotor);
        
        driveTrainLeftFrontMotor = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "LeftFrontMotor", driveTrainLeftFrontMotor);
        
        driveTrainLeftRearMotor = new CANTalon(2);
        LiveWindow.addActuator("DriveTrain", "LeftRearMotor", driveTrainLeftRearMotor);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainRightRearMotor, driveTrainRightFrontMotor,
              driveTrainLeftRearMotor, driveTrainLeftFrontMotor);
        
        driveTrainRobotDrive.setSafetyEnabled(false);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        driveTrainQuadratureEncoder1 = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "Quadrature Encoder 1", driveTrainQuadratureEncoder1);
        driveTrainQuadratureEncoder1.setDistancePerPulse(1.0);
        driveTrainQuadratureEncoder1.setPIDSourceType(PIDSourceType.kRate);
        driveTrainUltrasonic2 = new Ultrasonic(0, 1);
        LiveWindow.addSensor("DriveTrain", "Ultrasonic 2", driveTrainUltrasonic2);
        
        driveTrainUltrasonic1 = new Ultrasonic(4, 5);
        LiveWindow.addSensor("DriveTrain", "Ultrasonic 1", driveTrainUltrasonic1);
        
        shooterShooter = new CANTalon(8);
        LiveWindow.addActuator("Shooter", "Shooter", shooterShooter);
        
        feederFeederMotor = new CANTalon(0);
        LiveWindow.addActuator("Feeder", "FeederMotor", feederFeederMotor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    
  //      driveTrainGyro = new ADXRS450_Gyro();
    //    driveTrainGyro.reset();
      //  driveTrainAccel = new ADXL362(Accelerometer.Range.k4G);
    }
}
