package kodNest;

public class polymorphism_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is called upcasting 
		//Reference variable  of Parent hold the child object 
		
		System.out.println("This is using UPCASTING...");
		    Message text = new TextMessage();
		    text.send();
		    Message voice = new VoiceMessage();
		    voice.send();
		    Message video = new VideoMessage();
		    video.send();
		
		    System.out.println();
		    System.out.println("This is using POLYMORPHISM...");
		//Here we can use polymorphism
		    Message msg;
		    msg= new TextMessage();
		    msg.send();
		    msg = new VoiceMessage();
		    msg.send();
		    msg= new VideoMessage();
		    msg.send();
	}

}
class Message {
    void send() {
        System.out.println("Message sent.");
    }
}

class TextMessage extends Message {
    void send() {
        System.out.println("Text message sent.");
    }
}

class VoiceMessage extends Message {
    void send() {
        System.out.println("Voice message sent.");
    }
}

class VideoMessage extends Message {
    void send() {
        System.out.println("Video message sent.");
    }
}
