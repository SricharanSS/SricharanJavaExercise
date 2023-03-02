package CommandPattern;


public class Main {
	public static void main(String[] args) {
		
		RemoteReceiver remoteReceiver = new TV();
		RemoteCommand remoteCommand = new tvIncreaseVolume(remoteReceiver);
		
		RemoteInvoker remoteInvoker = new RemoteInvoker(remoteCommand);
		
		remoteInvoker.execute();
	}
}
