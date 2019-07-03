package org.alie.designmode.builder;

/**
 * Created by Alie on 2019/7/3.
 * 类描述
 * 版本
 */
public class Room {
    private String mWall;
    private String mFloor;
    private String mRoof;

    public Room() {
    }

    public void apply(RoomBuilder.RoomParam roomParam) {
        this.mWall = roomParam.mWall;
        this.mFloor = roomParam.mFloor;
        this.mRoof = roomParam.mRoof;
    }

    @Override
    public String toString() {
        return "Room{" +
                "mWall='" + mWall + '\'' +
                ", mFloor='" + mFloor + '\'' +
                ", mRoof='" + mRoof + '\'' +
                '}';
    }
}
