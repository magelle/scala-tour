package tour_09_case_classes

/**
  * Created by gelle on 21/12/2016.
  */
object Main extends App{
  val emailFromJohn = Email("john.doe@mail.com", "Greetings From John!", "Hello World!")

  val title = emailFromJohn.title
  println(title) // prints "Greetings From John!"

  // emailFromJohn.title = "Goodbye From John!" // This is a compilation error. We cannot assign another value to val fields, which all case classes fields are by default.

  val editedEmail = emailFromJohn.copy(title = "I am learning Scala!", body = "It's so cool!")
  println(emailFromJohn) // prints "Email(john.doe@mail.com,Greetings From John!,Hello World!)"
  println(editedEmail) // prints "Email(john.doe@mail.com,I am learning Scala,It's so cool!)"

  val firstSms = SMS("12345", "Hello!")
  val secondSms = SMS("12345", "Hello!")

  if (firstSms == secondSms) {
    println("They are equal!")
  }

  println("SMS is: " + firstSms)

  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        "You got an email from " + email + " with title: " + title
      case SMS(number, message) =>
        "You got an SMS from " + number + "! Message: " + message
      case VoiceRecording(name, link) =>
        "you received a Voice Recording from " + name + "! Click the link to hear it: " + link
    }
  }
  val someSms = SMS("12345", "Are you there?")
  val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")

  println(showNotification(someSms))
  println(showNotification(someVoiceRecording))

  // println(showNotification(MorseCode("bip bip bip"))) // wil throw an exception
  // prints:
  // You got an SMS from 12345! Message: Are you there?
  // you received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123




  def showNotificationSpecial(notification: Notification, specialEmail: String, specialNumber: String): String = {
    notification match {
      case Email(email, _, _) if email == specialEmail =>
        "You got an email from special someone!"
      case SMS(number, _) if number == specialNumber =>
        "You got an SMS from special someone!"
      case other =>
        showNotification(other) // nothing special, delegate to our original showNotification function
    }
  }

  val SPECIAL_NUMBER = "55555"
  val SPECIAL_EMAIL = "jane@mail.com"
  //val someSms = SMS("12345", "Are you there?")
  //val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
  val specialEmail = Email("jane@mail.com", "Drinks tonight?", "I'm free after 5!")
  val specialSms = SMS("55555", "I'm here! Where are you?")

  println(showNotificationSpecial(someSms, SPECIAL_EMAIL, SPECIAL_NUMBER))
  println(showNotificationSpecial(someVoiceRecording, SPECIAL_EMAIL, SPECIAL_NUMBER))
  println(showNotificationSpecial(specialEmail, SPECIAL_EMAIL, SPECIAL_NUMBER))
  println(showNotificationSpecial(specialSms, SPECIAL_EMAIL, SPECIAL_NUMBER))

  // prints:
  // You got an SMS from 12345! Message: Are you there?
  // you received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123
  // You got an email from special someone!
  // You got an SMS from special someone!
}
