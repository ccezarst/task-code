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



class BottomWeight(hwMap: HardwareMap) {
    companion object {

    }
    /**if x ==1
    {ok=1
    } else ok =0

     if x==1 ? ok=1 : ok=0
     if x==1 ok=1 ?: ok=0

     telemtry -- mod de afisare a datelor pt un cod
     Exception-- erori
     **/
    // treat as a high-current led :)
    private val eMag = hwMap.led["bottomMagnet"] ?: throw Exception("Failed to find bottomMagnet")


    init {
        eMag.enable();
    }
    fun release(){
        eMag.close();
    }














}
