// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4859.lemon;

import org.usfirst.frc4859.lemon.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc4859.lemon.subsystems.*;


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
    public JoystickButton btn8High;
    public JoystickButton btn10Med;
    public JoystickButton btn12Low;
    public JoystickButton btn1Launch;
    public JoystickButton btn1Stop;
    public Joystick joystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick = new Joystick(0);
        
        btn1Stop = new JoystickButton(joystick, 1);
        btn1Stop.whenReleased(new StopLauncher());
        btn1Launch = new JoystickButton(joystick, 1);
        btn1Launch.whileHeld(new LaunchBall());
        btn12Low = new JoystickButton(joystick, 12);
        btn12Low.whenPressed(new LowSpeed());
        btn10Med = new JoystickButton(joystick, 10);
        btn10Med.whenPressed(new MedSpeed());
        btn8High = new JoystickButton(joystick, 8);
        btn8High.whenPressed(new HighSpeed());


        // SmartDashboard Buttons
        SmartDashboard.putData("DriveWithJoyStick", new DriveWithJoyStick());
        SmartDashboard.putData("LowSpeed", new LowSpeed());
        SmartDashboard.putData("MedSpeed", new MedSpeed());
        SmartDashboard.putData("HighSpeed", new HighSpeed());
        SmartDashboard.putData("LaunchBall", new LaunchBall());
        SmartDashboard.putData("StopLauncher", new StopLauncher());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick() {
        return joystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

