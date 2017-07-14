package state;

/**
 * Created by 平 on 2017/7/6.
 */
//足球的状态改变为空间坐标的变换
public class Position {

    private Integer X;

    private Integer Y;

    private Integer Z;

    public Position(){}

    public Position(Integer x, Integer y, Integer z) {
        X = x;
        Y = y;
        Z = z;
    }

    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }

    public Integer getZ() {
        return Z;
    }

    public void setZ(Integer z) {
        Z = z;
    }

    public String toString(){
        return "(" + X +", "+ Y + ", " + Z + ")";
    }
}
