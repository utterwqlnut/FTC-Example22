package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.Command;
import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.subsystems.DuckyServo;

public class DuckyServoForward extends CommandBase {
    private DuckyServo ds;
    public DuckyServoForward(DuckyServo ds){
        this.ds=ds;
        addRequirements(ds);
    }
    @Override
    public void initialize(){
        ds.forward();
    }


}
