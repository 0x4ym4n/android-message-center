package com.usepace.android.messagingcenter.model;

import com.sendbird.android.BaseMessage;

public class SendBirdMessage {

    private BaseMessage baseMessage = null;

    public SendBirdMessage(BaseMessage baseMessage) {
        this.baseMessage = baseMessage;
    }

    public BaseMessage getBase() {
        return baseMessage;
    }

    public long getMessageId() {
        if (baseMessage != null) {
            return baseMessage.getMessageId();
        }
        return -1;
    }

    public byte[] serialize() {
        if (baseMessage != null) {
            return baseMessage.serialize();
        }
        return new byte[0];
    }

    public long getCreatedAt() {
        if (baseMessage != null) {
            return baseMessage.getCreatedAt();
        }
        return -1;
    }

    public static SendBirdMessage buildFromSerializedData(byte[] data) {
        return new SendBirdMessage(BaseMessage.buildFromSerializedData(data));
    }
}
