package CommandPattern;

class tvDecreaseVolume implements RemoteCommand {
	
	public tvDecreaseVolume(RemoteReceiver remote) {
		this.remote = remote;
	}
	
	private RemoteReceiver remote;
	
	@Override
	public void execute() {
		remote.Decrease();
	}
}