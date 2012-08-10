package org.jmangos.realm.network.netty.packetClient.server;

import org.jmangos.realm.network.netty.packetClient.AbstractWoWServerPacket;

/**
 * Created with IntelliJ IDEA.
 * User: Goofy
 * Date: 2012.08.08.
 * Time: 3:58
 * To change this template use File | Settings | File Templates.
 */
public class MSG_MOVE_TIME_SKIPPED extends AbstractWoWServerPacket {

    private long guid;
    private int time_dif;

    public MSG_MOVE_TIME_SKIPPED(){}

    public MSG_MOVE_TIME_SKIPPED( long guid, int time_dif ) {
        this.guid = guid;
        this.time_dif = time_dif;
    }

    @Override
    protected void writeImpl() {
        writeQ( guid );
        writeD( time_dif );
    }
}