package CommandPattern;

class tvIncreaseVolume implements RemoteCommand {
	
	public tvIncreaseVolume(RemoteReceiver remote) {
		this.remote = remote;
	}
	
	private RemoteReceiver remote;
	
	@Override
	public void execute() {
		remote.Increase();
	}
}
