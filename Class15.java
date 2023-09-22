class CCircle {
    double radius;

    // 构造函数，用于设置半径
    public CCircle(double r) {
        radius = r;
    }
}

public class Class15 {
    // 计算CCircle对象数组中radius成员的平均值
    public static double average(CCircle c[]) {
        double total = 0;
        for (int i = 0; i < c.length; i++) {
            total += c[i].radius;
        }
        return total / c.length;
    }

    public static void main(String[] args) {
        // 创建一个CCircle对象数组并初始化
        CCircle[] circles = new CCircle[3];
        circles[0] = new CCircle(2.5);
        circles[1] = new CCircle(3.0);
        circles[2] = new CCircle(4.2);

        // 调用average函数计算平均radius
        double avgRadius = average(circles);
        // 输出平均值
        System.out.println("CCircle 对象数组中的 radius 平均值为：" + avgRadius);
    }
}
