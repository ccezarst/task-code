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



class BackPistons(hwMap: HardwareMap) {
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
    private val rightServo = hwMap.servo["backRightServo"] ?: throw Exception("Failed to find backRightServo")
    private val leftServo = hwMap.servo["backLeftServo"] ?: throw Exception("Failed to find backLeftServo")

    private val rightRotationServo = hwMap.servo["backRightRotationServo"] ?: throw Exception("Failed to find backRightRotationServo")
    private val leftRotationServo = hwMap.servo["backLeftRotationServo"] ?: throw Exception("Failed to find backLeftRotationServo")

    init {
        rightServo.position = 0.0;
        leftServo.position = 0.0;
        // so they spin in the same direction
        rightServo.direction = Servo.Direction.FORWARD;
        // why reverse instead of backward??
        // also why not implement backward and make it interchangeable with reverse
        leftServo.direction = Servo.Direction.REVERSE;
        // assuming these are the correct directions
    }
    fun rotate(newPos : Double){
        rightRotationServo.position = newPos;
        leftRotationServo.position = newPos;
    }
    fun extend()
    {
        rightServo.position = 1.0;
        leftServo.position =  1.0;
    }
    fun close()
    {
        rightServo.position = 0.0;
        leftServo.position =  0.0;
    }














}
