public class NotificationFactory {
    public Notification createNotification(String channel){
        if(channel == null || channel.isEmpty()){
            return null;
        }
        switch(channel){
            case "PUSH":
                return new PushNotification();
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotifiction();
            default:
                throw new IllegalArgumentException("Invalid channel" + channel);
        }

        //and many more computation...
    }
}
