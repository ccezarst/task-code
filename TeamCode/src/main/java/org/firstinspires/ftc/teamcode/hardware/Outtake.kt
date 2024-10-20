package org.firstinspires.ftc.teamcode.hardware

import com.qualcomm.hardware.rev.RevTouchSensor
import com.qualcomm.robotcore.eventloop.opmode.Disabled
import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorSimple
import com.qualcomm.robotcore.hardware.HardwareMap
import com.qualcomm.robotcore.hardware.Servo
import com.qualcomm.robotcore.hardware.TouchSensor

import org.firstinspires.ftc.robotcore.external.Telemetry
import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter
import java.util.*
import kotlin.math.absoluteValue
import com.qualcomm.robotcore.hardware.DistanceSensor


/**
 * OutTake subsystem.
 *
 * This class controls the hardware for placing freight
 */

class Outtake(hwMap: HardwareMap) {
    companion object {
    }
    private val backPistons =  BackPistons(hwMap)

    init{
        backPistons.close();
    }
    public var isExtended:Boolean = false;
    fun drop(){
        backPistons.extend();
        isExtended = true;
    }
    fun resetPosition(){
        backPistons.close();
        isExtended = false;
    }
    fun toggle(){
        if(isExtended){
            backPistons.close()
        }else{
            backPistons.extend()
        }
    }




    //SLIDER positions are protected in order to remain private. That's why we use these 3 functions to determine where the slider is
    //relative to target position




}