

package messagegenaration;
import java.util.Random;


class M {

	 public int source, destination, TTL;
}

public class MessageGenaration {

   
    public static void main(String[] args) {
        int msg_id, msgsource, msgdestination, Max=12, Min=1, ttl=7 ;
		
		M Message[] = new M [10];
		
		Random random1 = new Random();
		
		
		for(msg_id=0; msg_id<Message.length; msg_id++){
                    
                msgsource = random1.nextInt(Max-Min);
		msgdestination = random1.nextInt(Max-Min);
		    
				
		Message [msg_id] = new M();
		Message[msg_id].source= msgsource;
                Message[msg_id].destination= msgdestination;
                Message[msg_id].TTL= ttl;
                
                System.out.println("The source of the message is" +msgsource);
                System.out.println("The destination of the message is" +msgdestination);
                System.out.println("The TTL of the message is" +ttl);
				
		}
			
		
    }
    
}
