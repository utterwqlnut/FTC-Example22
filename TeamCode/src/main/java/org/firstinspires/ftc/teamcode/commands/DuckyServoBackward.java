package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.subsystems.DuckyServo;

public class DuckyServoBackward extends CommandBase {
    private DuckyServo ds;
    public DuckyServoBackward(DuckyServo ds){
        this.ds=ds;
        addRequirements(ds);
    }
    @Override
    public void initialize(){
        ds.backward();
    }
}
