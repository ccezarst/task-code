package org.firstinspires.ftc.teamcode.hardware

import com.qualcomm.robotcore.eventloop.opmode.Disabled
import com.qualcomm.robotcore.hardware.HardwareMap

class Hardware(hwMap: HardwareMap) {
    val motors = DriveMotors(hwMap)
    val outtake = Outtake(hwMap)
    val intake = Intake(hwMap)
    val hangmode = HangMode(hwMap);
    fun stop(){
        motors.stop()

    }
}