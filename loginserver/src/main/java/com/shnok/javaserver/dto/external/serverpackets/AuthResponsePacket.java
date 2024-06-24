package com.shnok.javaserver.dto.external.serverpackets;

import com.shnok.javaserver.dto.external.ServerPacket;
import com.shnok.javaserver.enums.ServerPacketType;

public class AuthResponsePacket extends ServerPacket {

    public AuthResponsePacket(AuthResponseType reason) {
        super(ServerPacketType.AuthResponse.getValue());
        writeB((byte) reason.ordinal());
        buildPacket();
    }

    public enum AuthResponseType {
        ALLOW,
        ALREADY_CONNECTED,
        INVALID_USERNAME
    }
}
