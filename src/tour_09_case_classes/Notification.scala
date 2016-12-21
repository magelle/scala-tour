package tour_09_case_classes

/**
  * Created by gelle on 21/12/2016.
  */
abstract class Notification
case class Email(sourceEmail: String, title: String, body: String) extends Notification
case class SMS(sourceNumber: String, message: String) extends Notification
case class VoiceRecording(contactName: String, link: String) extends Notification
case class MorseCode(message: String) extends  Notification