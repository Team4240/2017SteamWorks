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

import org.usfirst.frc4240.Robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc4240.Robot.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton climbBtn;
    public JoystickButton closeBtn;
    public JoystickButton openBtn;
    public JoystickButton downBtn;
    public JoystickButton upBtn;
    public JoystickButton climbCamBtn;
    public JoystickButton gearCamBtn;
    public Joystick logitech;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        logitech = new Joystick(0);
        
        gearCamBtn = new JoystickButton(logitech, 2);
        gearCamBtn.whenPressed(new gearCam());
        climbCamBtn = new JoystickButton(logitech, 1);
        climbCamBtn.whenPressed(new climbCam());
        upBtn = new JoystickButton(logitech, 6);
        upBtn.whileHeld(new clawUp());
        downBtn = new JoystickButton(logitech, 5);
        downBtn.whileHeld(new clawDown());
        openBtn = new JoystickButton(logitech, 7);
        openBtn.whileHeld(new clawOpen());
        closeBtn = new JoystickButton(logitech, 8);
        closeBtn.whileHeld(new clawClose());
        climbBtn = new JoystickButton(logitech, 4);
        climbBtn.whileHeld(new climbRope());


        // SmartDashboard Buttons
        SmartDashboard.putData("DriveWithJoyStick", new DriveWithJoyStick());
        SmartDashboard.putData("AutonomousCommand", new AutonomousCommand());
        SmartDashboard.putData("climbCam", new climbCam());
        SmartDashboard.putData("gearCam", new gearCam());
        SmartDashboard.putData("autoFwdFromWall", new autoFwdFromWall());
        SmartDashboard.putData("autoFwdToPeg", new autoFwdToPeg());
        SmartDashboard.putData("fwdFromWall", new fwdFromWall());
        SmartDashboard.putData("fwdToPeg", new fwdToPeg());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getlogitech() {
        return logitech;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

