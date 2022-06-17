package org.firstinspires.ftc.teamcode.subsystems;


import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.motors.Motor;


public class DuckySpinnerSubsystem extends SubsystemBase{
    private Motor spin;
    public DuckySpinnerSubsystem(Motor spin){
        this.spin=spin;
    }
    public void forward(){
        this.spin.set(0.5);
    }
    public void stop(){
        this.spin.set(0.0);
    }
    public void reverse(){
        this.spin.set(-0.5);
    }
}
