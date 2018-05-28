package name.sukhoykin.cryptic.command;

import org.bouncycastle.util.encoders.Hex;

import name.sukhoykin.cryptic.CommandMessage;

public class DebugMessage extends CommandMessage {

    private String data;

    public DebugMessage() {
        super("debug");
    }

    public void setData(byte[] data) {
        this.data = Hex.toHexString(data);
    }

    public byte[] getData() {
        return Hex.decode(data);
    }
}
