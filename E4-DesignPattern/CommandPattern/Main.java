package CommandPattern;


public class Main {
	public static void main(String[] args) {
		
		RemoteReceiver remoteReceiver = new TV();
		
		RemoteCommand remoteCommand1 = new tvOnCommand(remoteReceiver);
		RemoteInvoker remoteInvoker1 = new RemoteInvoker(remoteCommand1);
		remoteInvoker1.execute();
		
		RemoteCommand remoteCommand2 = new tvIncreaseVolume(remoteReceiver);
		RemoteInvoker remoteInvoker2 = new RemoteInvoker(remoteCommand2);
		remoteInvoker2.execute();
		
		RemoteCommand remoteCommand3 = new tvDecreaseVolume(remoteReceiver);
		RemoteInvoker remoteInvoker3 = new RemoteInvoker(remoteCommand3);
		remoteInvoker3.execute();
		
		RemoteCommand remoteCommand4 = new tvOffCommand(remoteReceiver);
		RemoteInvoker remoteInvoker4 = new RemoteInvoker(remoteCommand4);
		remoteInvoker4.execute();
		
	}
}
