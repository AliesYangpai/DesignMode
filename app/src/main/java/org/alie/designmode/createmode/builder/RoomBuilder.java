package org.alie.designmode.createmode.builder;

/**
 * Created by Alie on 2019/7/3.
 * 类描述 建造者模式
 * 版本
 */
public class RoomBuilder {
    private RoomParam mRoomParam; // 目标对象的属性副本，这里可以直接使用一个内部类就ok了

    public RoomBuilder() {
        this.mRoomParam = new RoomParam();
    }

    public RoomBuilder addWall(String wallName) {
        this.mRoomParam.mWall = wallName;
        return this;
    }

    public RoomBuilder addFloor(String floorName) {
        this.mRoomParam.mFloor = floorName;
        return this;
    }


    public RoomBuilder addRoof(String roofName) {
        this.mRoomParam.mRoof = roofName;
        return this;
    }

    public Room build() {
        Room room = new Room();
        room.apply(mRoomParam);
        return room;
    }

    class RoomParam {
        protected String mWall;
        protected String mFloor;
        protected String mRoof;
    }
}
