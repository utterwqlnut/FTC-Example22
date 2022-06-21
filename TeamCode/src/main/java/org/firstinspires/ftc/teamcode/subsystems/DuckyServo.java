package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;

public class DuckyServo extends SubsystemBase {
    private ServoEx servo;
    public DuckyServo(ServoEx servo){
        this.servo = servo;
    }
    public void forward(){
        servo.turnToAngle(90);
    }
    public void backward(){
        servo.turnToAngle(-90);
    }
}
